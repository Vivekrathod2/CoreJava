package Collection;

import java.util.HashMap;

public class MapEx1 {
public static void main(String[] args) {
	HashMap<Integer, String> m = new HashMap<Integer, String>();
	m.put(10, "vivek");
    m.put(10, "rathod");
	Object value = m.get(10);
	System.out.println("value :"+value);
}
}
