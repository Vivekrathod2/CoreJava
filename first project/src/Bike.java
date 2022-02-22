
public class Bike {
	final void run()
	{
		System.out.println("run");
	}
}
class Honda extends Bike
{
	void run()

{
		System.out.println("run safetly");
}public static void main(String[] args) {
	Honda h = new Honda();
	h.run();
}
}
