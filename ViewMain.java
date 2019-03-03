import java.awt.*;
import javax.swing.*;

public class ViewMain extends JFrame {
    BorderLayout myBorderLayout = new BorderLayout();
    
    //Die Schriftarten werden deklariert und initialisiert
    Font ueberschrift = new Font("Arial", Font.ITALIC + Font.BOLD, 50);
    Font text = new Font("Arial", Font.ITALIC, 25);
    Font button = new Font("Arial", Font.ITALIC, 25);
    
    //Die verschiedenen Panels werden deklariert
    JPanel fenster = new JPanel();
    
    //Die Textfelder werden deklariert
    JLabel lblUeberschrift = new JLabel();
    JLabel lblFrage1 = new JLabel();
    JLabel lblFrage2 = new JLabel();
    
    //Die Buttons werden deklariert
    JButton btnOption1 = new JButton();
    JButton btnOption2 = new JButton();
    
    public ViewMain() {
        super ("Pentago Launcher");        
        ControllerMain myControllerMain = new ControllerMain(this);
        getContentPane().setLayout(myBorderLayout);
        
        //Hier wird der Hintergrund entworfen
        fenster.setLayout(null);
        fenster.setBackground(Color.orange);
        
        lblUeberschrift.setText("HAUPTMENÜ");
        lblUeberschrift.setFont(ueberschrift);
        lblUeberschrift.setBounds(40, 25, 350, 50);
        
        lblFrage1.setText("Welche Version möchten");
        lblFrage1.setFont(text);
        lblFrage1.setBounds(25, 150, 350, 50);
        
        lblFrage2.setText("Sie spielen?");
        lblFrage2.setFont(text);
        lblFrage2.setBounds(25, 190, 350, 50);
        
        btnOption1.setText("2 Spieler");
        btnOption1.setToolTipText("2 Spieler");
        btnOption1.setFont(button);
        btnOption1.setBounds(25, 300, 150, 50);
        btnOption1.setActionCommand("option1");
        btnOption1.addActionListener(myControllerMain);
        
        btnOption2.setText("1 Spieler");
        btnOption2.setToolTipText("1 Spieler + Computer");
        btnOption2.setFont(button);
        btnOption2.setBounds(220, 300, 150, 50);
        btnOption2.setActionCommand("option2");
        btnOption2.addActionListener(myControllerMain);
        
        //Die Bestandteile der Linken Spielleiste werden hinzugefügt
        fenster.add(lblUeberschrift, null);
        fenster.add(lblFrage1, null);
        fenster.add(lblFrage2, null);
        fenster.add(btnOption1, null);
        fenster.add(btnOption2, null);
        
        this.getContentPane().add(fenster, BorderLayout.CENTER);
    }
}
