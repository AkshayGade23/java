import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="CardLayoutDemo.class" width=250 height=200></applet>*/

public class CardLayoutDemo extends Applet implements ActionListener, MouseListener {
	Checkbox winXp, macOS, iOS, windows10;
	Panel osCards;
	CardLayout cardLo;
	Button win, macc;

	public void init() {
		win = new Button("Windows");
		macc = new Button("Apple");
		add(win);
		add(macc);

		cardLo = new CardLayout();
		osCards = new Panel();
		osCards.setLayout(cardLo);

		winXp = new Checkbox("winXp", null, true);
		windows10 = new Checkbox("Windows 10");
		macOS = new Checkbox("MacOS");
		iOS = new Checkbox("iOS");

		Panel winPanel = new Panel();
		winPanel.add(winXp);
		winPanel.add(windows10);

		Panel macPanel = new Panel();
		macPanel.add(macOS);
		macPanel.add(iOS);

		osCards.add(winPanel, "Windows");
		osCards.add(macPanel, "Mac");

		add(osCards);

		win.addActionListener(this);
		macc.addActionListener(this);

		addMouseListener(this);
	}

	public void mousePressed(MouseEvent me) {
		cardLo.next(osCards);
	}

	public void mouseClicked(MouseEvent me) {
	}

	public void mouseEntered(MouseEvent me) {
	}

	public void mouseExited(MouseEvent me) {
	}

	public void mouseReleased(MouseEvent me) {
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == win) {
			cardLo.show(osCards, "Windows");
		} else {
			cardLo.show(osCards, "Mac");
		}
		repaint();
	}

}
