package day32;

public class Circle implements Shape
{

	@Override
	public void area() {
		double result=Math.PI*5*5;
		System.out.println("Area of Circle "+result);
		
	}

	@Override
	public void perimeter() {
		double result=2*Math.PI*5;
		System.out.println("Perimeter of Circle "+result);
		
	}

}
