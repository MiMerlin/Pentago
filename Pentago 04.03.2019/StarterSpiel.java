import javax.swing.JFrame;

/**
 * Die Klasse StarterSpiel startet das Spielfenster
 * @version 1.0
 * 
 * @author (Bastian)
 * @version (03.03.2019)
 */
public class StarterSpiel {
    //private ViewSpieler spielerView;
    public static void StarterSpiel(String s1, String s2, int z) {
        ViewSpiel myViewSpiel = new ViewSpiel(s1, s2, z);
        myViewSpiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myViewSpiel.setBounds(75, 75, 1585, 904);
        myViewSpiel.setResizable(false);
        myViewSpiel.setVisible(true);
    }
} 