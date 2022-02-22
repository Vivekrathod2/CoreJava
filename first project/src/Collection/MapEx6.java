package Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import java.util.Map.Entry;

public class MapEx6 {
public static void main(String[] args) {
	LinkedHashMap ls = new LinkedHashMap();
	ls.put(102,"decor");
	ls.put(101, "vivek");
	ls.put(103,"rathod");
	
	Set set = ls.entrySet();
	for(Object o: set)
	{
		Map.Entry m= (Entry)o;
		System.out.println("key:"+m.getKey());
		System.out.println("value:"+m.getValue());

}
	Set keyset = ls.keySet();
	for(Object o:keyset)
	{
		System.out.println(" keyset"+keyset);
		
	}
}
}
