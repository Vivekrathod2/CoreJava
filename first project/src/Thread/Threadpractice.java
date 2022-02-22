package Thread;
class Decor extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++) 
		{
			System.out.println(""+i);
		}
	}
}
class Decor1 extends Thread
{
	public void run()
	{
		for(int i=91; i<100;i++)
		{
			System.out.println(""+i);
		}
	}
}

public class Threadpractice {
	public static void main(String[] args) {	
	Decor d = new Decor();
	Decor1 d1 = new Decor1();
	
	d.start();
	d1.start();
	
	System.out.println("default priority  :"+d.getPriority());
	d1.setPriority(10);
	System.out.println("change priority :"+ d1.getPriority());
	
	System.out.println("default name of d:"+d.getName());
	System.out.println("default name of d1 name :"+d1.getName());
	d.setName("vivek");
	d1.setName("Rathod");
	System.out.println("change name of d :"+d.getName());
	System.out.println("change name of d1:"+d1.getName());
	
	System.out.println();
	}
}
	
