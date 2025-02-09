import java.awt.*;
import java.awt.event.*;

public class TextAreaExample extends Frame implements ActionListener {

    Label l1, l2;
    TextArea t1;
    Button b1;

    public TextAreaExample() {
        setTitle("Example of TextArea");

        l1 = new Label("Words: 0");
        l1.setBounds(20, 50, 150, 30);
        add(l1);

        l2 = new Label("Characters: 0");
        l2.setBounds(200, 50, 150, 30);
        add(l2);

        t1 = new TextArea();
        t1.setBounds(20, 90, 350, 150);
        add(t1);

        b1 = new Button("Count Words");
        b1.setBounds(150, 260, 100, 30);
        b1.addActionListener(this);
        add(b1);

        setSize(400, 350);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = t1.getText().trim();

       
        int wordCount = s.isEmpty() ? 0 : s.split("\\s+").length;

        // Count characters using length()
        int charCount = s.length();

       
        l1.setText("Words: " + wordCount);
        l2.setText("Characters: " + charCount);
    }

    public static void main(String[] args) {
        new TextAreaExample();
    }
}
