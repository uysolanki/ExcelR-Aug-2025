package day33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticExceptionDemo3 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
		System.out.println("Enter Numerator");
		int num=Integer.parseInt(br.readLine()); //10
		
		System.out.println("Enter Denominator");
		int den=Integer.parseInt(br.readLine()); //0
		
		int result=num/den;
		}
		catch(IOException e1)
		{
			
		}
		catch(ArithmeticException e2)
		{
			System.out.println(e2.getMessage()); //  / by zero
		}
		
	
		}
		

}
