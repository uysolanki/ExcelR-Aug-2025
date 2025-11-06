package day34;

public class Alpha extends Thread
{
	@Override
	public void run() {
		for(char i='A';i<='Z';i++)
			System.out.println(i);
	}
}
