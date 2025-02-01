import java.awt.*;

public class Textfieldexample extends Frame{

TextField t1,t2;


public Textfieldexample(){

//created object.
t1 = new TextField("Welcome to javatpoint");
//will set the location.
t1.setBounds(50,100,200,30);

//created another object.
t2 = new TextField("AWT Tutorial");
//will set the location
t2.setBounds(50,150,200,30);

//add into frame
add(t1);
add(t2);

//size, visibility, layout

setSize(400,400);
setLayout(null);
setVisible(true);
	}

public static void main(String args[]){
	Textfieldexample tf = new Textfieldexample();

	}
}