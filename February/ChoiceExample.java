import java.awt.*;

public class ChoiceExample extends Frame{


public ChoiceExample(){

Choice c = new Choice();

c.setBounds(100,100,75,75);

c.add("Item 1");
c.add("Item 2");
c.add("Item 3");
c.add("Item 4");

add(c);

setSize(400,400);
setLayout(null);
setVisible(true);
}

public static void main(String[] args){
	new ChoiceExample();
}

}