import java.awt.*;

public class TextAreaExample extends Frame {

    public TextAreaExample() {
        // Create TextArea
        TextArea ta = new TextArea("Welcome to javatpoint");

        // Set position and size explicitly
        ta.setBounds(10, 30, 260, 220); // Adjusted size to fit inside the frame

        // Add TextArea to the Frame
        add(ta);

        // Frame properties
        setSize(300, 300);
        setLayout(null);  // Using null layout requires explicit bounds
        setVisible(true);
    }

    public static void main(String args[]) {
        new TextAreaExample();
    }
}
