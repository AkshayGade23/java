import javax.swing.tree.*;
import javax.swing.*;
import java.awt.*;

/*<applet code="JTreeDemo.class" height="400" width = "400"></applet>*/
public class JTreeDemo extends JApplet {
	JTree tree;
	JScrollPane jsp;

	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Computer");

		DefaultMutableTreeNode first = new DefaultMutableTreeNode("First Year");
		DefaultMutableTreeNode second = new DefaultMutableTreeNode("Second Year");
		DefaultMutableTreeNode third = new DefaultMutableTreeNode("Third Year");

		DefaultMutableTreeNode g1 = new DefaultMutableTreeNode("G1");
		DefaultMutableTreeNode h1 = new DefaultMutableTreeNode("H1");
		DefaultMutableTreeNode n1 = new DefaultMutableTreeNode("N1");

		DefaultMutableTreeNode g2 = new DefaultMutableTreeNode("G2");
		DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("H2");
		DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("N2");

		DefaultMutableTreeNode g3 = new DefaultMutableTreeNode("G3");
		DefaultMutableTreeNode h3 = new DefaultMutableTreeNode("H3");
		DefaultMutableTreeNode n3 = new DefaultMutableTreeNode("N3");

		top.add(first);
		top.add(second);
		top.add(third);

		first.add(g1);
		first.add(h1);
		first.add(n1);

		second.add(g2);
		second.add(h2);
		second.add(n2);

		third.add(g3);
		third.add(h3);
		third.add(n3);

		tree = new JTree(top);
		jsp = new JScrollPane(tree);

		cp.add(jsp);
	}
}
