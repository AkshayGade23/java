
import java.applet.*;
import java.awt.*;

public class Font2 extends Applet {
    Font f;

    public void init() {
        f = new Font("Arial", Font.BOLD, 18);
    }

    public void paint(Graphics g) {
        g.drawString("Good Morning", 60, 60);

        g.setFont(f);
        g.drawString("Good Morning", 60, 80);

    }
}

/*
 * <applet code="Font2" width="1000" height="1000">
 * </applet>
 */
