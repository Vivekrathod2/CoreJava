package Collection;
import java.util.Iterator;
import java.util.ArrayList;



public class Practice {
	public static void main(String[] args) 
	{
	ArrayList a = new ArrayList();
	a.add("vivek");
	a.add(10);
	a.add(2.5f);
	a.add(223.30d);
	a.add('A');
	System.out.println("by array list"+a);
	
	int i=0;
	System.out.println(" using do while");
	do
	{
		System.out.println(a.get(i));
		i++;
	}
	while(i<a.size());
	
	System.out.println("using for eachloop");
	for(Object o:a)
	{
		System.out.println(o);
	}
	System.out.println("using itetrator");
	Iterator it =  a.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	}
	
	

}
