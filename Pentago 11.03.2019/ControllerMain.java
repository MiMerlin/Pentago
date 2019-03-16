import java.awt.event.*;
import javax.swing.JFrame;
/**
 * @author (Bastian)
 * @version (03.03.2019)
 */
public class ControllerMain implements ActionListener {
    private ViewMain myViewMain;
    public ControllerMain(ViewMain pViewMain) {
        
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("option1")) {
            StarterSpieler.StarterSpieler(2);
        }
        if (cmd.equals("option2")) {
            StarterKI.StarterKI();
        }
        if (cmd.equals("exit")) {
            System.exit(0);
        }
    }
}