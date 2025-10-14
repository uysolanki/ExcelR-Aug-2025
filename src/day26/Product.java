package day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Product {

		private int id;						//data members   also known as property
		private String title;
		private String description;
		private double price;
		private String category;
		
		public void acceptProduct()	throws IOException		//methods  also known as functions
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Product ID");
			this.id=Integer.parseInt(br.readLine());
			
			System.out.println("Enter Product Title");
			this.title=br.readLine();
			
			System.out.println("Enter Product Description");
			this.description=br.readLine();
			
			System.out.println("Enter Product Price");
			this.price=Double.parseDouble(br.readLine());
			
			System.out.println("Enter Product Category");
			this.category=br.readLine();
		}
		
		public void displayProduct()
		{
			System.out.println("Product ID is : " + this.id);
			System.out.println("Product Title is : " + this.title);
			System.out.println("Product Description is : " + this.description);
			System.out.println("Product Price is : " + this.price);
			System.out.println("Product Category is : " + this.category);
		}
}
