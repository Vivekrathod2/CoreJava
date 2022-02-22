package Block;
class A
{
	int i;
	{
		int i=10;

		System.out.println();
		System.out.println("iib of parent");
	}
	A(int j)
	{
		i=j;
	
	}

	
}
public class Initializationiib 
{
	public static void main(String[] args) 
	{
		System.out.println("start");
		
		A k = new A(20);
		
		System.out.println(k.i);
		 
		System.out.println("end");
	}		
}