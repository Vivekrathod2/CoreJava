package Synchronization;

//program for block synchronization

class Printable
{
	public void printTabl(int n)
	{
		synchronized (this)
		{
			System.out.println("table of"+n);
			for(int i=1; i<=10; i++)
			{
				int s=n*i;
				System.out.println(n+"*"+i+"=>"+s);
				
				try {
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
public void ptable(int n)
{
	System.out.println("table of "+n);
	
		for(int i=1; i<=10; i++)
		{
			int s=n+i;
			System.out.println(s);
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
	}
}
 class PThread1 extends Thread
 {
	 Printable p1;
	 public PThread1(Printable p1)
	 {
		 this.p1=p1;
	 }
@Override
	 public void run()
	 {
		 p1.printTabl(2);
	 }
 }
 class PThread2 extends Thread
 {
	 Printable p2;
	 public PThread2(Printable p2)
	 {
		 this.p2=p2;
	 }
@Override
	 public void run()
	 {
		 p2.printTabl(5);
	 }
 }
 class PThread3 extends Thread
 {
	 Printable p3;
	 public PThread3(Printable p3)
	 {
		 this.p3=p3;
	 }
@Override
	 public void run()
	 {
		 p3.printTabl(50);
	 }
 }
 
public class Blocksyn 
{
	public static void main(String[] args)
	{
		Printable p = new Printable();
		Printable p1 = new Printable();

 PThread1 t=new PThread1(p);
 PThread2 t2=new PThread2(p);
 PThread3 t3=new PThread3(p1);
 t.start();
 t2.start();
 t3.start();
 
 
 
}
}