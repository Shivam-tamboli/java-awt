import java.awt.*;

public class Clickbutton  extends Frame{

//constructor
public Clickbutton(){


//create button
Button b = new Button("Click me");

//set button's position
b.setBounds(30,100,80,30);

//add button into frame's
add(b);

//button frame size
setSize(300,300);

//set title
setTitle("This is our basic AWT Example");

//no layout manager
setLayout(null);

//visibility
setVisible(true);
}


public static void main(String[] args){
//creating instance of frame class
Clickbutton f = new Clickbutton();

}
}