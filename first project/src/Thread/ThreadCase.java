package Thread;

public class ThreadCase extends Thread
{
	public void run()
{
		System.out.println("thread is running");
}
public static void main(String[] args) {
	ThreadCase th = new ThreadCase();
	th.Start();
}
private void Start() {
	// TODO Auto-generated method stub
	
}
}
