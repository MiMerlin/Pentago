import java.awt.*;
import javax.swing.*;

/**
 * Beschreiben Sie hier die Klasse ViewComputer.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ViewKI extends JFrame {
    BorderLayout myBorderLayout = new BorderLayout();
    
    //Die Schriftarten werden deklariert und initialisiert
    Font ueberschrift = new Font("Arial", Font.ITALIC + Font.BOLD, 50);
    Font unterUeberschrift = new Font("Arial", Font.ITALIC +Font.BOLD, 25);
    Font text = new Font("Arial", Font.ITALIC, 25);
    Font button = new Font("Arial", Font.ITALIC, 25);
    
    //Die verschiedenen aiPanels werden deklariert
    JPanel fenster3 = new JPanel();
    
    //Die Textfelder werden deklariert
    JLabel lblUeberschrift = new JLabel();
    JLabel lblUnterUeberschrift = new JLabel();
    JLabel lblSpieler1 = new JLabel();
    JLabel lblComputer = new JLabel();
    JTextField txtSpielername1 = new JTextField();
    
    //Die Buttons werden deklariert
    JButton btnStart = new JButton();
    
   public ViewKI() {
        super ("Pentago Launcher");        
        ControllerKI myControllerKI = new ControllerKI(this);
        getContentPane().setLayout(myBorderLayout);
        
        //Hier wird das Fenster entworfen
        fenster3.setLayout(null);
        fenster3.setBackground(Color.orange);
        
        lblUeberschrift.setText("HAUPTMENÜ");
        lblUeberschrift.setFont(ueberschrift);
        lblUeberschrift.setBounds(40, 25, 350, 50);
        
        lblUnterUeberschrift.setText("1 Spieler + Computer");
        lblUnterUeberschrift.setFont(unterUeberschrift);
        lblUnterUeberschrift.setBounds(50, 75, 300, 50);
        
        lblSpieler1.setText("Spieler 1: ");
        lblSpieler1.setFont(text);
        lblSpieler1.setBounds(25, 170, 120, 30);
        
        lblComputer.setText("Computer");
        lblComputer.setFont(text);
        lblComputer.setBounds(25, 220, 120, 30);
        
        txtSpielername1.setText("");
        txtSpielername1.setBounds(150, 170, 200, 30);
        txtSpielername1.setFont(text);
       
        
        btnStart.setText("Start");
        btnStart.setBounds(100, 350, 200, 50);
        btnStart.setFont(button);
        btnStart.setToolTipText("Startet das Spiel");
        btnStart.setActionCommand("start");
        btnStart.addActionListener(myControllerKI);

        //Die Bestandteile des Fensters werden hinzugefügt
        fenster3.add(lblUeberschrift, null);
        fenster3.add(lblUnterUeberschrift, null);
        fenster3.add(lblSpieler1, null);
        fenster3.add(lblComputer, null);
        fenster3.add(txtSpielername1, null);
        fenster3.add(btnStart, null);

        
        this.getContentPane().add(fenster3, BorderLayout.CENTER);
    }
}
