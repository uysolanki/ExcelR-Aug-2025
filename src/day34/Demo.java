package day34;

public class Demo {

	public static void main(String[] args) {

		Alpha thread1=new Alpha();
		Numeric thread2=new Numeric();
		
		Thread tx=new Thread(thread2);
		thread1.start();
		tx.start();
		
//		for(int i=27;i<=52;i++)
//			System.out.println("\t\t"+ i);

	}

}
