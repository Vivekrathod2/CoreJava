package Method;

public class C {
	public int getSum()
	{
		int a=10,b=5;
		return a+b;
	}
	public static int getValue()
	{
		return 0;
	}
public static void main(String[] args) {
	C obj = new C();
	int sum = obj.getSum();
	int value = obj.getValue();
System.out.println(sum+"summation of two integer value");
System.out.println(value+"value returned by method");
}
}
