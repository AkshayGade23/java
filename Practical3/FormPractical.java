import javax.swing.*;
import java.awt.*;
/*<applet code="FormPractical.class" height="400" width = "400"></applet>*/

public class FormPractical extends JApplet{
	public void init(){
		JTabbedPane jtp = new JTabbedPane();
		jtp.add("Personal Information",new PersonalInfo());
		jtp.add("Academic Information",new AcademicInfo());
		add(jtp);
	}
}

class PersonalInfo extends JPanel {

	JLabel lblName ,lblEnroll,lblGender,lblCity,lblState;
	JTextField tfName,tfEnroll;
	JRadioButton rbMale,rbFemale;
	ButtonGroup grp;
	JComboBox cmbCity,cmbState;
	
	public PersonalInfo(){

		lblName = new JLabel("Name");
		tfName = new JTextField("Akshay Babasaheb Gade",25);	
		
		lblEnroll = new JLabel("Enrollment");
		tfEnroll = new JTextField("1906025",10);
		
		lblGender = new JLabel("Gender");
		rbMale = new JRadioButton("Male");
		rbFemale = new JRadioButton("Female");
		grp = new ButtonGroup();
		grp.add(rbMale);
		grp.add(rbFemale);
	
		lblCity = new JLabel("City");
		cmbCity = new JComboBox();
		cmbCity.addItem("Pune");
		cmbCity.addItem("Ahmednagar");
		cmbCity.addItem("Mumbai");
		cmbCity.addItem("Other");
		
		lblState = new JLabel("State");
		cmbState = new JComboBox();
		cmbState.addItem("Maharashtra");
		cmbState.addItem("Delhi");
		cmbState.addItem("kolkata");
		cmbState.addItem("karnataka");
		cmbState.addItem("Other");
		
		add(lblName);
		add(tfName);
		add(lblEnroll);
		add(tfEnroll);
		add(lblGender);
		add(rbMale);
		add(rbFemale);
		add(lblCity);
		add(cmbCity);
		add(lblState);
		add(cmbState);
	}

}
class AcademicInfo extends JPanel{
	String courses[]  ={"JAVA","PYthon","Android","ComputerSecurity","DMI"}; 
	JLabel lblMark, course,lblCredit;
	JTextField tfMark,tfCredit;
	JList coursesList;
	
	public AcademicInfo (){
		lblMark= new JLabel("Mark");
		tfMark = new JTextField("95%",25);
		
		lblCredit = new JLabel("Credits");
		tfCredit  = new JTextField("134 Obtained");
		
		course = new JLabel("Courses");
		coursesList = new JList(courses);
		coursesList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		add(course);
		add(coursesList);
		add(lblMark);
		add(tfMark);
		add(lblCredit);
		add(tfCredit);		
	}
}

