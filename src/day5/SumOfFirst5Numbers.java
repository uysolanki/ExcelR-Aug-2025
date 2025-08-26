package day5;

public class SumOfFirst5Numbers {

	public static void main(String[] args) {
		
		int sum=0;
		int i;
		for(i=1; i<=5 ; i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Total chocolates collected "+sum);
	}

}
