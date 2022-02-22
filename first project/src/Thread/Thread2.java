package Thread;
class Mobile extends Thread 
{
	public void run()
	{
		{
			for(int i=0; i<5; i++ )
			{
		System.out.println("thread " +i);
	}
}
}
}
public class Thread2 {
public static void main(String[] args) {
	Mobile m= new Mobile();
	m.start();
	m.start();
}
}
