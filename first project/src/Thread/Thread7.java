package Thread;

public class Thread7 extends Thread{
@Override
public void run()
{
	System.out.println(this.getState());
}
public static void main(String[] args) {
	Thread7 t = new Thread7();
	System.out.println(t.getState());
	t.start();
}
}
