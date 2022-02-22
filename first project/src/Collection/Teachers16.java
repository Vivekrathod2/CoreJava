package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Vickys 
{
	int id;
	String name;

	public Vickys(int id, String name) 
	{
		super();
		this.id = id;
		this.name= name;
	}
}

class SortByname implements Comparator
{
	@Override
	public int compare(Object o1, Object o2)
	{
	Vickys c1 =(Vickys)o1;
	Vickys c2 =(Vickys)o2;
	return c1.name.compareTo(c2.name);
	
}
}
class SortById implements Comparator
{@Override
	public int compare(Object o1, Object o2) 
	{
		Vickys c1 =(Vickys)o1;
		Vickys c2 =(Vickys)o2;
		return c1.id-c2.id;
	}
}
public class Teachers16 
{
	public static void main(String[] args) 
	{
		Vickys s= new Vickys(5, "rits");
		Vickys s1 = new Vickys(10, " kush");
		Vickys s2 = new Vickys(89,"deepak");
		Vickys s3= new Vickys(21,"monu");

		ArrayList l = new ArrayList();
		l.add(s);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		//System.out.println(l);
		System.out.println("before sorting");
		for(Object o: l)
		{
			Vickys c1 =(Vickys)o;
			System.out.println(c1.id);
					}
		Collections.sort(l,new SortById());
		System.out.println("after sorting");
		for(Object o: l)
		{
			Vickys c1 =(Vickys)o;
			System.out.println(c1.id);
		
		}
	}

}