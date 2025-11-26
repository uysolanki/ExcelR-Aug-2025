package day31;

import java.io.FileNotFoundException;

public class Abhishek extends Amitabh

{
	public String qualification="BCOM";
	@Override
	public void car()
	{
		System.out.println("Mercedes");
	}
	
//	@Override
//	public void home()
//	{
//		System.out.println("New Jalsa");
//	}
	
//	@Override
//	public void home() throws FileNotFoundException
//	{
//		System.out.println("New Jalsa");
//	}
	
	@Override
	public void home() throws RuntimeException
	{
		System.out.println("New Jalsa");
	}
}
