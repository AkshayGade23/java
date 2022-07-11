import javax.swing.*;
import javax.swing.border.Border;

import javafx.geometry.Point2D;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/*<applet code="TwoList.class" width ="700" height="500"></applet>*/

public class TwoList extends JApplet implements ActionListener {
	JList<Object> list1, list2;
	JButton btn1, btn2;
	ArrayList<String> l1 = new ArrayList<String>();
	ArrayList<String> l2 = new ArrayList<String>();

	public void init() {
		setLayout(null);

		l1.add("A1");
		l1.add("A2");
		l1.add("A3");
		l1.add("A4");
		l1.add("A5");
		l2.add("B1");
		l2.add("B2");
		l2.add("B3");
		l2.add("B4");
		l2.add("B5");

		list1 = new JList<Object>(l1.toArray());
		list2 = new JList<Object>(l2.toArray());
		list1.setForeground(Color.CYAN);

		list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		btn1 = new JButton("<");
		btn2 = new JButton(">");
		
		list1.setBounds(300,100,30,300);
		list2.setBounds(380,100,30,300);
		btn1.setBounds(380,400,50,30);
		btn2.setBounds(300,400,50,30);
		
		add(list1);
		add(list2);
		add(btn1);
		add(btn2);

		btn1.addActionListener(this);
		btn2.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btn2) {
			int i = list1.getSelectedIndex();
			if (i >= 0) {
				l2.add(l1.get(i));
				l1.remove(i);
			}

		} else if (ae.getSource() == btn1) {
			int i = list2.getSelectedIndex();
			if (i >= 0) {
				l1.add(l2.get(i));
				l2.remove(i);
			}
		}
		list1.setListData(l1.toArray());
		list2.setListData(l2.toArray());
		repaint();
	}

}
