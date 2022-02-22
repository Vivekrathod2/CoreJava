package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Master implements Comparable 
{
	 int id;
	String name;
public Master() //default constructor
{
	
}
public Master(int id, String name)   //parameterized constructor
{
	super();
	this.id = id;
	this.name=name;
}

@Override
public int compareTo(Object o) {
	Master m = (Master)o;
	return this.name.compareTo(m.name);
}
}

public class Teacher15 
{
public static void main(String[] args) 
{
	Master st1 = new Master(10,"vivek");
	Master st2 = new Master(20,"motu");
	Master st3 = new Master(30,"mohit");
	Master st4 = new Master(40,"arpit");
	ArrayList l = new ArrayList();
	l.add(st1);
	l.add(st2);
	l.add(st3);
	l.add(st4);
	System.out.println("before sorting");
	for(Object o:l)
	{
		Master s = (Master)o;
		System.out.println(s.name);
	}
Collections.sort(l);
	System.out.println("after sorting");
	for(Object o:l)
	{
		Master s = (Master)o;
		System.out.println(s.name);
	}

}

}
