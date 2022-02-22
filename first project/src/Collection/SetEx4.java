package Collection;

import java.util.LinkedHashSet;

import java.util.Iterator;

public class SetEx4 {
public static void main(String[] args) {
	LinkedHashSet lhs= new LinkedHashSet();
	lhs.add(105);
	lhs.add(103);
	lhs.add(104);
	lhs.add(106);
	Iterator itr = lhs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}
