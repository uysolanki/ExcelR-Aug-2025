package day33;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println(divide(10,0));
	}

	public static int divide(int n,int d)
	{
		try
		{
			return n/d;
		}
		catch(ArithmeticException e1)
		{
			return 0;
		}
		finally
		{
			return 1;
		}
	}
}
