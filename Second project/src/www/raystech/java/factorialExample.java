package www.raystech.java;

public class factorialExample {
public static void main(String[] args) {
	int i, fact =1, n = 5;
	for ( i=1; i<=n; i++)
	{
		fact = fact *i;
	}
	System.out.println("factorial of "+n+"is:"+fact);
}
}
