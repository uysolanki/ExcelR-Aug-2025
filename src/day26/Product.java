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
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public void acceptProduct()	throws IOException		//methods  also known as functions
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Product ID");		//199
			this.id=Integer.parseInt(br.readLine());
			
			System.out.println("Enter Product Title");  //laptop
			this.title=br.readLine();
			
			System.out.println("Enter Product Description"); //dell latitude win 11
			this.description=br.readLine();
			
			System.out.println("Enter Product Price"); //1000.0
			this.price=Double.parseDouble(br.readLine());
			
			System.out.println("Enter Product Category"); //electronics
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

		public boolean search(int searchId) {		//searchID=298    this.id=200
			
			if(this.id==searchId)					//200==298
				return true;
			else
				return false;
			
		}
		
		
}
