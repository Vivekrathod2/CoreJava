package Block;
class Y
{
	int i=10;
	
	{
		System.out.println();
		System.out.println("iib");
	}

Y(int j)
{
	i=j;		
	}
}
public class D 
{
public static void main(String[] args)
{
Y a = new Y (20);
System.out.println(a.i);
}
}