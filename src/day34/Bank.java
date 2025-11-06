package day34;

public class Bank {

		private double balance;
		public Bank() {}
		public Bank(double balance)
		{
			this.balance=balance;
		}
		
		public synchronized void deposit(double dAmt)
		{	
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e.getMessage());
			}
			
			this.balance+=dAmt;
			notify();
		}
		
		public synchronized void withdraw(double wAmt)
		{
			if(wAmt>balance)
			{
				try
				{
					System.out.println("Insufficient Balance");
					wait();		
				} 
				catch (InterruptedException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			this.balance-=wAmt;
			System.out.println("Balance " + balance);
		}
}
