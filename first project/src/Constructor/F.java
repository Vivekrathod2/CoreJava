package Constructor;
abstract class First
{
	abstract int z (int a, int b);
	
}
public class F  extends First
{
	public int z (int a, int b)
	{
	return a+b ;
	}public static void main(String[] args) {
		F c = new F();
		int d = c.z(103, 20);
		System.out.println(d);
		
	}
}

