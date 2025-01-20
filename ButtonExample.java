import java.awt.*;

public class ButtonExample extends Frame{

public ButtonExample(){

Button b = new Button("Click me");

b.setBounds(50,100,80,30);

add(b);

setSize(300,300);

setTitle("Button Example");

setLayout(null);

setVisible(true);
}

public static void main(String[] args){
ButtonExample p = new ButtonExample();
	}
}