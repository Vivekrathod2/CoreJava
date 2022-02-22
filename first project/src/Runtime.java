 class Cable
{
	public void test(int i)
	{
		System.out.println("inside parent demo");
	}
}
class pen extends Cable
{
	public void test(float a)
	{
	System.out.println("inside child demo");
}
}
public class Runtime
{
public static void main(String[] args) {
	

	
	Cable p = new pen();
		p.test(10);
		//p.test(3.5f);
	}
}

