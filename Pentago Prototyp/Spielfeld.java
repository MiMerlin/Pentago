        
            /**
             * Ein Spielfeld besteht aus 4 3x3-Feldern die sich drehen lassen
             */
            public class Spielfeld
            {
                private dreiMalDrei[][] feld;
                
                private int[][] prueffeld;          //ein 6*6 Feld, das benötigt wird, um das Spielfeld auf 5-erKetten zu überprüfen
                
                /**
                 * Konstruktor für Objekte der Klasse Spielfeld
                 */
                public Spielfeld()
                {
                    // Instanzvariable initialisieren
                    feld = new dreiMalDrei[2][2];
                    
                    /**feld[0][0] = new dreiMalDrei();
                    feld[0][0] = new dreiMalDrei();
                    feld[0][0] = new dreiMalDrei();
                    feld[0][0] = new dreiMalDrei();*/
                    
                    for ( int i = 0; i < 2; i++ ) {
                        for ( int j = 0; j < 2; j++ ) {
                            feld[i][j] = new dreiMalDrei();
                        }
                    }
                    
                    prueffeld = new int[6][6];
                    for ( int i = 0; i < 6; i++ ) {
                        for ( int j = 0; j < 6; j++ ) {
                            prueffeld[i][j] = 0;
                        }
                    }
                }
            
                /**
                 * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
                 * 
                 * @param  x            die Spalte, in die der Stein platziert werden soll
                 * @param  y            die Reihe, in die der Stein platziert werden soll
                 * @param  aktSpieler   je nachdem welcher Spieler gerade am Spielen ist eine 1 oder eine 2, damit 
                 *                          unterschiedliche Farben verwendet werden können 
                 */
                public void setzeStein(int x, int y, int aktSpieler)
                {
                    if ( x<3 && y<3 ) {
                        feld[0][0].setzeStein(x, y, aktSpieler);
                    } else if ( x>2 && y<3 ) {
                        feld[0][1].setzeStein(x-3, y, aktSpieler);          //der Parameter x wird hier um 3 dekremintiert,da sonst ein Wert > 2 weitergegeben würde, was zu einem Error führen würde
                    } else if ( x<3 && y>2 ) {
                        feld[1][0].setzeStein(x, y-3, aktSpieler);          //der Parameter y wird hier um 3 dekremintiert,da sonst ein Wert > 2 weitergegeben würde, was zu einem Error führen würde
                    } else if ( x>2 && y>2 ) {
                        feld[1][1].setzeStein(x-3, y-3, aktSpieler);        //die Parameter x und y werden hier um 3 dekremintiert,da sonst ein Wert > 2 weitergegeben würde, was zu einem Error führen würde
                    }
                }
                
                /**
                 * Das Spielfeld wird auf fünf folgende  überprüft
                 */
                public boolean sindFuenfFolgende()
                {
                    vondmdinsms();
                    
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
                            if ( prueffeld[i][j+1] == probeWert && prueffeld[i][j+2] == probeWert &&
                                    prueffeld[i][j+3] == probeWert && prueffeld[i][j+4] == probeWert &&
                                    probeWert != 0 ) {
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
                            if ( prueffeld[i+1][j] == probeWert && prueffeld[i+2][j] == probeWert &&
                                prueffeld[i+3][j] == probeWert && prueffeld[i+4][j] == probeWert &&
                                    probeWert != 0 ) {
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
                            if ( prueffeld[i+1][j-1] == probeWert && prueffeld[i+2][j-2] == probeWert &&
                                prueffeld[i+3][j-3] == probeWert && prueffeld[i+4][j-4] == probeWert &&
                                    probeWert != 0 ) {
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
                            if ( prueffeld[i+1][j+1] == probeWert && prueffeld[i+2][j+2] == probeWert && 
                                prueffeld[i+3][j+3] == probeWert && prueffeld[i+4][j+4] == probeWert &&
                                    probeWert != 0 ) {
                                return true;
                            } 
                        }
                    }
        
                    return false;
                }
                
                /**
                 * die Werte jedes drei-mal-dreiFEldes warden in ein großes sechs-mal-sechs-Feld kopiert
                 */   
                private void vondmdinsms()
                {
                    for ( int a = 0; a < 2; a++ ) {
                        for ( int b = 0; b < 2; b++ ) {
                            prueffeld[a*3+0][b*3+0] = feld[a][b].getWert(0, 0);
                            prueffeld[a*3+0][b*3+1] = feld[a][b].getWert(1, 0);
                            prueffeld[a*3+0][b*3+2] = feld[a][b].getWert(2, 0);
                            
                            prueffeld[a*3+1][b*3+0] = feld[a][b].getWert(0, 1);
                            prueffeld[a*3+1][b*3+1] = feld[a][b].getWert(1, 1);
                            prueffeld[a*3+1][b*3+2] = feld[a][b].getWert(2, 1);
                            
                            prueffeld[a*3+2][b*3+0] = feld[a][b].getWert(0, 2);
                            prueffeld[a*3+2][b*3+1] = feld[a][b].getWert(1, 2);
                            prueffeld[a*3+2][b*3+2] = feld[a][b].getWert(2, 2);
                        }
                    }
                }
    
                /**
                 * Gib den wert des angegebenen Feldes (c & d) des gewählten drei-mal-drei-Feldes (a & b) zurück
                 * 
                 * @param  a    Position des drei-mal-drei-Feldes in der Waagrechten
                 * @param  b    Position des drei-mal-drei-Feldes in der Senkrechten
                 * @param  c    x-Position des Feldes im gewählten drei.mal-drei-Feld
                 * @param  d    y-Position des Feldes im gewählten drei.mal-drei-Feld
                 */
                public int getAusDmd(int a, int b, int c, int d)
                {
                     return feld[a][b].getWert(c, d);
                }
                
                public int getAusPruef(int x, int y)
                {
                    vondmdinsms();
                    
                    //System.out.println("Befehl erreicht: Spielfeld");
                    int p = prueffeld[x][y];
                    //System.out.println("Sende zurueck : " + p);
                    return p;
                }
                   
                public void feldDrehen(int a, int b, boolean cw)
                {
                    feld[b][a].rotateFeld(cw);   
                }
                
                public void printOutFeld()
                {
                    for ( int i = 0; i < 6; i++ ) {
                        for ( int j = 0; j < 6; j++ ) {
                                System.out.print(prueffeld[i][j]+"; "); 
                        }
                        System.out.println("");
                    }
                }
}
