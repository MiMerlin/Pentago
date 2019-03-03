import javax.swing.JFrame;

/**
 * Beschreiben Sie hier die Klasse StarterComputer.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class StarterKI
{
    public static void StarterKI() {
        ViewKI myViewKI = new ViewKI();
        myViewKI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myViewKI.setBounds(75, 75, 400, 500);
        myViewKI.setResizable(false);
        myViewKI.setVisible(true);
    }
}
