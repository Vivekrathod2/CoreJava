package Thread;

class Mobile1 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
	{
			System.out.println(" thread "+i);
	}
	}
	class Mobile2 extends Thread
	{
		public void run()
		{
			for(int i=90; i<100; i++)
		{
				System.out.println("thread"+i);
		}
		}
		
	}

}
public class ThreadExample {
public static void main(String[] args) {
	Mobile1 m1 = new Mobile1();
	Mobile2 m2 = new Mobile2();
	
	m1.start();
	m2.start();

	System.out.println("Thread state :"+m1.getState());
	System.out.println("thread state :"+m2.getState());
	
	System.out.println("default  priority m1:"+m1.getPriority());
	System.out.println("default  priority m2:"+m2.getPriority());
	
	m1.setPriority(10);
	m2.setPriority(10);
	System.out.println("change priority m1:"+m1.getPriority());
	System.out.println("change priority m1:"+m2.getPriority());
    
	}
}
