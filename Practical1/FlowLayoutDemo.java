import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="FlowLayoutDemo.class" width=250 height=200></applet>*/

public class FlowLayoutDemo extends Applet {
	Checkbox winXP, winVista, solaries, mac;

	public void init() {
		// setting Center Align FlowLayout
		setLayout(new FlowLayout(FlowLayout.CENTER));

		winXP = new Checkbox("Windows Xp", null, true);
		winVista = new Checkbox("Windows Vista");
		solaries = new Checkbox("Solaris");
		mac = new Checkbox("Mac");

		add(winXP);
		add(winVista);
		add(solaries);
		add(mac);
	}
}
