import java.awt.event.*;
/**
 * @author (Bastian)
 * @version (03.03.2019)
 */
public class ControllerSpiel implements ActionListener {
    private ViewSpiel myViewSpiel;
    private Pentago spiel;
    
    public ControllerSpiel(ViewSpiel pViewSpiel, String s1, String s2, int z) {
        myViewSpiel = pViewSpiel;
        spiel = new Pentago(s1, s2, z);
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        
        if (cmd.equals("exit")) {
            System.exit(0);
        }
    }
}