package Thread;

public class Thread6 extends Thread
{
public static void main(String[] args) {
	Thread6 th1 = new Thread6();
	Thread6 th2= new Thread6();
	
	System.out.println("default name of th1   :"+th1.getName());
	System.out.println("default name of th2    :"+th2.getName());
	
	th1.setName("rits");
	th2.setName("kush");

	System.out.println("name of th1 :"+th1.getName());
	System.out.println("name of th2 :"+th2.getName());

	th1.start();
	th2.start();
}
}
