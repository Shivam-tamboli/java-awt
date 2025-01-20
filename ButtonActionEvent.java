import java.awt.*;
import java.awt.event.*;

public class ButtonActionEvent extends Frame{

//declaring a var.
TextField tf;

public ButtonActionEvent(){

tf = new TextField();
tf.setBounds(50,50,150,20);

Button b = new Button("Click Here");
b.setBounds(50,100,100,30);

//event occuring
b.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	tf.setText("Welcome to javapoint");

	}
 });

//adding into frame
add(tf);add(b);

//properties
setSize(300,300);
setLayout(null);
setVisible(true);

}

public static void main(String[] args){
 new ButtonActionEvent();	

	}

}