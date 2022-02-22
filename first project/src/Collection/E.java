package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class E {
public static void main(String[] args) {
	ArrayList l =new ArrayList();
	l.add(10);
	l.add(20);
	l.add(30);
	
	l.add(40);
	Iterator it = l.iterator();
	while( it.hasNext() )
	{
		System.out.println(it.next());
	
}
}
}