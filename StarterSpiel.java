import javax.swing.JFrame;

/**
 * Die Klasse StarterSpiel startet das Spielfenster
 * @version 1.0
 */
public class StarterSpiel {
    public static void StarterSpiel() {
        ViewSpiel myViewSpiel = new ViewSpiel();
        myViewSpiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myViewSpiel.setBounds(75, 75, 1585, 904);
        myViewSpiel.setResizable(false);
        myViewSpiel.setVisible(true);
    }
}   