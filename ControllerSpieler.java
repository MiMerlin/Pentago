import java.awt.event.*;
import javax.swing.JFrame;

public class ControllerSpieler implements ActionListener {
    private ViewSpieler myViewSpieler;
    public ControllerSpieler(ViewSpieler pViewSpieler) {
        
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("start")) {
            StarterSpiel.StarterSpiel();
        }
        if (cmd.equals("exit")) {
            System.exit(0);
        }
    }
}