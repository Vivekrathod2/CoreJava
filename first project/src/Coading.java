class Cell
{
	public void test(int i)
	{
		System.out.println("java");
	}
}
class Scal extends  Cell
{
	public void test(float a)
	{
		System.out.println("c+");
	}
}
public class Coading {
	public static void main(String[] args)
	{
		
		Cell c = new Scal();
		c.test(10);
		//c.test(3.2f);
	}
}
