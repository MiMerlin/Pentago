
/**
 * Beschreiben Sie hier die Klasse Mensch.
 * 
 * @author (Merlin) 
 * @version (03.03.2019)
 */
public class Mensch extends Spieler
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private Spielfeld mySpielfeld;
    public boolean zugFertig;

    /**
     * Konstruktor für Objekte der Klasse Mensch
     */
    public Mensch(String n, Spielfeld s)
    {
        // Instanzvariable initialisieren
        name = n;
        mySpielfeld = s;
        zugFertig = false;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void macheSpielzug()
    {
        // tragen Sie hier den Code ein
        feldWaehlen();
        if ( mySpielfeld.sindFuenfFolgende() ) {
            
        }
        dreiMalDreiDrehen();
    }
    
    private void feldWaehlen()
    {
        
    }
    
    private void dreiMalDreiDrehen()
    {
        
    }
}
