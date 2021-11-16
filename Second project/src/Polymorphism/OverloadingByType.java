package Polymorphism;

public class OverloadingByType {
	
	public int add (int a  , int b)
	{
		return a+b;
	}
	public float add(int a, float b)
	{
	return a+b;	
}
	public static void main(String[] args) {
		OverloadingByType d = new OverloadingByType ();
	
		System.out.println(d.add(10,20));
		System.out.println(d.add(10, 2.5f));
	}
	
}

