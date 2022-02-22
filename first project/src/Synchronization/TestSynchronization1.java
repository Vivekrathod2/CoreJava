
package Synchronization;

//synchronized method

public class TestSynchronization1 {
	public  int balance=10000;
	  public synchronized void withdraw(int withdraw)
		 {
			if(balance>=withdraw)
			{
				 balance= balance-withdraw;
		System.out.println(" previous balance :"+balance);
		 }
			else
			 {
				 System.out.println("current balance :"+balance);	 
			 }	 
	 
	  try
	  {
		  Thread.sleep(1000);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	   } 
	  public static void main(String[] args) 
	  {
	  	TestSynchronization1 ac = new TestSynchronization1();	
	  	
	  	MyThread1 t = new MyThread1(ac);
	  	MyThread2 t1 = new MyThread2(ac);
	  	
	  	
	  	t.start();
	  	t1.start();
	  	
	  	System.out.println("done"); 	
	  }
}

class MyThread1 extends Thread
 {
	public  TestSynchronization1 account;
  MyThread1(TestSynchronization1 account)
  {
		 this.account=account;
  }
  @Override
	 	 public void run()
	{
		account.withdraw(1000);
	 }
 }

 class MyThread2 extends Thread
 {
	 TestSynchronization1 account1;
	 MyThread2(TestSynchronization1 account1)
	 {
		 this.account1= account1;
	 }
	 @Override
	 public void run()
	 {
		 account1.withdraw(1000);
	 }
}