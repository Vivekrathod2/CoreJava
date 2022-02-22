package Constructor;
class Pencil
{
	public Pencil()
	{
		System.out.println("default");
	}
	public Pencil(int i)
	{
		System.out.println("vivek");
	}
	
}
public class Iphone extends Pencil
{
	public Iphone()
	{
		super(3);
		System.out.println("rathod");
}
public static void main(String[] args) {
	Iphone i = new Iphone();
	
}
}
