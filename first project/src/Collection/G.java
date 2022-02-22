package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class G {
public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.add("ram");
	list.add("kush");
	list.add("mash");
	ListIterator it = list. listIterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
