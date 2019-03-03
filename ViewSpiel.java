import java.awt.*;
import javax.swing.*;

/**
 * Spiel Fenster
 */

public class ViewSpiel extends JFrame {
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
    public ViewSpiel() {
        super ("Pentago v.1.0");        
        ControllerSpiel myControllerMain = new ControllerSpiel(this);
        getContentPane().setLayout(myBorderLayout);
                
        //Hier wird der Hintergrund entworfen
        spielFenster.setLayout(null);
        spielFenster.setBackground(Color.orange);
        
        //Hier wird das Spielfeld entworfen
        spielFeld.setLayout(null);
        spielFeld.setBackground(Color.green);
        spielFeld.setBounds(415, 75, 750, 725);
        
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
        
        lblPlayerOne.setText("Gerda");
        lblPlayerOne.setFont(text);
        lblPlayerOne.setBounds(new Rectangle(30, 170, 235, 30));
        
        lblPlayerTwo.setText("Angela von Bdolf");
        lblPlayerTwo.setFont(text);
        lblPlayerTwo.setBounds(new Rectangle(30, 220, 235, 30));
        
        lblAmZug.setText("Am Zug:");
        lblAmZug.setFont(ueberschrift);
        lblAmZug.setBounds(new Rectangle(30, 350, 100, 30));
        
        lblAktSpieler.setText("Angela von Bdolf");
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
        //btnExit.addActionListener(myController);
              
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
}

