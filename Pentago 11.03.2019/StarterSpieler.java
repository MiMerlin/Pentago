import javax.swing.JFrame;

/**
 * Die Klasse StarterSpieler startet das Spiel mit 2 Spielern
 * @version 1.0
 * 
 * @author (Bastian)
 * @version (03.03.2019)
 */
public class StarterSpieler {
    public static void StarterSpieler(int z) {
        ViewSpieler myViewSpieler = new ViewSpieler(z);
        myViewSpieler.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myViewSpieler.setBounds(75, 75, 400, 500);
        myViewSpieler.setResizable(false);
        myViewSpieler.setVisible(true);
    }
}