
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="NoobCalculator.class" width="600" height= "600"></applet>
*/

public class NoobCalculator extends Applet implements ActionListener {
    Label lblVal1, lblVal2, lblResult;
    TextField tfVal1, tfVal2, tfResult;;
    Button btnAdd, btnSub, btnMul, btnDiv;

    public void init() {
        // creating textFiled for Values and adding them
        lblVal1 = new Label("Value 1");
        tfVal1 = new TextField(5);
        add(lblVal1);
        add(tfVal1);

        lblVal2 = new Label("Value 2");
        tfVal2 = new TextField(5);
        add(lblVal2);
        add(tfVal2);

        btnAdd = new Button("+");
        btnSub = new Button("-");
        btnMul = new Button("*");
        btnDiv = new Button("/");

        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);

        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);

        lblResult = new Label("Result");
        tfResult = new TextField(10);
        add(lblResult);
        add(tfResult);
        tfResult.setEditable(false);
    }// end of init

    public void actionPerformed(ActionEvent ae) {
        String tapBtn = ae.getActionCommand();
        String result = "/0";
        int val1 = Integer.parseInt(tfVal1.getText());
        int val2 = Integer.parseInt(tfVal2.getText());

        if (tapBtn.equals("+")) {
            result = Integer.toString(val1 + val2);
        } else if (tapBtn.equals("-")) {
            result = Integer.toString(val1 - val2);
        } else if (tapBtn.equals("*")) {
            result = Integer.toString(val1 * val2);
        } else if (tapBtn.equals("/")) {
            result = Integer.toString(val1 / val2);
        }
        tfResult.setText(result);
    }// end of actionPerformed
}