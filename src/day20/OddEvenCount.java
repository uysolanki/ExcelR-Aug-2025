//count frequency of odd ad even numbers from an array
package day20;

public class OddEvenCount {
public static void main(String[] args) {
	int arr[]= {10,11,11,15,19,22};
	int oddCount=0;
	int evenCount=0;
	
	for(int num:arr)
	{
		if(num%2==0)
			evenCount++;
		else
			oddCount++;
	}
	
	System.out.println("Odd Number Count "+oddCount);
	System.out.println("Even Number Count "+evenCount);
}
}
