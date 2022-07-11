
import java.applet.*;
import java.awt.*;

public class Emoji4 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(100, 30, 100, 100);
        g.setColor(Color.black);
        g.fillOval(125, 60, 10, 20);
        g.fillOval(165, 60, 10, 20);
        g.drawArc(125, 100, 50, 20, 0, 180);

    }
}
/*
<applet code="Emoji4" width="1000" height="1000">
</applet>
*/