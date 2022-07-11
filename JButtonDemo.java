import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*<applet code="JButttonDemo.class" height="400" width = "400"></applet>*/

public class JButtonDemo extends JApplet implements ActionListener{
String s = "Tap on Flag";
JLabel l1;
	public void init(){
		setLayout(new FlowLayout());
		 l1 = new JLabel("Click");
		
		ImageIcon indiaIcon= new ImageIcon("india.jpeg");
		ImageIcon usaIcon= new ImageIcon("USA.jpg");
		ImageIcon brazilIcon= new ImageIcon("brazil.png");
		
		JButton indiaLbl = new JButton(indiaIcon);
		JButton usaLbl = new JButton(usaIcon);
		JButton brazilLbl = new JButton(brazilIcon);
		
		indiaLbl.setText("India");
		usaLbl.setText("USA");
		brazilLbl.setText("Brazil");
		
		indiaLbl.addActionListener(this);
		usaLbl.addActionListener(this);
		brazilLbl.addActionListener(this);
		
		add(l1);
		add(indiaLbl);
		add(usaLbl);
		add(brazilLbl);
		
	}
	public void actionPerformed(ActionEvent ae){
		s = "You Clicked on Button : " + ae.getActionCommand();
		l1.setText("s");
		repaint();  
	}
		
}
