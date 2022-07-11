
import java.applet.*;
import java.awt.*;

public class Emoji3 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.yellow);

        g.fillOval(100, 100, 80, 80);
        g.setColor(Color.black);
        g.drawLine(120, 125, 130, 125);
        g.drawLine(145, 125, 155, 125);
        g.drawLine(120, 150, 160, 150);

    }
}
/*
 * <applet code="Emoji3" width="1000" height="1000">
 * </applet>
 */
