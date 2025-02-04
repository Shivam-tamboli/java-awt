import java.awt.*;

public class ListExample extends Frame(){

public ListExample(){

List l = new List(5);

l.setBounds(100,100,75,75);

l.add("java");
l.add("c++");
l.add("c");
l.add("python");
l.add("html")

setSize(500,500);
setLayout(null);
setVisible(true);
}

public static void main(String[] args){
	new ListExample();
	}
}
