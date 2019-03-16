
/**
 * Beschreiben Sie hier die Klasse Computer.
 * 
 * @author (Merlin) 
 * @version (03.03.2019)
 */
public class Computer extends Spieler
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Pentago myPentago;
    private String name;
    private Spielfeld mySpielfeld;
    public boolean zugFertig, steinGesetzt, feldGedreht;

    /**
     * Konstruktor für Objekte der Klasse Computer
     */
    public Computer(String n, Spielfeld s, Pentago spiel)
    {
        // Instanzvariable initialisieren
        myPentago = spiel;
        name = n;
        zugFertig = false;
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
    
    public String getName(){
        return name;
    }
}
