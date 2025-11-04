package day32;

public class HDFCBank implements BankingServices
{
    double balance;
    
    public HDFCBank() {}
    public HDFCBank(double balance)
    {
    	this.balance=balance;
    }
	@Override
	public double showBalance() {
		return this.balance;
	}

	@Override
	public void deposit(double depositAmount) {
		this.balance+=depositAmount;
		
	}

	@Override
	public void withdraw(double withdrawAmount) {
		this.balance-=withdrawAmount;
		
	}

}
