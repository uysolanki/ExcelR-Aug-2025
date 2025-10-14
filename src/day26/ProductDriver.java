package day26;

import java.io.IOException;

public class ProductDriver {

	public static void main(String[] args) throws IOException
	{
		//classname object = new classname()
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		
		p1.acceptProduct();
		p2.acceptProduct();
		p3.acceptProduct();
		
		p1.displayProduct();
		p2.displayProduct();
		p3.displayProduct();
		

	}

}
