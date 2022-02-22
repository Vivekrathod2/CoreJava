package Block;

public class A {
	public static void main(String[] args) {
		System.out.println("start");
		A a = new A();
		A b = new A();
		System.out.println("end");
	}
	{
		System.out.println("lib");
	}
	static
	{
		System.out.println("sib1");
	}
	static 
	{
		System.out.println("sib2");
	}
	static
	{
		System.out.println("sib3");
	}
}
