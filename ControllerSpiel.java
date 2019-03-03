import java.awt.event.*;

public class ControllerSpiel implements ActionListener {
    private ViewSpiel myViewSpiel;
    //private Pentago spiel;
    
    public ControllerSpiel(ViewSpiel pViewSpiel) {
        myViewSpiel = pViewSpiel;
        //spiel = new Pentago(this);
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        
        if (cmd.equals("exit")) {
            System.exit(0);
        }
    }
}