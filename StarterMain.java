import javax.swing.JFrame;

/**
 * Die Klasse StarterMain startet das Programm
 * @version 1.0
 */
public class StarterMain {
    public static void StarterMain() {
        ViewMain myViewMain = new ViewMain();
        myViewMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myViewMain.setBounds(75, 75, 400, 500);
        myViewMain.setResizable(false);
        myViewMain.setVisible(true);
    }
}
