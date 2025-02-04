import java.awt.*;

public class CheckBoxExample extends Frame{

public CheckBoxExample(){

Checkbox c1 = new Checkbox("c++");
c1.setBounds(100,100,50,50);

Checkbox c2 =new Checkbox("java");
c2.setBounds(100,150,50,50);

add(c1);add(c2);

setSize(400,400);
setLayout(null);
setVisible(true);
}

public static void main(String[] args){
	new CheckBoxExample();
	}
}