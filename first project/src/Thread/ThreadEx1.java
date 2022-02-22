package Thread;
 
public class ThreadEx1 extends Thread
{
	@Override
public void run()
{
	for(int i=1; i<10; i++)
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
	ThreadEx1 th = new ThreadEx1();
	     th.start();
	 
	     System.out.println("dfault priority:"+th.getPriority());
	     th.setPriority(10);
	     System.out.println("change priority :"+th.getPriority());
	     
	     System.out.println("default name :"+th.getName());
	     th.setName("vivek");
	     System.out.println("change name:"+th.getName() );
	     
	     System.out.println("getState:" +th.getState());
	}
}
