package Synchronization;

//program for static synchronization

public class Account {
	private static  int balance=10000;
	  public synchronized void withdraw(int withdraw)
		 {
			if(balance>=withdraw)
			{
				 balance= balance-withdraw;
		System.out.println(" withdraw amount :"+balance);
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
	  	Account ac = new Account();	
	  	
	  	MyThread3 t = new MyThread3(ac);
	  	MyThread4 t1 = new MyThread4(ac);
	  	
	  	
	  	t.start();
	  	t1.start();
	  	
	  	System.out.println("done"); 	
	  }

}

class MyThread3 extends Thread
{
		public  Account account;
	  MyThread3(Account account)
	  {
			 this.account=account;
	  }
	  @Override
		 	 public void run()
		{
			account.withdraw(5000);
		 }
	
}
class MyThread4 extends Thread
{
	 Account account1;
	 MyThread4(Account account1)
	 {
		 this.account1= account1;
	 }
	 @Override
	 public void run()
	 {
		 account1.withdraw(3000);
	 }
	 
	 }


