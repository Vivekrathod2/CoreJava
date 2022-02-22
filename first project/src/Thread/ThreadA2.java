package Thread;

public class ThreadA2 implements Runnable
{
@Override
public void run()
{
	System.out.println("thread is running");
}

public static void main(String[] args) {
	ThreadA2 a = new ThreadA2();
	Thread th = new Thread(a);
	th.start();
}
}
