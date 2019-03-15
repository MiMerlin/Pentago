
/**
 * Pentago ist ein Spiel, bei dem es ein Spielfeld gibt, das aus 4 3x3-Feldern besteht, die sich jeweils drehen lassen. 2 Spieler 
 * spielen gegeneinander, indem immer ein Spieler einen Stein auf eins der 3x3-Felder legt und anschließend ein 
 * beliebiges 3x3-Feld in eine beliebige Richtung um 90 Grad dreht.
 * Gewonnen hat der Spieler der zuerst fünf seiner Steine in einer Reihe (Waagrecht, Senkrecht oder Diagonal) hat.
 */
public class Pentago
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Spielfeld spielfeld;
    private Mensch spieler1;
    private Mensch spieler2;
    
    private Mensch aktSpieler;
    /**
     * Konstruktor für Objekte der Klasse Pentago
     * 
     * @param  pNameS1  Ein Name für Spieler 1
     * @param  pNameS2  Ein Name für Spieler 2
     */
    public Pentago(String pNameS1, String pNameS2)
    {
        // Instanzvariable initialisieren
        spielfeld = new Spielfeld();
        
        spieler1 = new Mensch(spielfeld, pNameS1, 1);
        spieler2 = new Mensch(spielfeld, pNameS1, 2);
        
        aktSpieler = spieler1;
    }

    /**
     * der aktuelle Spieler setzt einen Stein
     * !Achtung! die angaben sind für ein sechs-mal-sechs-Feld und werden automatisch ins
     * richtige drei-mal-drei-Feld eingetragen
     * 
     * @param  x    0 <= X <= 5
     * @param  y    0 <= Y <= 5
     */
    public void aktSpielerSetze(int x, int y)
    {
        // tragen Sie hier den Code ein
        aktSpieler.setzeStein(x, y);
        if ( spielfeld.sindFuenfFolgende() ) {
            System.out.println("Spieler"+aktSpieler.getSpielerNummer()+" hat gewonnen!");
        }
        lasseFeldAusgeben();
    }
    
    /**
     * der aktuelle Spieler dreht ein drei-mal-drei-Feld
     * 
     * @param  i    = 0 für ein Feld auf der linken Seite und = 1 für ein Feld auf der rechten Seite
     * @param  j    = 0 für ein oberes Feld und = 1 für ein unteres Feld
     * @param  cw   = true, wenn mit der Uhr (clock wise) gedreht werden soll
     */
    public void aktSpielerDrehe(int i, int j, boolean cw)
    {
        aktSpieler.dmdDrehen(i, j, cw);
        lasseFeldAusgeben();
        if ( spielfeld.sindFuenfFolgende() ) {
            System.out.println("Spieler"+aktSpieler.getSpielerNummer()+" hat gewonnen!");
        }
        
        if ( aktSpieler.getSpielerNummer() == 1 ) {
            aktSpieler = spieler2;
        } else {
            aktSpieler = spieler1;
        }
        aktSpieler.resetteBooleanWerte();
        
    }
    
    /**
     * gibt den Wert des gewählten Feldes aus
     * 
     * @param  x    0 <= X <= 5
     * @param  y    0 <= Y <= 5
     */
    public int getWert(int x, int y)
    {
        return spielfeld.getAusPruef(x, y);
    }
    
    /**
     * Das Feld wird ausgegeben
     */
    public void lasseFeldAusgeben()
    {
        System.out.println();
        System.out.println("Feld ausgeben ...");
        System.out.println();
        
        spielfeld.printOutFeld();
    }
}
