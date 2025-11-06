package day34;

public class Alpha extends Thread
{
	@Override
	public void run() {
		for(char i='A';i<='Z';i++)
		{
			System.out.println(i);
			
			try
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
