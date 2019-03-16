import java.awt.event.*;
import javax.swing.*;

/**
 * Beschreiben Sie hier die Klasse Mouse.
 * 
 * @author (Merlin) 
 * @version (07.03.2019)
 */
public class AL extends MouseAdapter{
    int x, y;
    
    public AL()
    {
        x = 0;
        y = 0;
    }
    
    public void mouseClicked(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
    }
    
    public void mouseMoved(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY(MouseEvent e)
    {
        return y;
    }
}
