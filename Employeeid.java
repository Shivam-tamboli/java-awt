//in this class we are creating instance of the frame class, we will create textfield ,label, button.

import java.awt.*;

public class Employeeid{

//constructor
public Employeeid(){

//Created instances
Frame f = new  Frame();

Label l = new Label("Employee id");

Button b = new Button("Submit");

TextField t = new TextField();

//position
l.setBounds(20,80,80,30);
t.setBounds(20,100,80,30);
b.setBounds(100,100,80,30);

//adding in frame
f.add(l);
f.add(t);
f.add(b);

// size
f.setSize(400,300);

//title
f.setTitle("Employee info");

//no layout manager
f.setLayout(null);

//visibility
f.setVisible(true);
	}


public static void main(String[] args){
Employeeid d = new Employeeid();


	}
}