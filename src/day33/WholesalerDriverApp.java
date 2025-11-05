package day33;

import java.util.Scanner;

public class WholesalerDriverApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter order quantity");
		int quantity=sc.nextInt(); 
		try
		{
		if(quantity>=500)
			System.out.println("Order Accepted");
		else
			throw new LowQuantityException("Please enter quantity > 500");
		}
		catch(LowQuantityException e1)
		{
			System.out.println(e1.getMessage());
		}

	}

}
