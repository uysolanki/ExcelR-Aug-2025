package day20;

public class MobileNumber2 {
public static void main(String[] args) {
	long arr[]= {9890131231L,8888165531L,9890145731L,9890131888L,8888831231L};
	
	int arr1[]= {123,456,333};
	
	for(long num:arr)					//num		oc		ec		r		
	{	
		long mob=num;								//123		0		0		3
		int oddCount=0;
		int evenCount=0;
		
		while(num>0)
		{
			int r=(int)num%10;
			if(r%2==0)
				evenCount++;
			else
				oddCount++;
			
		num=num/10;
		}
		
//		System.out.println("Odd Number Count "+oddCount);
//		System.out.println("Even Number Count "+evenCount+"\n");
		
		System.out.print("Mobile Number " + mob+ " has " + oddCount + " Odd digits and " +evenCount +" Even digits");
		if(oddCount>evenCount)
			System.out.println(" and the number is ODD Biased");
		else if(oddCount<evenCount)
			System.out.println(" and the number is EVEN Biased");
		else
			System.out.println(" and the number is NEUTRAL");
	}
}
}



//Mobile Number 9890131231 has 6 Odd digits and 4 Even digits it is odd biased number , even biased , neutral