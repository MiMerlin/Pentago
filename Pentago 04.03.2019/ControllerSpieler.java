import java.awt.event.*;
import javax.swing.JFrame;
/**
 * 
 * @author (Bastian, Merlin)
 * @version (03.03.2019)
 */
public class ControllerSpieler implements ActionListener {
    private ViewSpieler myViewSpieler;
    private int z; 
    private StarterSpiel spielStarter;
    public ControllerSpieler(ViewSpieler pViewSpieler, int z) {
        myViewSpieler = pViewSpieler;
        this.z = z;
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("start")) {
            spielStarter = new StarterSpiel();
            StarterSpiel.StarterSpiel(myViewSpieler.txtSpielername1.getText(), myViewSpieler.txtSpielername2.getText(), z);
            //spielStarter.StarterSpiel(myViewSpieler.txtSpielername1.getText(), myViewSpieler.txtSpielername2.getText(),z);
        }
        if (cmd.equals("exit")) {
            System.exit(0);
        }
    }
}