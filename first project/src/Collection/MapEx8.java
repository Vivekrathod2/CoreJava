package Collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx8 {
public static void main(String[] args) {
	TreeMap tm = new TreeMap();
	tm.put(101, "vivek");
	tm.put("rathod", "computer");
	tm.put(102, "class");
	Set set = tm.entrySet();
	for(Object o: set)
	{
	Map.Entry m=(Entry)o;
	System.out.println("key:"+m.getKey());
	System.out.println("value:"+m.getValue());
	}
}
}
