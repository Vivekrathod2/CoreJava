package Collection;

import java.util.ArrayList;

public class C {
public static void main(String[] args) {
	ArrayList l = new ArrayList();
	l.add(1);
	l.add(2);
	l.add(4);
	l.add(10);
	System.out.println("using for loop");
	
	for(int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
}
}
