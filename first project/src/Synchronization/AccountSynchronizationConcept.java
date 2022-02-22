package Synchronization;

// Block Synchronization

import java.util.Scanner;

class Account1
	{
		private int bal;
		public Account1(int bal)
		{
			this.bal=bal;

		}
		public boolean isSufficientBalance(int w)
		{
			if (bal>=w) 

				return(true);
			else 
				return(false);
		}
		public void withdraw(int amt)		
		{
			bal=bal-amt;	
			System.out.println("WithdrawL money is  "+amt);
			System.out.println("your current balance is  "+bal);
		}
	}
	class Counter implements Runnable
	{
		private String name;
		private Account1 account;	
		public Counter(Account1 account,String n )
		{
			this.account = account;
			name=n;
		}

		public void run()
		{
			Scanner kb=new Scanner(System.in);
			synchronized(account) 
			{
			System.out.println(name+",Enter amount to withdrawl");
			int amt=kb.nextInt(); 
				if (account.isSufficientBalance(amt))	
				{ 
					System.out.println(name);
					account.withdraw(amt);
				}
				else
				{	
					
					System.out.println("insufficient balance");	
				}
			}
		}
	}
		public  class AccountSynchronizationConcept 
		{
			public static void main(String[] args) 
			{
				Account1 account = new Account1(10000);
				Counter c1 = new Counter(account,"raj");
				Counter c2=new Counter(account,"Simran");
				Thread t1=new Thread (c1);
				Thread t2=new Thread (c2);
				t1.start();
				t2.start();
			}
		}
	

