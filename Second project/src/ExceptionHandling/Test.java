package ExceptionHandling;

public class Test {
public static void main(String[] args) {
	double d = 10/0;
	try {
		
		try
		{
			double div = 10/0;
			System.out.println("divide:"+div);
		}catch(ArithmeticException e)
		{
			System.out.println("divide by zero");
		}

		
	} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
