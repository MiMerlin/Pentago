
/**
 * Beschreiben Sie hier die Klasse Computer.
 * 
 * @author (Merlin) 
 * @version (03.03.2019)
 */
public class Computer extends Spieler
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private Spielfeld mySpielfeld;
    public boolean zugFertig;

    /**
     * Konstruktor für Objekte der Klasse Computer
     */
    public Computer(String n, Spielfeld s)
    {
        // Instanzvariable initialisieren
        name = n;
        zugFertig = false;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void macheZug()
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
