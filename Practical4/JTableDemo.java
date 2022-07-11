
import javax.swing.*;
import java.awt.*;

/*<applet code="JTableDemo.class" height="400" width = "400"></applet>*/
public class JTableDemo extends JApplet{
	
	
	public void init(){
	Container cp = getContentPane();
	cp.setLayout(new FlowLayout());
	
	String colHead[] ={"Name","Age","Marks"};
	String data[][]  = {
		{"Akshay","18","93"},
		{"Vijay","19","94"},
		{"Vinay","18","95"},
		{"Pranavraj","18","96"},
		{"Ajay","18","97"},
		{"Sourabh","17","92"},
		{"Rushikesh","20","94"}
	};
		
	JTable jtb = new JTable(data,colHead);  
	JScrollPane jsp = new JScrollPane(jtb);
		
	cp.add(jsp);
	}
}
