
package Thread;
class Mobile1 extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(this.getName()+" ");
		}
	}
}
class Mobile2 extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(this.getName()+" ");
		}
	}
}
public class Thread3 {
	public static void main(String[] args) {
	Mobile1 m= new Mobile1();
	m.run();
	Mobile2 m1 = new Mobile2();
	m1.run();
	}
}
