package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx3 {
public static void main(String[] args) {
	Map<Integer, String> hs = new HashMap<Integer, String>();
    hs.put(10, "rits");
    hs.put(20, "kush");
    hs.put(30, "vijay");
    
    Set set = hs.entrySet();
    for(Object o:set)
    {
   
	Map.Entry<Integer, String> m= (Entry<Integer,String>)o;
    {
    	System.out.println(m.getKey()+" "+m.getValue());
    }
    }
}
}
