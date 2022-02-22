package Collection;

import java.util.TreeSet;

import java.util.Iterator;

public class SetEx5 {
public static void main(String[] args) {
	TreeSet ts = new TreeSet();
	ts.add("ram");
	ts.add("motu");
	ts.add("deepak");
Iterator itr = ts.iterator();	
while(itr.hasNext())
{
	System.out.println(itr.next());
}

}
}
