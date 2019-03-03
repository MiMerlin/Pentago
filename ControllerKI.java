import java.awt.event.*;
import javax.swing.JFrame;

public class ControllerKI implements ActionListener {
    private ViewKI myViewKI;
    public ControllerKI(ViewKI pViewKI) {
        
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("start")) {
            StarterSpiel.StarterSpiel();
        }
    }
}