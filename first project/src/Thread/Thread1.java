package Thread;

class Technical extends Thread
{
	public void run()
	{
		for(int i=1; i<10; i++)
		{
			System.out.println(""+i);
		}
	}

}
class Technical1 extends Thread
{
	public void run()
	{
		for(int j=91; j<100; j++)
		{
			System.out.println(""+j);
		}
	}
}
public class Thread1 {
public static void main(String[] args) {
	Technical v = new Technical();
	Technical1 v1 = new Technical1();

//Thread t = new Thread(v);
//Thread t1 = new Thread(v1);
	
v.start();
	v1.start();

	
}
}
