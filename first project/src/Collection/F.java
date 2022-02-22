package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class F 
{
public static void main(String[] args)
{
	ArrayList arr = new ArrayList();
	arr.add(1);
	arr.add(78);
	arr.add(79);
	arr.add(10);
	System.out.println("using list iterator");
	ListIterator l= arr.listIterator();
	System.out.println("forward direction:");
	while(l.hasNext())
	{
		System.out.println(l.next());
	}
	System.out.println("backward direction:");
	while(l.hasPrevious())
	{
		System.out.println(l.previous());
	}
}
}
