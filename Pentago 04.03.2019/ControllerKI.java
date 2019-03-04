import java.awt.event.*;
import javax.swing.JFrame;
/**
 * @author (Bastian, Merlin)
 * @version (04.03.2019)
 */
public class ControllerKI implements ActionListener {
    private ViewKI myViewKI;
    public ControllerKI(ViewKI pViewKI) {
        myViewKI = pViewKI;
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("start")) {
            StarterSpiel.StarterSpiel(myViewKI.txtSpielername1.getText(), "Computer", 1);
        }
    }
}