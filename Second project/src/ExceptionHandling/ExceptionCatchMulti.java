package ExceptionHandling;

public class ExceptionCatchMulti {
public static void main(String[] args) {
      String s= null;
	//String s = "vivek";
	try
	{
		System.out.println("length:"+s.length());
		System.out.println("charcter at 6 position:"+s.charAt(5));
	
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("string choti hai");
	}
	catch(NullPointerException e)
	{
		System.out.println("string value ni hai ");
	}
	

	finally
	{
		System.out.println("done");
	}
	
}
}
