package Collection;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class K {
public static void main(String[] args) 
{
	CopyOnWriteArrayList cpy = new CopyOnWriteArrayList();
	cpy.add("vivek");
	cpy.add("mass");
	cpy.add("rathod");
	
	Iterator it = cpy.iterator();
	cpy.add("my data");
//	Iterator it1 = cpy.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
