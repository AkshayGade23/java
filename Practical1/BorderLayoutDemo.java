import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="BorderLayoutDemo.class" width=250 height=200></applet>*/

public class BorderLayoutDemo extends Applet {
	Button winXP, winVista, solaries, mac, ubuntu;

	public void init() {
		// setting Center Align FlowLayout
		setLayout(new BorderLayout());

		winXP = new Button("Windows Xp");
		winVista = new Button("Windows Vista");
		solaries = new Button("Solaris");
		mac = new Button("Mac");
		ubuntu = new Button("Ubuntu");

		add(winXP, BorderLayout.CENTER);
		add(winVista, BorderLayout.EAST);
		add(solaries, BorderLayout.WEST);
		add(mac, BorderLayout.NORTH);
		add(ubuntu, BorderLayout.SOUTH);
	}
}
