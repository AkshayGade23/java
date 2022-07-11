import java.awt.*;
import java.applet.*;

/* <applet code="GridLayoutDemo.class" width=250 height=200></applet>*/
public class GridLayoutDemo extends Applet {
	public void init() {
		setLayout(new GridLayout(3, 3));
		int k = 1;
		for (int i = 0; i < 9; i++) {
			add(new Button(" " + k++));
		}
	}
}
