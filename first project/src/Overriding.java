
class Iphone{
public void sum( int i )
	{
		System.out.println("run time polymorphism");
	}}
class Over extends Iphone
{
	public void sum(float i)
	{
		System.out.println("109");
}
}
public class Overriding
{
	public static void main(String[] args) {
		Iphone obj = new Over();
		obj.sum(20);
		//obj.sum(10.5f);
		}
}
