import java.awt.*;
import java.awt.event.*;

public class TextFieldExample extends Frame implements ActionListener {

    TextField t1, t2, t3;
    Button b1, b2;

    public TextFieldExample() {
        setTitle("Example for TextField");

        t1 = new TextField();
        t1.setBounds(30, 50, 150, 30); 
        add(t1);

        t2 = new TextField();
        t2.setBounds(30, 100, 150, 30);
        add(t2);

        t3 = new TextField();
        t3.setBounds(30, 150, 150, 30);
        t3.setEditable(false); 
        add(t3);

        b1 = new Button("+");
        b1.setBounds(30, 200, 50, 50);
        b1.addActionListener(this);
        add(b1);

        b2 = new Button("-");
        b2.setBounds(90, 200, 50, 50);
        b2.addActionListener(this);
        add(b2);

        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int result = 0;

        if (e.getSource() == b1) { 
            result = num1 + num2;
        } else if (e.getSource() == b2) { 
            result = num1 - num2;
        }

        t3.setText(String.valueOf(result)); 
    }

    public static void main(String[] args) {
        new TextFieldExample(); 
    }
}
