package day20;

public class MobileNumber {
public static void main(String[] args) {
	long arr[]= {9890131231L,9890165531L,9890145731L,9890131888L,9890131231L};
	
	int arr1[]= {123,456,333};
	
	for(int num:arr1)					//num		oc		ec		r		
	{	
		int mob=num;								//123		0		0		3
		int oddCount=0;
		int evenCount=0;
		
		while(num>0)
		{
			int r=num%10;
			if(r%2==0)
				evenCount++;
			else
				oddCount++;
			
		num=num/10;
		}
		
//		System.out.println("Odd Number Count "+oddCount);
//		System.out.println("Even Number Count "+evenCount+"\n");
		
		System.out.println("Mobile Number " + mob+ " has " + oddCount + " Odd digits and " +evenCount +" Even digits");
	}
}
}



//Mobile Number 9890131231 has 6 Odd digits and 4 Even digits