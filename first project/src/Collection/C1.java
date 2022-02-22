package Collection;

import java.util.ArrayList;

public class C1 {
public static void main(String[] args) 
{ 
	

	ArrayList a= new ArrayList();
	a.add("vivek");
	a.add(2.5f);
	a.add(30);
	System.out.println("using for loop");
	int i=0;
do {
	System.out.println(a.get(i));
	i++;
	
}while(i<a.size());
}
}