import java.applet.*;
import java.awt.*;

public class Emoji5 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(100, 30, 100, 100);
        g.setColor(Color.black);
        g.fillOval(125, 60, 10, 10);
        g.fillOval(165, 60, 10, 10);
        g.drawArc(130, 80, 50, 20, 180, 180);
    }
}

/*
 * <applet code="Emoji5" width=500 height=300></applet>
 */