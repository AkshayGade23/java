
import java.applet.*;
import java.awt.*;

public class Emoji2 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 80, 80);
        g.setColor(Color.black);
        g.fillOval(120, 120, 5, 10);
        g.fillOval(150, 120, 5, 10);
        g.drawLine(120, 150, 150, 150);

    }
}
/*
 * <applet code="Emoji2" width="1000" height="1000">
 * </applet>
 */