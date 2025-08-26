package day4;

public class Sum1to5 {
public static void main(String[] args) {  //1  2 3 4 5
	int i;
	
	int sum=0;
	
	i=1;
	while(i <=  5)					//sum			i
	{								//0				1
		sum=sum+i;					//1				2
									//3				3
		i=i+1;						//6				4
	}								//10			5
									//15			6
	System.out.println("Sum is "+sum);
	System.out.println("I is "+i);
}
}
