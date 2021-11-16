package ExceptionHandling;

public class ExceptionParent {
public static void main(String[] args) {
	//String name = "vivek";
	String  name = null;
	
	try {
	System.out.println("length:"+name.length());
	System.out.println("charcter at 7 position:"+name.charAt(6));
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("string choti hai");
	}catch(RuntimeException e)
	{
		System.out.println("string null hai");
	}
	finally
	{
		System.out.println("done dona done done");
	}
}
}
