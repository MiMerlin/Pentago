import java.awt.event.*;

public class Controller implements ActionListener {
    private View myView;
    //private Pentago spiel;
    
    public Controller(View pView) {
        myView = pView;
        //spiel = new Pentago(this);
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        
        if (cmd.equals("exit")) {
            System.exit(0);
        }
    }
}