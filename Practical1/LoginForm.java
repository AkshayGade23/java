import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="LoginForm.class" width="600" height= "600"></applet>*/

public class LoginForm extends Applet implements ActionListener {
    // Creatingn variables
    Label userName, userPassword;
    TextField nameTf, passTf;
    Button btnReset, btnLogin;
    String str = " Enter Login Credentials";

    public void init() {

        // creating Labels and adding them
        userName = new Label("UserName");
        nameTf = new TextField(30);

        add(userName);
        add(nameTf);

        userPassword = new Label("Password");
        passTf = new TextField(6);
        passTf.setEchoChar('*');

        add(userPassword);
        add(passTf);

        // creating Buttons and adding them
        btnReset = new Button("Reset");
        btnReset.addActionListener(this);

        btnLogin = new Button("Login");
        btnLogin.addActionListener(this);

        add(btnReset);
        add(btnLogin);
    }// end of init

    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand() == "Reset") {
            nameTf.setText("\0");
            passTf.setText("\0");
            nameTf.setEditable(true);
            passTf.setEditable(true);
        } else {
            String user = nameTf.getText();
            String password = passTf.getText();

            if (user.equals("Ajay") && password.equals("123456")) {
                str = " Welcome " + nameTf.getText();
                nameTf.setEditable(false);
                passTf.setEditable(false);
            } else {
                str = "Invalid Username or Password";
            }
        }
        repaint();

    } // end of actionPerformed

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(str, 40, 60);

    } // end of paint
}// end of class
