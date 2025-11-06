package day34;

public class BankDriver {

	public static void main(String[] args) {
		Bank bank=new Bank(5000);
		
		Son thread1=new Son(bank);
		Father thread2=new Father(bank);
		
		thread1.start();
		thread2.start();
	}

}
