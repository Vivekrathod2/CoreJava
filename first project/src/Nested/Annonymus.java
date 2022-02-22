package Nested;

public class Annonymus 
{
public static void main(String[] args) 
{
	Thread myThread = new Thread()
			{
		@Override
		public void run()
		{
			System.out.println("thread using annonymus");
		}
			};
	
		myThread.start();
}
}
