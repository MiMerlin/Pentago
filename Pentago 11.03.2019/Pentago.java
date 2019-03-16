import java.awt.event.*;

/**
 * Pentago ist ein Spiel, bei dem es ein Spielfeld gibt, das aus 4 3x3-Feldern besteht, die sich jeweils drehen lassen. 2 Spieler 
 * spielen gegeneinander, indem immer ein Spieler einen Stein auf eins der 3x3-Felder legt und anschließend ein 
 * beliebiges 3x3-Feld in eine beliebige Richtung um 90 Grad dreht.
 * Gewonnen hat der Spieler der zuerst fünf seiner Steine in einer Reihe (Waagrecht, Senkrecht oder Diagonal) hat.
 * 
 * @author (Merlin, Erik) 
 * @version (11.03.2019)
 */
public class Pentago
{   
    private Spieler spieler1;
    private Spieler spieler2;
    private Spieler aktSpieler; 
    private Spielfeld meinSpielfeld;
    
    private ControllerSpiel mySpielController;
    
    private int aktSn;
    private int anzahlRunden;
    /**
     * Konstruktor für Objekte der Klasse Pentago
     * 
     * @param  s1   Name für Spieler 1
     * @param  s2   Name für Spieler 2
     * @param  z    anzahl menschlicher Spieler
     */
    public Pentago(String s1, String s2, int z, ControllerSpiel mySC)
    {
        // Instanzvariable initialisieren
        mySpielController = mySC;

        meinSpielfeld = new Spielfeld();    
       
        //Der im GUI angegebene Name wird weitergeleitet
        spieler1 = new Mensch( s1, meinSpielfeld, this);            //Spieler1 ist IMMER ein Mensch und kann somit problemlos erzeugt werden
        if ( z == 2 ) {
            //Der im GUI angegebene Name wird weitergeleitet
            spieler2 = new Mensch(s2, meinSpielfeld, this);
        } else {
            spieler2 = new Computer(s2, meinSpielfeld, this);
        }
        
        aktSpieler = spieler1;
        aktSn = 1;      //eine Variable der Klasse Integer, die dem Spielfeld übergeben wird, damit dieses weiß, welche Farbe ein einzusetzender Stein haben soll
        anzahlRunden = 0;
        
        mySpielController.gibSpielfeldAnViewSpiel(this);
        
        rundeSpielen();
    }

    /**
     * Die Methode rundeSpielen() wird so lange ausgeführt, bis einer der beiden Spieler gewonnen hat
     */
    public void rundeSpielen()
    {
        while ( !meinSpielfeld.sindFuenfFolgende() ) {
            if ( !aktSpieler.steinGesetzt ) {
                aktSpieler.macheSpielzug();
                mySpielController.updateFeld("place mode");
            }
            
            if ( aktSpieler.steinGesetzt && !aktSpieler.feldGedreht ) {
                aktSpieler.macheSpielzug();
                //mySpielController.updateFeld("rotate mode");
            }
            
            if ( aktSpieler.zugFertig ) {
               //der aktive Spieler soll all seine boolean-Werte zurücksetzen
               aktSpieler.resetteBooleanWerte();
               //der aktuell passive Spieler wird mit dem aktuell aktiven Spieler getauscht
                if ( aktSpieler == spieler1 ) {
                   aktSpieler = spieler2;
                   aktSn = 2;
               } else {
                   aktSpieler = spieler1;
                   aktSn = 1;
               }
            }
        }
    }
    
    public String getAktSpieler()
    {
        return aktSpieler.getName();
    }
    
    public String getS1()
    {
      return spieler1.getName();   
    }
    
    public String getS2()
    {
      return spieler2.getName();   
    }
    
    public int getAktSn()
    {
        return aktSn;
    }
    
    public int getAusSpielfeldDmd(int a, int b, int c, int d)
    {
            return meinSpielfeld.getAusDmd(a, b, c, d);
        }
        
    public int getAusSpielfeldPruef(int x, int y)
    {
        //System.out.println("Befehl erreicht: Pentago");
        int p = meinSpielfeld.getAusPruef(x, y);
        //System.out.println("Pentago sendet zurueck : " + p);
        return p;    
        }
}