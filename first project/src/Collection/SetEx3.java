package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx3 {
public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	 set.add("rits");
	set.add(null);
	set.add(null);
	Iterator itr = set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
