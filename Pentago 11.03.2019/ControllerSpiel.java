import java.awt.event.*;
/**
 * @author (Bastian, Merlin)
 * @version (03.03.2019)
 */
public class ControllerSpiel implements ActionListener {
    private ViewSpiel myViewSpiel;
    private Pentago spiel;
    
    public ControllerSpiel(ViewSpiel pViewSpiel, String s1, String s2, int z) {
        myViewSpiel = pViewSpiel;
        spiel = new Pentago(s1, s2, z, this);
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        
        if (cmd.equals("exit")) {
            System.exit(0);
        }
    }
    
    public void updateFeld(String s)
    {
       myViewSpiel.updateFeld(s); 
    }
    
    public String getAS()
    {
        return spiel.getAktSpieler();
    }
    
    public String getS1()
    {
      return spiel.getS1();   
    }
    
    public String getS2()
    {
      return spiel.getS2();   
    }
    
    public int getAusSpielSpielfeldDmd(int a, int b, int c, int d)
    {
        return spiel.getAusSpielfeldDmd(a, b, c, d);
    }
    
    public int getAusSpielSpielfeldPruef(int x, int y)
    {
        //System.out.println("Befehl erreicht: Controller");
        int p = spiel.getAusSpielfeldPruef(x, y);
        //System.out.println("Controller sendet zurueck : " + p);
        return p;
        }
        
    public void gibSpielfeldAnViewSpiel(Pentago pSpiel)
    {
        spiel = pSpiel;
        myViewSpiel.testmethod(this);    
    }
}