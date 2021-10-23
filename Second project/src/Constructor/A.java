package Constructor;

public class A {

	private String name =null;
	private String address = null;
	public A()
	{
		System.out.println("default constructor");
	}

	public A (String n, String w)
	{
		name = n;
		address = w;
	System.out.println("parameter constructor ");
	}
	
	public String getName() 
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	
}
