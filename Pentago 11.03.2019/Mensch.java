
/**
 * Beschreiben Sie hier die Klasse Mensch.
 * 
 * @author (Merlin) 
 * @version (11.03.2019)
 */
public class Mensch extends Spieler
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Pentago myPentago;
    private Spielfeld mySpielfeld;
    
    public boolean zugFertig, steinGesetzt, feldGedreht;
    
    private String name;
    /**
     * Konstruktor für Objekte der Klasse Mensch
     */
    public Mensch(String n, Spielfeld s, Pentago spiel)
    {
        // Instanzvariable initialisieren
        zugFertig = false;
        steinGesetzt = false;
        feldGedreht = false;
        
        myPentago = spiel;
        mySpielfeld = s;
        
        name = n;
    }
    
    public void resetteBooleanWerte()
    {
        zugFertig = false;
        steinGesetzt = false;
        feldGedreht = false;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void macheSpielzug()
    {
        if ( !steinGesetzt ) {
            feldWaehlen();
        }
      
        if ( steinGesetzt && !feldGedreht ) {
            dreiMalDreiDrehen();
        }
        
        
    }
    
    private void feldWaehlen()
    {
        int x = 0;
        int y = 0;
        
        // hier kommt noch bissl was hin keine Sorge ;)
        
        mySpielfeld.setzeStein(x, y, myPentago.getAktSn());
    }
    
    private void dreiMalDreiDrehen()
    {
        int a = 0;
        int b = 0;
        boolean cw = false;
        
        // hier kommt noch bissl was hin keine Sorge ;)
        
        mySpielfeld.feldDrehen(a, b, cw);
    }
    
    public String getName()
    {
        return name;
    }
    
    public int get(int a, int b, int c, int d)
    {
        return mySpielfeld.getAusDmd(a, b, c, d);
    }
}
