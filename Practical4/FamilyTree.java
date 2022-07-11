import javax.swing.tree.*;
import javax.swing.*;
import java.awt.*;

/*<applet code="FamilyTree.class" height="400" width = "400"></applet>*/

public class FamilyTree extends JApplet{
	JTree tree;
	JScrollPane jsp;
	DefaultMutableTreeNode grandParent,parent,uncle,self,brother,sibling1,sibling2;
	
	
	public void init(){
	//Container cp = getContentPane();
	//cp.setLayout(new FlowLayout());
 		grandParent = new DefaultMutableTreeNode("GrandParents");
		
		parent = new DefaultMutableTreeNode("Father/Mother");
		uncle = new DefaultMutableTreeNode("Uncle/Aunty");
		
		self = new DefaultMutableTreeNode("Self");
		brother = new DefaultMutableTreeNode("Brother");
		
		sibling1 = new DefaultMutableTreeNode("Sibling1");
		sibling2 = new DefaultMutableTreeNode("sibling2");
		
		
		grandParent.add(parent);
		grandParent.add(uncle);
		
		parent.add(self);
		parent.add(brother);
		
		uncle.add(sibling1);
		uncle.add(sibling2);
		
		
		
		tree = new JTree(grandParent);
              //jsp = new JScrollPane(tree);
		
		add(tree);
	}
}
