import java.awt.*;
import javax.swing.*;

/*<applet code="Flages.class" height="400" width = "400"></applet>*/

public class Flages extends JApplet {
	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		ImageIcon indiaIcon = new ImageIcon("india.jpeg");
		ImageIcon usaIcon = new ImageIcon("USA.jpg");
		ImageIcon brazilIcon = new ImageIcon("brazil.png");

		JLabel indiaLbl = new JLabel("India", indiaIcon, JLabel.CENTER);
		JLabel usaLbl = new JLabel("USA", usaIcon, JLabel.CENTER);
		JLabel brazilLbl = new JLabel("Brazil", brazilIcon, JLabel.CENTER);

		add(indiaLbl);
		add(usaLbl);
		add(brazilLbl);

	}

}
