package ExceptionHandling;

public class Arith1 {
public static void main(String[] args) {
	try {
	double div = 10/0;
	System.out.println("double:"+div);
	}catch(ArithmeticException e)
	{
		System.out.println("dived by zero:"+e);
	}
}
}
