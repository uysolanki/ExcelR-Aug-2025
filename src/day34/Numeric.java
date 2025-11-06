package day34;

public class Numeric implements Runnable
{
@Override
public void run() {
	for(int i=1;i<=26;i++)
	{
		System.out.println("\t"+ i);
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
}
