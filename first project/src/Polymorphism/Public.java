package Polymorphism;

public class Public {
	public int i=10;
	public void temp()
	{
		System.out.println("inside demo method");
	}
	public static void main(String[] args) {
		Public obj = new Public();
		obj.temp();
		System.out.println(obj.i);
	}

}