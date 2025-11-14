package day39;

public class ThreadsUsingLambda {
public static void main(String[] args) {
	
	Runnable numericThread = () -> {
		for (int i = 1; i <= 26; i++)
			System.out.println(i);
	};

	Thread tx = null;
	
	tx=new Thread(numericThread);
	tx.start();

	Runnable alphaThread = () -> {
		for (int i = 'A'; i <= 'Z'; i++)
			System.out.println("\t" +i);
	};

	tx = new Thread(alphaThread);
	tx.start();
	
}
}
