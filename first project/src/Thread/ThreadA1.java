package Thread;

public class ThreadA1 extends Thread {
public void run()
{
	System.out.println("thread is running");
}
public static void main(String[] args) {
	ThreadA1 a= new ThreadA1();
	a.start();
}
}
