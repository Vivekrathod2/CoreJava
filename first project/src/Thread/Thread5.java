package Thread;

public class Thread5 extends Thread {
public void run()
{
	
}
public static void main(String[] args) {
	Thread5 t1 = new Thread5();
	System.out.println(" default priority :"+t1.getPriority());
	t1.setPriority(15);
	System.out.println(" after change priority :"+t1.getPriority());
	t1.start();
}
}
