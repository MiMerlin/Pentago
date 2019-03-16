import java.awt.*;
import javax.swing.*;
/** 
 * @author (Bastian)
 * @version (03.03.2019)
 * */
public class ViewSpieler extends JFrame {
    BorderLayout myBorderLayout = new BorderLayout();
    
    //Die Schriftarten werden deklariert und initialisiert
    Font ueberschrift = new Font("Arial", Font.ITALIC + Font.BOLD, 50);
    Font unterUeberschrift = new Font("Arial", Font.ITALIC +Font.BOLD, 25);
    Font text = new Font("Arial", Font.ITALIC, 25);
    Font button = new Font("Arial", Font.ITALIC, 25);
    
    //Die verschiedenen Panels werden deklariert
    JPanel fenster2 = new JPanel();
    
    //Die Textfelder werden deklariert
    JLabel lblUeberschrift = new JLabel();
    JLabel lblUnterUeberschrift = new JLabel();
    JLabel lblSpieler1 = new JLabel();
    JLabel lblSpieler2 = new JLabel();
    JTextField txtSpielername1 = new JTextField();
    JTextField txtSpielername2 = new JTextField();
    
    //Die Buttons werden deklariert
    JButton btnStart = new JButton();
    
    public ViewSpieler(int z) {
        super ("Pentago Launcher");        
        ControllerSpieler myControllerSpieler = new ControllerSpieler(this, z);
        getContentPane().setLayout(myBorderLayout);
        
        //Hier wird das Fenster entworfen
        fenster2.setLayout(null);
        fenster2.setBackground(Color.orange);
        
        lblUeberschrift.setText("HAUPTMENÜ");
        lblUeberschrift.setFont(ueberschrift);
        lblUeberschrift.setBounds(40, 25, 350, 50);
        
        lblUnterUeberschrift.setText("2 Spieler");
        lblUnterUeberschrift.setFont(unterUeberschrift);
        lblUnterUeberschrift.setBounds(150, 75, 110, 50);
        
        lblSpieler1.setText("Spieler 1: ");
        lblSpieler1.setFont(text);
        lblSpieler1.setBounds(25, 170, 120, 30);
        
        lblSpieler2.setText("Spieler 2: ");
        lblSpieler2.setFont(text);
        lblSpieler2.setBounds(25, 220, 120, 30);
        
        txtSpielername1.setText("");
        txtSpielername1.setBounds(150, 170, 200, 30);
        txtSpielername1.setFont(text);
        
        txtSpielername2.setText("");
        txtSpielername2.setBounds(150, 220, 200, 30);
        txtSpielername2.setFont(text);
        
        btnStart.setText("Start");
        btnStart.setBounds(100, 350, 200, 50);
        btnStart.setFont(button);
        btnStart.setToolTipText("Startet das Spiel");
        btnStart.setActionCommand("start");
        btnStart.addActionListener(myControllerSpieler);

        //Die Bestandteile des Fensters werden hinzugefügt
        fenster2.add(lblUeberschrift, null);
        fenster2.add(lblUnterUeberschrift, null);
        fenster2.add(lblSpieler1, null);
        fenster2.add(lblSpieler2, null);
        fenster2.add(txtSpielername1, null);
        fenster2.add(txtSpielername2, null);
        fenster2.add(btnStart, null);

        
        this.getContentPane().add(fenster2, BorderLayout.CENTER);
    }
}