package Collection;

import java.util.ArrayList;

public class Practice1 {
public static void main(String[] args) {
	ArrayList l = new ArrayList();
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	System.out.println("using for each loop");
	int i=0;
	do
	{
		System.out.println(l.get(i));
		i++;
	}while(i<l.size());
	//for(int i=0; i<l.size(); i++)
//		System.out.println("each for loop"+i);
}
}