import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends Frame implements ActionListener {

    Label l1, l2, l3, l4, l5;
    TextField t1, t2;
    TextArea a1;
    CheckboxGroup cbg;
    Checkbox cMale, cFemale, checkTerms;
    Choice dobDay, dobMonth, dobYear;
    Button b1, b2;

    public RegistrationForm() {
        setTitle("Registration Form");
        setLayout(null); 


        l1 = new Label("Registration Form");
        l1.setBounds(300, 50, 200, 30);
        add(l1);


        l2 = new Label("Name:");
        l2.setBounds(100, 100, 100, 30);
        add(l2);

        t1 = new TextField();
        t1.setBounds(200, 100, 200, 30);
        add(t1);


        l3 = new Label("Gender:");
        l3.setBounds(100, 150, 100, 30);
        add(l3);

        cbg = new CheckboxGroup();
        cMale = new Checkbox("Male", cbg, false);
        cFemale = new Checkbox("Female", cbg, false);
        cMale.setBounds(200, 150, 80, 30);
        cFemale.setBounds(280, 150, 80, 30);
        add(cMale);
        add(cFemale);


        l4 = new Label("DOB:");
        l4.setBounds(100, 200, 100, 30);
        add(l4);

        dobDay = new Choice();
        dobMonth = new Choice();
        dobYear = new Choice();

        for (int i = 1; i <= 31; i++) dobDay.add(String.valueOf(i));
        for (int i = 1; i <= 12; i++) dobMonth.add("Month " + i);
        for (int i = 1990; i <= 2025; i++) dobYear.add(String.valueOf(i));

        dobDay.setBounds(200, 200, 50, 30);
        dobMonth.setBounds(260, 200, 80, 30);
        dobYear.setBounds(350, 200, 80, 30);

        add(dobDay);
        add(dobMonth);
        add(dobYear);


        l5 = new Label("Address:");
        l5.setBounds(100, 250, 100, 30);
        add(l5);

        a1 = new TextArea();
        a1.setBounds(200, 250, 200, 70);
        add(a1);


        checkTerms = new Checkbox("Accept the policy");
        checkTerms.setBounds(100, 340, 200, 30);
        add(checkTerms);


        b1 = new Button("Submit");
        b1.setBounds(100, 400, 100, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new Button("Cancel");
        b2.setBounds(220, 400, 100, 30);
        b2.addActionListener(this);
        add(b2);

        setSize(600, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("Form Submitted");
        } else if (e.getSource() == b2) {
            System.out.println("Form Canceled");
            dispose();
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
