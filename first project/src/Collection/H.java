package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class H {
public static void main(String[] args) {
	Vector v= new Vector();
	v.add("ram");
	v.add("kush");
	v.add("mass");
	Enumeration enum1 = v.elements();
	while(enum1.hasMoreElements())
	{
		System.out.println(enum1.nextElement());
	}
}
}
