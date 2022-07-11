
import java.applet.*;
import java.awt.*;

public class Emoji1 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 80, 80);
        g.setColor(Color.black);

        g.fillOval(120, 120, 5, 10);
        g.fillOval(150, 120, 5, 10);

    }
}
/*
 * <applet code="Emoji1" width="1000" height="1000">
 * </applet>
 */