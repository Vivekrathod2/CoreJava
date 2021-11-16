package ExceptionHandling;

public class ExceptionParentChild {
public static void main(String[] args) {
	String name = "vivek";
	try {
	System.out.println("length name :"+name.length());
	System.out.println("character on 7 position:"+name.charAt(5));
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("String abhi choti hai ");
	}
	
	catch(RuntimeException e)
	{
		System.out.println("error:"+e.getMessage());
	}
	
}
}




