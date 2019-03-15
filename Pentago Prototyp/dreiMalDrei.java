
/**
 * Beschreiben Sie hier die Klasse dreiMalDrei.
 * 
 * @author (Merlin) 
 * @version (03.03.2019)
 */
public class dreiMalDrei
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public int[][] dreiMalDrei;

    /**
     * Konstruktor für Objekte der Klasse dreiMalDrei
     */
    public dreiMalDrei()
    {
        // Instanzvariable initialisieren
        dreiMalDrei = new int[3][3];
        
        for ( int i = 0; i < 3; i++ ) {
            for ( int j = 0; j < 3; j++ ) {
                dreiMalDrei[i][j] = 0;
            }
        }
    }
    
    /**
     * Eine Variable des Arrays dreiMalDrei an der Stelle [i][j], wird je nach Wert des Parameters aktS auf 0 oder 1 gesetzt
     * 
     * @param  i    in der i-ten Spalte
     * @param  j        in der j-ten Zeile
     * @param  aktS     der Wert für den aktuellenSpieler (0 oder1)
     */
    public void setzeStein(int i, int j, int aktS)
    {
        // tragen Sie hier den Code ein
        if ( dreiMalDrei[i][j] == 0 ) {
            dreiMalDrei[i][j] = aktS;
        }
    }

    /**
     * Diese Methode wird aufgerufen, wenn ein drei mal drei Feld gedreht werden soll
     * 
     * @param  cw  = true, wenn das Feld mit der Uhr (clock-wise) gedreht werden soll
     */
    public void rotateFeld(boolean cw)
    {
        // tragen Sie hier den Code ein
        if (cw) {
            rotateCw();
        } else if (!cw) {
            rotateCcw();
        }
    }
    
    /**
     * Hilfsmethode für rotateFeld()
     */
    private void rotateCw()
    {
        int tmp = dreiMalDrei[0][0];
        dreiMalDrei[0][0] = dreiMalDrei[0][2];
        dreiMalDrei[0][2] = dreiMalDrei[2][2];
        dreiMalDrei[2][2] = dreiMalDrei[2][0];
        dreiMalDrei[2][0] = tmp;
        
        tmp = dreiMalDrei[0][1];
        dreiMalDrei[0][1] = dreiMalDrei[1][0];
        dreiMalDrei[1][0] = dreiMalDrei[2][1];
        dreiMalDrei[2][1] = dreiMalDrei[1][2];
        dreiMalDrei[1][2] = tmp;
    }
    
    /**
     * Hilfsmethode für rotateFeld()
     */
    private void rotateCcw()
    {
        rotateCw();
        rotateCw();
        rotateCw();
    }
    
    public int getWert(int k, int l)
    {
        return dreiMalDrei[k][l];
    }
}
