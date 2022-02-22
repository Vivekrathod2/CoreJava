package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Sanskar implements Comparable
{
	int id;
	String name ;
public Sanskar(int id, String name)
{
	super();
	this.id=id;
	this.name=name;
}
@Override
public String toString()
{
	return "name="+name+" "+"id="+id;
}

@Override

public int compareTo(Object o) {
	Sanskar t = (Sanskar)o;
return	this.id-t.id;
	}

}
public class Teacher14 
{
	public static void main(String[] args) 
	{	
		Sanskar s1 = new Sanskar(10,"vivek");
		Sanskar s2 = new Sanskar(89, "arpit");
		Sanskar s3 = new Sanskar(30, " vvv");
		ArrayList hs = new ArrayList();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		System.out.println(hs);
		System.out.println("before sorting");
		for(Object o:hs)
		{
			Sanskar t = (Sanskar)o;
			System.out.println(t.id);
		}
	Collections.sort(hs); //Sorting
		System.out.println("after sorting");
		for(Object o:hs)
		{
			Sanskar t = (Sanskar)o;
			System.out.println(t.id);
		}
		
}

}