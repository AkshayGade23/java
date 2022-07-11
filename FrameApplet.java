import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="FrameApplet.class" height="250" width="250"></applet>*/

public class FrameApplet extends Applet implements ActionListener{
 Frame f;
 Button btn1,btn2;
 
 public void init(){
 	btn1  = new Button("Create	");
 	btn2  = new Button("Delete");
 	f = new Frame("Frame Example");
 
      f.setSize(300,300);
 	
 	btn1.addActionListener(this);
 	btn2.addActionListener(this);
 	add(btn1);
 	add(btn2);
 }
 public void actionPerformed(ActionEvent ae){
 	if(ae.getSource()== btn1)
 		f.setVisible(true);
 	else{
 		f.setVisible(false);
 }
}
