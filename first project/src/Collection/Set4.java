package Collection;

import java.util.HashSet;

public class Set4 {
public static void main(String[] args) {
	HashSet set = new HashSet();
	set.add("mobile");
	set.add("honor");
	set.add("phone");
	for(Object o: set)
	{
		System.out.println(o);
	}
}
}
