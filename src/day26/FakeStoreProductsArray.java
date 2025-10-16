package day26;

import java.io.IOException;

public class FakeStoreProductsArray {

	public static void main(String[] args) throws IOException
	{
		Product cart[]=new Product[5];
		
		for(int i=0;i<cart.length;i++)
		{
			cart[i]=new Product();
			cart[i].acceptProduct();
		}

		for(int i=0;i<cart.length;i++)
		{
			cart[i].displayProduct();
		}
		
//		double max=0;									//max		i		cart[i].getPrice()
//		for(int i=0;i<cart.length;i++)					//0			0		100						is 100>0 T
//		{												//100		1       200                     is 200>100 T
//			if (cart[i].getPrice() > max)				//200		2		300						is 300>200 T
//			{											//300		3       150                     is 150>300 F
//				max = cart[i].getPrice();				//300		4		250						is 250>300 F
//			}											//300
//		}
//		System.out.println("Costliet product is of "+ max + " Rs");
		
		
//		double max=0;									//max		i		cart[i].getPrice()
//		String pTitle=null;
//		String pCat=null;
//		String pDesc=null;
//		for(int i=0;i<cart.length;i++)					//0			0		100						is 100>0 T
//		{												//100		1       200                     is 200>100 T
//			if (cart[i].getPrice() > max)				//200		2		300						is 300>200 T
//			{											//300		3       150                     is 150>300 F
//				max = cart[i].getPrice();				//300		4		250						is 250>300 F
//				pTitle=cart[i].getTitle();
//				pCat=cart[i].getCategory();
//				pDesc=cart[i].getDescription();
//			}											//300
//		}
		//System.out.println("Costliet product is of "+ max + " Rs");
		System.out.println("Costliet product is of " + max + " Rs its title is " +pTitle + " its category is "+pCat);
	
		//traditonal for loop
//		double max=0;									//max		i		cart[i].getPrice()
//		Product maxProduct=null;
//		for(int i=0;i<cart.length;i++)					//0			0		100						is 100>0 T
//		{												//100		1       200                     is 200>100 T
//			if (cart[i].getPrice() > max)				//200		2		300						is 300>200 T
//			{											//300		3       150                     is 150>300 F
//				max = cart[i].getPrice();				//300		4		250						is 250>300 F
//				maxProduct = cart[i];
//			}											//300
//		}
//		//System.out.println("Costliet product is of "+ max + " Rs");
//		System.out.println("Costliet product is of " + maxProduct.getPrice() + " Rs its title is " +maxProduct .getTitle() + " its category is "+maxProduct .getCategory());
//	
		
		//enhanced for loop or for each loop
		double max=0;									//max		i		cart[i].getPrice()
		Product maxProduct=null;
		for(Product product:cart)					//0			0		100						is 100>0 T
		{												//100		1       200                     is 200>100 T
			if (product.getPrice() > max)				//200		2		300						is 300>200 T
			{											//300		3       150                     is 150>300 F
				max = product.getPrice();				//300		4		250						is 250>300 F
				maxProduct = product;
			}											//300
		}
		//System.out.println("Costliet product is of "+ max + " Rs");
		System.out.println("Costliet product is of " + maxProduct.getPrice() + " Rs its title is " +maxProduct .getTitle() + " its category is "+maxProduct .getCategory());
	
	
	}

}
//Costliet product is of 300.0 Rs its title is Laptop its category is Electronics