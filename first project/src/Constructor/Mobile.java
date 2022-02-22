package Constructor;

public class Mobile {
	public Mobile()
	{
		this (5);
		System.out.println("vivek");
	}

public Mobile(int a, int b)
{
	System.out.println("rathod"+a+"and"+b);
}

public Mobile (int c)
{
	this (3,4);
System.out.println("copy"+c);
}
public static void main(String[] args) {
	Mobile s1 = new Mobile();
}

}
