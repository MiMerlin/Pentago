
/**
 * Ein Mensch ist ein am Spiel Pentago teilnehmender Spieler
 */
public class Mensch
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Spielfeld spielfeld;
    
    private String name;
    private int spielerNummer;
    
    private boolean steinGesetzt;
    private boolean feldGedreht;
    
    /**
     * Konstruktor für Objekte der Klasse Mensch
     */
    public Mensch(Spielfeld pFeld, String pName, int sN)
    {
        // Instanzvariable initialisieren
        spielfeld = pFeld;
        
        name = pName;
        spielerNummer = sN;
        
        resetteBooleanWerte();
    }
    
    /**
     * Die boolean-Werte "steinGesetzt" und "feldGedreht" werden auf "falsch" gesetzt 
     */
    public void resetteBooleanWerte()
    {
        steinGesetzt = false;
        feldGedreht = false;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  x    x-Position des zu setzenden Steines
     * @param  y    y-Position des zu setzenden Steines
     */
    public void setzeStein(int x, int y)
    {
        if ( !steinGesetzt ) {
            spielfeld.setzeStein(x, y, spielerNummer);
            steinGesetzt = true;
        } else {
            System.out.println("ERROR: DieserSpieler hat bereits einen Stein gesetzt und darf jetzt ein drei-mal-drei-Feld drehen");
        }
    }
    
    /**
     * Der Spieler dreht ein beliebiges drei-mal-drei-Feld
     * 
     * @param  i    x-Koordinate
     * @param  j    y-Koordinate
     * @param  cw   = true, wenn das Feld mit der Uhr (clockwise) gedreht werden soll
     */
    public void dmdDrehen(int i, int j, boolean cw)
    {
        if ( steinGesetzt ) {
            spielfeld.feldDrehen(i, j, cw);
            feldGedreht = true;
        } else {
            System.out.println("ERROR: Dieser Spieler muss erst noch einen Stein setzen, bevor er ein drei-mal-drei-Feld drehen darf");
        }
    }
    
    /**
     * Gibt die dem Spieler zugeordnete Nummer zurück
     * 
     * @return  spielerNummer   die dem Spieler zugeordnete int-Variable
     */
    public int getSpielerNummer()
    {
        return spielerNummer;
    }
}
