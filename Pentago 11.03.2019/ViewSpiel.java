import java.awt.*;
import javax.swing.*;

/**
 * Spiel Fenster
 * 
 * @author (Bastian, Merlin, Erik)
 * @version (07.03.2019)
 */

public class ViewSpiel extends JFrame {
    private String spieler1;
    private String spieler2;
    private int anzahlSpieler;
    
    private AL al;
    private ControllerSpiel myControllerSpiel;
    
    private Spielfeld spielfeld;
    
    //Die Schriftarten werden deklariert und initialisiert
    Font menue = new Font("Arial", Font.BOLD, 50);
    Font button = new Font("Arial", Font.ITALIC, 25);
    Font text = new Font("Arial", Font.ITALIC, 25);
    Font logo = new Font("Ar Destine", Font.BOLD, 60);
    Font ueberschrift = new Font("Arial", Font.ITALIC + Font.BOLD, 25);
    
    //Die verschiedenen Panels werden deklariert
    JPanel spielFenster = new JPanel();
    JPanel spielFeld = new JPanel();
    JPanel spielLeisteLinks = new JPanel();
    JPanel spielLeisteRechts = new JPanel();
    
    //Die Textfelder der Panels werden deklariert
    JLabel lblSpieler = new JLabel();
    JLabel lblPlayerOne = new JLabel();
    JLabel lblPlayerTwo = new JLabel();
    JLabel lblAmZug = new JLabel();
    JLabel lblZeit = new JLabel();
    JLabel lblMenue = new JLabel();
    JLabel lblAktZeit = new JLabel();
    JLabel lblLogo = new JLabel();
    JLabel lblAktSpieler = new JLabel();
    JLabel lblBy = new JLabel();
    JLabel lblEntwickler = new JLabel();
    
    //Die Buttons der Panels werden deklariert
    JButton btnRegeln = new JButton();
    JButton btnNeueRunde = new JButton();
    JButton btnExit = new JButton();
    JButton btnPause = new JButton();

    BorderLayout myBorderLayout = new BorderLayout();
    public ViewSpiel(String s1, String s2, int z) {
        super ("Pentago v.1.0");  
        
        al = new AL();
        myControllerSpiel = new ControllerSpiel(this, s1, s2, z);
        getContentPane().setLayout(myBorderLayout);
            
        this.addMouseListener(al);
        
        viewSpiel();
    }
    
    public void viewSpiel()
    {
        //Hier wird der Hintergrund entworfen
        spielFenster.setLayout(null);
        spielFenster.setBackground(Color.orange);
        
        //Hier wird das Spielfeld entworfen
        spielFeld.setLayout(null);
        spielFeld.setBackground(Color.green);
        spielFeld.setBounds(415, 75, 750, 750);
        
        //Hier wird die Linke Spielleiste entworfen
        spielLeisteLinks.setLayout(null);
        spielLeisteLinks.setBackground(Color.red);
        spielLeisteLinks.setBounds(new Rectangle(25 , 25, 315, 825));
        
        lblMenue.setText("Menü");
        lblMenue.setFont(menue);
        lblMenue.setBounds(new Rectangle(92, 30, 200, 50));
        
        lblSpieler.setText("Spieler:");
        lblSpieler.setFont(ueberschrift);
        lblSpieler.setBounds(new Rectangle(30, 120, 100, 30));
        
        lblPlayerOne.setText(myControllerSpiel.getS1());
        lblPlayerOne.setFont(text);
        lblPlayerOne.setBounds(new Rectangle(30, 170, 235, 30));
        
        lblPlayerTwo.setText(myControllerSpiel.getS2());
        lblPlayerTwo.setFont(text);
        lblPlayerTwo.setBounds(new Rectangle(30, 220, 235, 30));
        
        lblAmZug.setText("Am Zug:");
        lblAmZug.setFont(ueberschrift);
        lblAmZug.setBounds(new Rectangle(30, 350, 100, 30));
        
        lblAktSpieler.setText(myControllerSpiel.getAS());
        lblAktSpieler.setFont(text);
        lblAktSpieler.setBounds(30, 400, 255, 30);
        
        btnRegeln.setText("REGELN");
        btnRegeln.setToolTipText("Öffnet die Regeln");
        btnRegeln.setFont(button);
        btnRegeln.setBounds(30, 530, 255, 50);
        btnRegeln.setActionCommand("exit");
        //btnregeln.addActionlistener(myController);
        
        btnNeueRunde.setText("NEUE RUNDE");
        btnNeueRunde.setToolTipText("Bricht die aktuelle Runde ab und startet eine neue");
        btnNeueRunde.setFont(button);
        btnNeueRunde.setBounds(30, 630, 255, 50);
        btnNeueRunde.setActionCommand("neueRunde");
        //btnNeueRunde.addActionListener(myController);
        
        btnExit.setText("EXIT");
        btnExit.setToolTipText("Schließt das Spiel");
        btnExit.setFont(button);
        btnExit.setBounds(30, 730, 255, 50);
        btnExit.setActionCommand("exit");
        btnExit.addActionListener(myControllerSpiel);
              
        //Hier wird die Rechte Spielleiste entworfen
        spielLeisteRechts.setLayout(null);
        spielLeisteRechts.setBackground(Color.red);
        spielLeisteRechts.setBounds(new Rectangle(1240, 25, 315, 825));
        
        lblZeit.setText("Zeit");
        lblZeit.setFont(menue);
        lblZeit.setBounds(110, 30, 200, 50);
        
        lblAktZeit.setText("09:21" + " min");
        lblAktZeit.setFont(text);
        lblAktZeit.setBounds(30, 100, 255, 30);
        
        btnPause.setText("PAUSE");
        btnPause.setToolTipText("Pausiert das Spiel");
        btnPause.setFont(button);
        btnPause.setBounds(30, 180, 255, 50);
        
        lblLogo.setText("Pentago");
        lblLogo.setFont(logo);
        lblLogo.setBounds(30, 500, 255, 80);
        
        lblBy.setText("programmed by:");
        lblBy.setFont(text);
        lblBy.setBounds(30, 580, 255, 30);
        
        lblEntwickler.setText("Merlin, Erik, Bastian");
        lblEntwickler.setFont(text);
        lblEntwickler.setBounds(30, 610, 255, 30);
        
        //Die Bestandteile der Linken Spielleiste werden hinzugefügt
        spielLeisteLinks.add(lblSpieler, null);
        spielLeisteLinks.add(lblMenue, null);
        spielLeisteLinks.add(lblPlayerOne, null);
        spielLeisteLinks.add(lblPlayerTwo, null);
        spielLeisteLinks.add(lblAmZug, null);
        spielLeisteLinks.add(lblAktSpieler, null);
        spielLeisteLinks.add(btnRegeln, null);
        spielLeisteLinks.add(btnNeueRunde, null);
        spielLeisteLinks.add(btnExit, null);
        
        //Die Bestandteile der rechten Spielleiste werden hinzugefügt
        spielLeisteRechts.add(lblZeit, null);
        spielLeisteRechts.add(lblAktZeit, null);
        spielLeisteRechts.add(btnPause, null);
        spielLeisteRechts.add(lblLogo, null);
        spielLeisteRechts.add(lblBy, null);
        spielLeisteRechts.add(lblEntwickler, null);
        
        //Die einzelnen Panels werden zum Fenster hinzugefügt
        spielFenster.add(spielFeld, null);
        spielFenster.add(spielLeisteLinks, null);
        spielFenster.add(spielLeisteRechts, null);
        
        this.getContentPane().add(spielFenster, BorderLayout.CENTER);
    }
   
    public void updateFeld(String mode)
    {
         //415, 75, 750, 750
         int displayWidth = (415+750/2)*2;
         int displayHeight = (75+750/2)*2;
         int scale = 750/2;
         
         JPanel dmd1 = new JPanel();
         dmd1.setBackground(Color.white);
         dmd1.setBounds(new Rectangle(displayWidth/2-scale, displayHeight/2-scale, scale, scale));
         spielFeld.add(dmd1, null);
         
         JPanel dmd2 = new JPanel();
         dmd2.setBackground(Color.white);
         dmd2.setBounds(new Rectangle(displayWidth/2-scale, displayHeight/2-scale, scale, scale));
         spielFeld.add(dmd2, null);
         
         JPanel dmd3 = new JPanel();
         dmd3.setBackground(Color.white);
         dmd3.setBounds(new Rectangle(displayWidth/2-scale, displayHeight/2-scale, scale, scale));
         spielFeld.add(dmd3, null);
         
         JPanel dmd4 = new JPanel();
         dmd4.setBackground(Color.white);
         dmd4.setBounds(new Rectangle(displayWidth/2-scale, displayHeight/2-scale, scale, scale));
         spielFeld.add(dmd4, null);
         
         /**if ( mode == "place mode" ) {
             System.out.println("place mode");
             for ( int a = 0; a < 2; a++ ) {
                 for ( int b = 0; b < 2; b++ ) {
                     for ( int c = 0; c < 3; c++ ) {
                         for ( int d = 0; d < 3; d++ ) {
                                System.out.println(a + ";" + b + ";" + c + ";"  + d);
                               // JPanel fancyName = new JPanel();
                                
                                int u = myControllerSpiel.getAusSpielSpielfeldDmd(a, b, c, d);
                                System.out.println(u);
                     
                               /**if ( myControllerSpiel.getAusSpielSpielfeldDmd(a, b, c, d) == 0 && al.getX() < displayWidth/2-scale+a * scale+((c+1) * (scale/16)) + ((int)(c+0.5) * (scale/4)) + scale/8) {
                                    fancyName.setBackground(Color.green); 
                                } else if ( myControllerSpiel.getAusSpielSpielfeldDmd(a, b, c, d) == 0 ) {
                                    fancyName.setBackground(Color.black); 
                                } else if ( myControllerSpiel.getAusSpielSpielfeldDmd(a, b, c, d) == 1 ) {
                                    fancyName.setBackground(Color.red); 
                                } else if ( myControllerSpiel.getAusSpielSpielfeldDmd(a, b, c, d) == 2 ) {
                                    fancyName.setBackground(Color.blue); 
                                }
                                
                                
                               // fancyName.setBounds( new Rectangle(displayWidth/2-scale+a*scale+((c+1)*(scale/16))+((int) (c+0.5)*(scale/4)), displayHeight/2-scale+b*scale+((d+1)*(scale/16))+((int) (d+0.5)*(scale/4)), scale/4, scale/4) );
                            }
                        }
                 }
             }
         } else if ( mode == "rotate mode" ) {
                
         }*/
         
         if ( mode == "place mode" ) {
             System.out.println("place mode");
             for ( int a = 1; a < 6; a++ ) {
                    
                              for ( int b = 1; b < 6; b++ ) {
                                System.out.println(a + ";" + b);
                                //System.out.println(al.getX());
                                
                                JPanel fancyName = new JPanel();
                               //int p = spielfeld.getAusPruef(x, y);
                               int p = myControllerSpiel.getAusSpielSpielfeldPruef(a, b);
                                System.out.println(": "+p);
                     
                                if ( myControllerSpiel.getAusSpielSpielfeldPruef(a, b) == 0 && al.getX() < displayWidth/2-scale+a * scale+((a+1) * (scale/16)) + ((int)(a+0.5) * (scale/4)) + scale/8) {
                                    fancyName.setBackground(Color.green); 
                                } else if ( myControllerSpiel.getAusSpielSpielfeldPruef(a, b) == 0 ) {
                                    fancyName.setBackground(Color.black); 
                                } else if ( myControllerSpiel.getAusSpielSpielfeldPruef(a, b) == 1 ) {
                                    fancyName.setBackground(Color.red); 
                                } else if ( myControllerSpiel.getAusSpielSpielfeldPruef(a, b) == 2 ) {
                                    fancyName.setBackground(Color.blue); 
                                }
                                
                                
                                fancyName.setBounds( new Rectangle(displayWidth/2-scale+a*scale+((a+1)*(scale/16))+((int) (a+0.5)*(scale/4)), displayHeight/2-scale+b*scale+((b+1)*(scale/16))+((int) (b+0.5)*(scale/4)), scale/4, scale/4) );
                                spielFeld.add(fancyName, null);
                 }
             }
             this.getContentPane().add(spielFenster, BorderLayout.CENTER);
            }
    }
    
    public void testmethod(ControllerSpiel myCs)
    {
        myControllerSpiel = myCs;
    }
}
