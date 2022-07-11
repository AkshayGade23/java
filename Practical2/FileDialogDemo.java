import java.awt.*;
import java.awt.event.*;

public class FileDialogDemo{
	FileDialog fd;
	
	FileDialogDemo(){
		Frame f = new Frame();
		fd = new FileDialog(f,"Open",FileDialog.LOAD);
		
		fd.setVisible(true);
		f.add(fd);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String args[]){
		new FileDialogDemo();
	}
}
