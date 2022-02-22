package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map4 {
public static void main(String[] args) {
	Map<Integer,String> s = new HashMap<Integer,String>();
	s.put(10, "rits");
	s.put(20, "kush");
	s.put(30, "mukul");
	
	Set Keyset= s.keySet();
	System.out.println("hjg:"+s.keySet());
}
}
