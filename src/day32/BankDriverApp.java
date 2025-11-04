package day32;

import java.util.Scanner;

public class BankDriverApp {

	public static void main(String[] args) {
		
		BankingServices bank=new HDFCBank(5000.0);
		Scanner sc=new Scanner(System.in);
		System.out.println("Bank Balance is " +bank.showBalance());
		
		System.out.println("Enter Deposit Amount");
		double depositAmount=sc.nextDouble();
		if(depositAmount>=0)
			bank.deposit(depositAmount);
		
		System.out.println("Bank Balance is " +bank.showBalance());
		
		System.out.println("Enter Deposit Amount");
		double withdrawAmount=sc.nextDouble();
		if(withdrawAmount>=0  && withdrawAmount<=bank.showBalance())
			bank.withdraw(withdrawAmount);
		else
			System.out.println("Please enter valid amount");
		
		
		System.out.println("Bank Balance is " +bank.showBalance());

	}

}
