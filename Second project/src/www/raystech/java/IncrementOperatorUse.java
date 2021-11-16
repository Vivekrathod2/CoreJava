package www.raystech.java;

public class IncrementOperatorUse {
public static void main(String[] args) {
	int i =3;
	//System.out.println(i++ + i++ + i++ + ++i);
	//System.out.println(i++ + ++i + i++ + i++ + ++i + i++ );
//	System.out.println(i++ + i++ + ++i + ++i + i++ + ++i);
                   //   5      6      8    9    9      11
	
//	System.out.println(i++ + ++i + i++ + ++i + ++i + i++ + ++i);
	
//	                    3     5    5       7
	//System.out.println(i++ + i++ + ++i + i++ + i++ + ++i + i++ + i++);
//						6    7     9	9 		10	12  	12		13
	
	System.out.println(i++ + ++i + i++ + ++i + i++ + i++ + i++ + ++i + ++i + ++i + i++ + ++i + i++);
					// 
}	
}
