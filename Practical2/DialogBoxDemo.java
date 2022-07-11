import java.awt.*;
import java.awt.event.*;

class DialogBoxDemo implements ActionListener{
	Dialog d;
	
	DialogBoxDemo(){
		Frame f= new Frame();
		d = new Dialog(f,"Dialog",true);
		d.setLayout(new FlowLayout());
		Button b = new Button("Ok");
		
		b.addActionListener(this);
		d.add(new Label("Click Ok"));
		d.add(b);
		d.setSize(300,300);
		d.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		d.setVisible(false);		
	}
	public static void main(String args[]){
		new DialogBoxDemo();
	}	
}
