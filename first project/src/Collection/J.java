package Collection;

import java.util.ArrayList;

import java.util.Iterator;

public class J {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("vivek");
	al.add("rath");
	al.add("mass");
	
	Iterator it = al.iterator();
	al.add("vijay");
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}

}