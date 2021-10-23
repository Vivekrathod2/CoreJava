package www.raystech.java;

public class Test {
	static int factorial(int n)
	{
		int fact = 1 , i;
		for (i=1; i<=n; i++)
		fact *= i;
		return fact;
		
	}

public static void main(String[] args) {
	int num=5;
	System.out.println("Factorial of "+num + "is" +factorial(5));

}
}