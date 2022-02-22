package Synchronization;

import java.util.Scanner;

//program for wait(), notify()

class Customer
 {
	 int amount =10000;
	 synchronized void withdraw(int amount)
	 {
		 if(this.amount<=amount)
		 {
			 System.out.println("Less balance; waiting for deposite");
			 System.out.println(" Error amount to deposite money");
			 try
			 {
				 
			 }
			 catch(Exception e)
			 {
				 
			 }
			 }
		 this.amount = amount;
		 System.out.println("Transaction successfull...");
		 System.out.println("current amount"+this.amount);
		 }
	 synchronized void  deposite(int amount1)
	 {
		 System.out.println("Deposite completed...");
		 System.out.println("Current amount"+this.amount);
		
	 }
	 }
public class Wait {
public static void main(String[] args) {
	Customer c = new Customer();
	System.out.println("Available balance is:"+c.amount);
	Scanner myObj= new Scanner(System.in);  // create scanner object
	System.out.println(" Enter amount to withdraw money");
	int amount=myObj.nextInt();
	new Thread()
	{
		public void run()
		{
			c.withdraw(amount);
		}
	}.start();
	new Thread()
	{
		 int amount1 = myObj.nextInt();
		 
		 public void run()
		 {
			 c.deposite(amount1);
		 }
	}.start();
}
}
	
