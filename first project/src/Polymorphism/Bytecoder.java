package Polymorphism;

public class Bytecoder {
	public void demo()
	{
		System.out.println("demo without any patrameter");
	}
	public void demo(int i)
	{
		System.out.println("demo with int type parameter:"+i);
	}
	public void demo (float j)
	{
		System.out.println("demo with float type parameter:"+j);
	}
	public static void main(String[] args) {
		Bytecoder b = new Bytecoder();
		b.demo();
		b.demo(6);
		b.demo(11.9f);
		
	}

}
