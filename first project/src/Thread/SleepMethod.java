package Thread;


public class SleepMethod extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.print(" "+i);
		}
	}
	public static void main(String[] args) {
		SleepMethod s = new SleepMethod();
		SleepMethod s1 = new SleepMethod();
		
		s.start();
		s1.start();
		
	}
}