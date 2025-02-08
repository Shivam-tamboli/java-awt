import java.awt.*;
import java.awt.event.*;

public class ButtonEventExample extends Frame implements ActionListener{

Button b1;
TextField t1;

public ButtonEventExample(){

setTitle("Button Example");

t1 = new TextField();
t1.setBounds(50,50,150,20);
add(t1);

b1 = new Button("Click here");
b1.setBounds(50,100,60,30);
b1.addActionListener(this);
add(b1);


setSize(400,400);
setLayout(null);
setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e){
	t1.setText("Welcome to javaTpoint");
}

public static void main(String[] args){

	new ButtonEventExample();

	}
}