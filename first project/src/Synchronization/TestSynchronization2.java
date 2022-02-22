package Synchronization;

//without synchronization

class Table
{
	void printTable(int n)
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			System.out.println(""+e);
		     }
			System.out.println(""+i);
	}
}
}

class MyThread7 extends Thread
{
	Table t;
	MyThread7(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class MyThread8 extends Thread
{
	Table t;
	MyThread8(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
public class TestSynchronization2 {
public static void main(String[] args) {
	Table t= new Table();
	MyThread7 m1 = new  MyThread7(t);
	MyThread8 m2 = new  MyThread8(t);
	m1.start();
	m2.start();
}
}
