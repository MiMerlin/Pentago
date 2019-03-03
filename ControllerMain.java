import java.awt.event.*;
import javax.swing.JFrame;

public class ControllerMain implements ActionListener {
    private ViewMain myViewMain;
    public ControllerMain(ViewMain pViewMain) {
        
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("option1")) {
            StarterSpieler.StarterSpieler();
        }
        if (cmd.equals("option2")) {
            StarterKI.StarterKI();
        }
        if (cmd.equals("exit")) {
            System.exit(0);
        }
    }
}