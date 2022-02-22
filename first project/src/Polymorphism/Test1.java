package Polymorphism;

public class Test1 {

	public void demo(int i, long j)
	{
		System.out.println("demo with int, long parameter");
	}
	public void demo(long l, int i)
	{
		System.out.println();
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.demo(10,10);
	}
}
