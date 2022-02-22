package Thread;

class Skybags implements Runnable
{
	public void run()
	{
		for( int i=1; i<10; i++)
		{
			System.out.println("thread"+i);
		}

	}	
}
class Skybags1 implements Runnable
{
	public void run()
	{
		for(int j=91; j<100; j++)
		{
			System.out.println("thread"+j);
		}
	}
}
public class Runnable1 {
public static void main(String[] args) {
Skybags s = new Skybags();
Skybags1 s1 = new Skybags1();


Thread t = new Thread(s);
Thread t1 = new Thread(s1);

t.start();
t1.start();
	
}
}
