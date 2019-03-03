import java.awt.*;

public class Spielbrett {
    public Spielbrett() {
        
    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawOval(10, 10, 50, 50);
    }
}