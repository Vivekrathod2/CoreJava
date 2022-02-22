package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapEx5 {
	public static void main(String[] args) {
		Map<Integer, String> hs= new HashMap<Integer, String>();
		hs.put(10,"arpit");
		hs.put(20, "deepak");
		//hs.put(30, "Tarun");
		hs.put(null, "percent");
		hs.put(null, "maths");
		Set set = hs.entrySet();
		for(Object o: set)
		{
			Map.Entry<Integer, String> m= (Entry<Integer,String>)o;
			System.out.println("key:"+m.getKey());
			System.out.println("value:"+m.getValue());
		}
	}

}
