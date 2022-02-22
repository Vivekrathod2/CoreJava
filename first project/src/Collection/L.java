package Collection;

import java.util.concurrent.CopyOnWriteArrayList;

import java.util.Iterator;

public class L {
public static void main(String[] args) {
	CopyOnWriteArrayList al = new CopyOnWriteArrayList();
al.add("vivek");
	al.add("rathod");
	al.add("mobile");
	
	Iterator it = al.iterator();
	al.add("my data");
	Iterator it2 = al.iterator();
	while(it2.hasNext())
	{
		System.out.println(it2.next());
	}
	
}}