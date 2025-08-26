package day4;

public class LoopDemo1 {

	public static void main(String[] args) {
		//System.out.println("Alice");			//task
		
		int i;
		int sum=0;
		i=1;		//initialisation
		while(i<=5) //condition
		{
			sum=sum+i;
			i=i+1;    //increment
		}
		System.out.println("Sum is" + sum);
	}

}

/*
Alice1
Alice2
Alice3
Alice4
Alice5
 */