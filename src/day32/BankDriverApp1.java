package day32;

import java.util.Scanner;

public class BankDriverApp1 {
	public static void main(String[] args) {

		BankingServices bank = new HDFCBank(5000.0);
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("*****MENU******");
			System.out.println("1. Show Balanace ");
			System.out.println("2. Deposit ");
			System.out.println("3. Withdraw ");
			System.out.println("0. Exit ");

			System.out.println("Enter choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Bank Balance is " + bank.showBalance());
				break;

			case 2:
				System.out.println("Enter Deposit Amount");
				double depositAmount = sc.nextDouble();
				if (depositAmount >= 0)
					bank.deposit(depositAmount);

				break;

			case 3:
				System.out.println("Enter Withdraw Amount");
				double withdrawAmount = sc.nextDouble();
				if (withdrawAmount >= 0 && withdrawAmount <= bank.showBalance())
					bank.withdraw(withdrawAmount);
				else
					System.out.println("Please enter valid amount");
				
				break;
				
			case 0 : System.out.println("Thank You for Banking with us");
					 System.exit(0);
					 
			default : System.out.println("Invalid Input");
			}
			

		} while (choice != 0);

	}
}
