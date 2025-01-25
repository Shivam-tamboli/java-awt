import java.awt.*;
import java.awt.event.*;

public class Labelipaddress extends Frame implements ActionListener{

//var.
TextField tf;
Label l;
Button b;

//constructor.
public Labelipaddress(){

//object and position
tf = new TextField();
tf.setBounds(50,50,150,20);

l = new Label();
l.setBounds(50,100,200,20);

b = new Button("Click me");
b.setBounds(50,150,60,30);
b.addActionListener(this);

//adding into frame
add(tf);
add(l);
add(b);

setTitle("IP address");
setSize(300,300);
setLayout(null);
setVisible(true);
}

public void actionPerformed(ActionEvent e){
try{
	//website address
	String host = tf.getText();
	String ip = java.net.InetAddress.getByName(host).getHostAddress();
	l.setText("IP of " + host + " is: " + ip);


	}
catch(Exception ex){
	System.out.println(ex);	
	
	}

}

public static void main(String[] args){

	new Labelipaddress();
	}
}