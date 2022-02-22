package Block;
public class B {
	public static void main(String[] args) {
		System.out.println("main start");
		Battery b = new Battery();
		System.out.println("main end"
				+ "");
	}

}
class Charger
{
static
{
	System.out.println("parent class");
}
}
class Battery extends Charger
{
	static
{
	System.out.println("class child");
}


}