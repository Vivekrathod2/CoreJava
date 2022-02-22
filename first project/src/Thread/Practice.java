package Thread;
class Thead extends Thread
{
	public void run()
	{
	 for(int i=1; i<5; i++)
	 {
		 System.out.println("thread"+i);
	 }
	}
}
class Thead1 implements Runnable
{
	public void run()
	{
	 for(int j=91; j<100; j++)
	 {
		 System.out.println("1 thread "+j);
	 }
	}
}

public class Practice {
public static void main(String[] args) {
	Thead v = new Thead();
	Thead1 v1 = new Thead1();
	
	Thread t = new Thread(v1);
	
	 v.start();
	 t.start();
}
}
