package Collection;

import java.util.TreeSet;

public class SetEx6 
{
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add("ram");
		ts.add(null);
		ts.add("vivek");
		for(Object o:ts)
		{
			System.out.println(o);
		}

}
}