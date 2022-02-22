package Collection;

import java.util.ArrayList;

public class D {
public static void main(String[] args) {
	ArrayList l = new ArrayList();
	l.add(20);
	l.add(30);
	l.add(35);
	l.add(40);
	System.out.println("using for eachloop");
	for(Object o: l)
	System.out.println("each for loop"+o);
	
}
}
