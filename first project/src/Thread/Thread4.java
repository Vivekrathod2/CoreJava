package Thread;

public class Thread4 extends Thread
{
	public void run()
	{
		
	}

public static void main(String[] args) {
	Thread4 t = new Thread4();
	System.out.println("default priority  :  "+t.getPriority());
	t.setPriority(10);
	System.out.println("priority after change  :"+t.getPriority());
	t.start();
}
}
