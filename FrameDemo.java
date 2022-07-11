import java.awt.*;
import java.awt.event.*;

public class FrameDemo{
 Frame f;
 Button btn;
 
 FrameDemo(){
 	f = new Frame("Frame Example");
 	btn  = new Button("Press");
 
 f.add(btn);
 	f.setSize(300,300);
 	f.setVisible(true);
 }
 
 public static void main(String[] args){
 	new FrameDemo();
 }
}
