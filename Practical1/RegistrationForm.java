import java.awt.*;
import java.applet.*;
import java.awt.event.*;


/*<applet code="RegistrationForm.class" height="500" width="500">
</applet>*/

public class RegistrationForm extends Applet implements ItemListener, ActionListener {

    Label lblFName, lblLName, lblEnno, lblMarks, lblGender, lblCourse;
    TextField txtFName, txtLName, txtEnno, txtMarks;
    Button btnSubmit, btnReset;
    Checkbox chkMale, chkFemale, chkJava, chkDs, chkDm, chkM3, chkPython;
    CheckboxGroup cbg;
    String str, msg;

    public void init() {
        lblFName = new Label("First Name");
        lblLName = new Label("Last Name");
        lblEnno = new Label("Enrollment Number");
        lblMarks = new Label("Marks");

        cbg = new CheckboxGroup();
        lblGender = new Label("Gender");
        chkMale = new Checkbox("Male", cbg, false);
        chkFemale = new Checkbox("Female", cbg, false);

        txtFName = new TextField(25);
        txtLName = new TextField(25);
        txtEnno = new TextField(10);
        txtMarks = new TextField(10);

        lblCourse = new Label("Courses");
        chkJava = new Checkbox("Java Programming");
        chkDs = new Checkbox("Data Structures");
        chkDm = new Checkbox("Data Mining");
        chkM3 = new Checkbox("Mathematics 3");
        chkPython = new Checkbox("Python");

        btnSubmit = new Button("Submit");
        btnReset = new Button("Reset");

        add(lblFName);
        add(txtFName);

        add(lblLName);
        add(txtLName);

        add(lblEnno);
        add(txtEnno);

        add(lblGender);
        add(chkMale);
        add(chkFemale);

        add(lblMarks);
        add(txtMarks);

        add(lblCourse);
        add(chkJava);
        add(chkDs);
        add(chkDm);
        add(chkM3);
        add(chkPython);

        add(btnSubmit);
        add(btnReset);

        // Register Listener
        chkJava.addItemListener(this);
        chkDs.addItemListener(this);
        chkDm.addItemListener(this);
        chkM3.addItemListener(this);
        chkPython.addItemListener(this);
        chkMale.addItemListener(this);
        chkFemale.addItemListener(this);

        btnSubmit.addActionListener(this);
        btnReset.addActionListener(this);

    }// end of init method

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    } // end of itemStateChanged

    public void actionPerformed(ActionEvent ae) {
        str = ae.getActionCommand();
        msg = "You Clicked on " + str;
        if (str.equals("Reset")) {
            txtFName.setText("\0");
            txtLName.setText("\0");
            txtEnno.setText("\0");
            txtMarks.setText("\0");
         
        } else {
            txtFName.setEditable(false);
            txtLName.setEditable(false);
            txtEnno.setEditable(false);
            txtMarks.setEditable(false);
            chkJava.setEnabled(false);
            chkDm.setEnabled(false);
            chkDs.setEnabled(false);
            chkM3.setEnabled(false);
            chkPython.setEnabled(false);
            chkFemale.setEnabled(false);
            chkMale.setEnabled(false);
        }
        repaint();
    }// end of actionPerformed

    public void paint(Graphics g) {
        str = "Current Status = ";
        g.drawString(str, 400, 120);
        g.drawString("Java Programming = " + chkJava.getState(), 400, 140);
        g.drawString("Data Structures = " + chkDs.getState(), 400, 160);
        g.drawString("Data Mining = " + chkDm.getState(), 400, 180);
        g.drawString("Mathematics 3 = " + chkM3.getState(), 400, 200);
        g.drawString("Python" + chkPython.getState(), 400, 220);
        g.drawString("Gender " + cbg.getSelectedCheckbox().getLabel() + " is selected", 400, 260);
        g.drawString(msg, 400, 280);

    } // end of Paint
} // end of class
