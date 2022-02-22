package Block;

public class C {

}
class Cover
{
	{
		System.out.println("iib instace initializtion block1");
	}	
}
class Glass extends Cover
{
	{
		System.out.println(" iib 2");
	}
	public static void main(String[] args) {
		System.out.println("start");
		Glass g = new Glass();
		System.out.println("end");
		
	}
}