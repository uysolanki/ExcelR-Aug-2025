package day32;

public class BankDriverApp {

	public static void main(String[] args) {
		
		BankingServices bank=new HDFCBank(5000.0);
		
		System.out.println("Bank Balance is " +bank.showBalance());
		
		bank.deposit(2000.0);
		
		System.out.println("Bank Balance is " +bank.showBalance());
		
		bank.withdraw(3000.0);
		
		System.out.println("Bank Balance is " +bank.showBalance());

	}

}
