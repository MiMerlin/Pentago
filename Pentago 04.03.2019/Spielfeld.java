

/**
 * Ein Spielfeld besteht aus 4 3x3-Feldern die sich drehen lassen
 * 
 * @author (Merlin) 
 * @version (03.03.2019)
 */
public class Spielfeld
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private dreiMalDrei[][] feld;
    
    private int[][] prueffeld = new int[6][6];          //ein 6*6 Feld, das benötigt wird, um das Spielfeld auf 5-erKetten zu überprüfen
    
    /**
     * Konstruktor für Objekte der Klasse Spielfeld
     */
    public Spielfeld()
    {
        // Instanzvariable initialisieren
        feld = new dreiMalDrei[2][2];
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  x            die Spalte, in die der Stein platziert werden soll
     * @param  y            die Reihe, in die der Stein platziert werden soll
     * @param  aktSpieler   je nachdem welcher Spieler gerade am Spielen ist eine 1 oder eine 0, damit 
     *                          unterschiedliche Farben verwendet werden können 
     */
    public void setzeStein(int x, int y, int aktSpieler)
    {
        // tragen Sie hier den Code ein
        if ( x<3 && y<3 ) {
            feld[0][0].setzeStein(x, y, aktSpieler);
        } else if ( x>2 && y<3 ) {
            feld[1][0].setzeStein(x-3, y, aktSpieler);          //der Parameter x wird hier um 3 dekremintiert,da sonst ein Wert > 2 weitergegeben würde, was zu einem Error führen würde
        } else if ( x<3 && y>2 ) {
            feld[0][1].setzeStein(x, y-3, aktSpieler);          //der Parameter y wird hier um 3 dekremintiert,da sonst ein Wert > 2 weitergegeben würde, was zu einem Error führen würde
        } else if ( x>2 && y>2 ) {
            feld[1][1].setzeStein(x-3, y-3, aktSpieler);        //die Parameter x und y werden hier um 3 dekremintiert,da sonst ein Wert > 2 weitergegeben würde, was zu einem Error führen würde
        }
    }
    
    /**
     * Das Spielfeld wird auf fünf folgende  überprüft
     */
    public boolean sindFuenfFolgende()
    {
        int a = 0;
        int b = 0;
        
        prueffeld[a*3+0][b*3+0] = feld[a][b].getWert(0, 0);
        prueffeld[a*3+1][b*3+0] = feld[a][b].getWert(1, 0);
        prueffeld[a*3+2][b*3+0] = feld[a][b].getWert(2, 0);
        prueffeld[a*3+0][b*3+1] = feld[a][b].getWert(0, 1);
        prueffeld[a*3+1][b*3+1] = feld[a][b].getWert(1, 1);
        prueffeld[a*3+2][b*3+1] = feld[a][b].getWert(2, 1);
        prueffeld[a*3+0][b*3+2] = feld[a][b].getWert(0, 2);
        prueffeld[a*3+1][b*3+2] = feld[a][b].getWert(1, 2);
        prueffeld[a*3+2][b*3+2] = feld[a][b].getWert(2, 2);
        
        a++;
        
        prueffeld[a*3+0][b*3+0] = feld[a][b].getWert(0, 0);
        prueffeld[a*3+1][b*3+0] = feld[a][b].getWert(1, 0);
        prueffeld[a*3+2][b*3+0] = feld[a][b].getWert(2, 0);
        prueffeld[a*3+0][b*3+1] = feld[a][b].getWert(0, 1);
        prueffeld[a*3+1][b*3+1] = feld[a][b].getWert(1, 1);
        prueffeld[a*3+2][b*3+1] = feld[a][b].getWert(2, 1);
        prueffeld[a*3+0][b*3+2] = feld[a][b].getWert(0, 2);
        prueffeld[a*3+1][b*3+2] = feld[a][b].getWert(1, 2);
        prueffeld[a*3+2][b*3+2] = feld[a][b].getWert(2, 2);
        
        b++;
        
        prueffeld[a*3+0][b*3+0] = feld[a][b].getWert(0, 0);
        prueffeld[a*3+1][b*3+0] = feld[a][b].getWert(1, 0);
        prueffeld[a*3+2][b*3+0] = feld[a][b].getWert(2, 0);
        prueffeld[a*3+0][b*3+1] = feld[a][b].getWert(0, 1);
        prueffeld[a*3+1][b*3+1] = feld[a][b].getWert(1, 1);
        prueffeld[a*3+2][b*3+1] = feld[a][b].getWert(2, 1);
        prueffeld[a*3+0][b*3+2] = feld[a][b].getWert(0, 2);
        prueffeld[a*3+1][b*3+2] = feld[a][b].getWert(1, 2);
        prueffeld[a*3+2][b*3+2] = feld[a][b].getWert(2, 2);
        
        a--;
        
        prueffeld[a*3+0][b*3+0] = feld[a][b].getWert(0, 0);
        prueffeld[a*3+1][b*3+0] = feld[a][b].getWert(1, 0);
        prueffeld[a*3+2][b*3+0] = feld[a][b].getWert(2, 0);
        prueffeld[a*3+0][b*3+1] = feld[a][b].getWert(0, 1);
        prueffeld[a*3+1][b*3+1] = feld[a][b].getWert(1, 1);
        prueffeld[a*3+2][b*3+1] = feld[a][b].getWert(2, 1);
        prueffeld[a*3+0][b*3+2] = feld[a][b].getWert(0, 2);
        prueffeld[a*3+1][b*3+2] = feld[a][b].getWert(1, 2);
        prueffeld[a*3+2][b*3+2] = feld[a][b].getWert(2, 2);
        
        if ( fuenfSenkrecht() || fuenfWaagrecht() || fuenfDiagAufsteigend() || fuenfDiagAbsteigend() ){
            return true;
        } else {
             return false;
        }       
    }
    
    private boolean fuenfSenkrecht()
    {
        for ( int i = 0; i < 6; i++ ) {
            for ( int j = 0; j < 2; j++ ) {
                int probeWert = prueffeld[i][j];
                if ( prueffeld[i][j+1] == probeWert && prueffeld[i][j+2] == probeWert && prueffeld[i][j+3] == probeWert && prueffeld[i][j+4] == probeWert ) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean fuenfWaagrecht()
    {
        for ( int i = 0; i < 2; i++ ) {
            for ( int j = 0; j < 6; j++ ) {
                int probeWert = prueffeld[i][j];
                if ( prueffeld[i+1][j] == probeWert && prueffeld[i+2][j] == probeWert && prueffeld[i+3][j] == probeWert && prueffeld[i+4][j] == probeWert ) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean fuenfDiagAufsteigend()
    {
        for ( int i = 0; i < 2; i++ ) {
            for ( int j = 4; j < 6; j++ ) {
                int probeWert = prueffeld[i][j];
                if ( prueffeld[i+1][j-1] == probeWert && prueffeld[i+2][j-2] == probeWert && prueffeld[i+3][j-3] == probeWert && prueffeld[i+4][j-4] == probeWert ) {
                    return true;
                } 
            }
        }
        
        return false;
    }
    
    private boolean fuenfDiagAbsteigend()
    {
        for ( int i = 0; i < 2; i++ ) {
            for ( int j = 0; j < 2; j++ ) {
                int probeWert = prueffeld[i][j];
                if ( prueffeld[i+1][j+1] == probeWert && prueffeld[i+2][j+2] == probeWert && prueffeld[i+3][j+3] == probeWert && prueffeld[i+4][j+4] == probeWert ) {
                    return true;
                } 
            }
        }
        
        return false;
    }
}
