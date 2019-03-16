/**
 * Abstrakte Klasse Spieler - beschreiben Sie hier die Klasse
 * 
 * @author (Merlin)
 * @version (03.03.2019)
 */
public abstract class Spieler
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private Spielfeld mySpielfeld;
    public boolean zugFertig, steinGesetzt, feldGedreht; 

    /**
     * Der Spieler wählt ein Feld aus, setzt seinen Stein und wählt dann ein dreiMalDrei-Feld,
     * welches er drehen möchte und dreht es
     */
    public void macheSpielzug()
    {
        // tragen Sie hier den Code ein
    }
    
    public void resetteBooleanWerte()
    {
        
    }
    
    /**
     * Der Spieler wählt das Feld aus, auf das er seinenStein legen möchte
     */
    private void feldWaehlen(int x, int y)
    {
        
    }
    
    /**
     * Der Spieler wählt ein dreiMalDrei-Feld, welches er danach entweder im- oder gegen den
     * Uhrzeigersinn dreht
     */
    private void dreiMalDreiDrehen()
    {
        
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
