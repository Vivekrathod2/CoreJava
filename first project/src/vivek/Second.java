package vivek;
abstract class main
{
	abstract void temp();
}
public class Second extends Main
{
	public void temp()
	{
		System.out.println("vivek");
	}
public static void main(String[] args) {
	Second ob = new Second();
	ob.temp();
}
}