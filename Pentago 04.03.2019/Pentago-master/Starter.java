import javax.swing.JFrame;

/**
 * Die Klasse Starter startet das Spiel
 * @version 1.0
 */
public class Starter {
    public static void main() {
        View myView = new View();
        myView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myView.setBounds(75, 75, 1585, 904);
        myView.setResizable(false);
        myView.setVisible(true);
    }
}   