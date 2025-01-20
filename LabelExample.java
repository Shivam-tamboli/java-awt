import java.awt.*;

public class LabelExample extends Frame{

Label l1,l2;

public LabelExample(){

l1 = new Label("Label 1");
l1.setBounds(50,100,100,30);

l2 = new Label("Label 2");
l2.setBounds(50,150,100,30);

add(l1);
add(l2);

setSize(300,300);

setTitle("Label Example");

setLayout(null);

setVisible(true);
}

public static void main(String[] args){
	new LabelExample();

	}
}