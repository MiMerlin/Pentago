import java.awt.event.*;

/**
 * Pentago es gibt ein Spielfeld, das aus 4 3x3-Feldern besteht, die sich jeweils drehen lassen. 2 Spieler 
 * spielen gegeneinander, indem immer ein Spieler einen stein auf eins der 3x3-Felder legt und anschließend ein 
 * beliebiges 3x3-Feld in eine beliebigeRichtung um 90 Grad dreht.
 * Gewonnen hat der Spieler der zuerst fünf seiner Steine in einer Reihe (Waagrecht, Senkrecht oder Diagonal) hat.
 * 
 * @author (Merlin) 
 * @version (03.03.2019)
 */
public class Pentago
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Spieler spieler1;
    private Spieler spieler2;
    private Spieler aktSpieler; 
    private Spielfeld meinSpielfeld;
    
    private int anzahlRunden;
    /**
     * Konstruktor für Objekte der Klasse Pentago
     */
    public Pentago(String s1, String s2, int z)
    {
        // Instanzvariable initialisieren
        anzahlRunden = 0;
        meinSpielfeld = new Spielfeld();
        
        //Der im GUI angegebene Name wird weitergeleitet
        spieler1 = new Mensch( s1, meinSpielfeld );            //Spieler1 ist IMMER ein Mensch und kann somit problemlos erzeugt werden
        if ( z == 2 ) {
            //Der im GUI angegebene Name wird weitergeleitet
            spieler2 = new Mensch(s2, meinSpielfeld);
        } else {
            spieler2 = new Computer(s2, meinSpielfeld);
        }
        
        aktSpieler = spieler1;
    }

    /**
     * Die Methode rundeSpielen() wird so lange ausgeführt, bis einer der beiden Spieler gewonnen hat
     */
    public void rundeSpielen()
    {
        // tragen Sie hier den Code ein
        int aktSn = 0;           //eine Variable der Klasse Integer, die dem Spielfeld übergeben wird, damit dieses weiß, welche Farbe ein einzusetzender Stein haben soll
        
        while ( !meinSpielfeld.sindFuenfFolgende() ) {
            if ( aktSpieler == spieler1 ) {
                aktSn = 2;
            } else {
                aktSn = 1;
            }
            
            aktSpieler.macheSpielzug();
            
            if ( aktSpieler.zugFertig ) {
                
            }
        }
    }
}
