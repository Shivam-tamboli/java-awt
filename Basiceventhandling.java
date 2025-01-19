import java.awt.*;
import java.awt.event.*;

public class Basiceventhandling extends Frame implements ActionListener{
//var, used to display text.
TextField tf;

//constructor.
public Basiceventhandling(){


//create components
tf = new TextField();
tf.setBounds(60,50,170,20);


Button b = new Button("Click me");
b.setBounds(100,120,80,30);

//register listener
b.addActionListener(this);//passing current object.

//add components in frame
add(b);add(tf);

//frame properties
setSize(300,300);
setLayout(null);
setVisible(true);
}

public void actionPerformed(ActionEvent e){
tf.setText("Welcome");

}

public static void main(String[] args){
Basiceventhandling g = new Basiceventhandling();
	}
}