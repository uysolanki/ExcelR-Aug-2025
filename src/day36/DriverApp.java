package day36;

import java.util.ArrayList;
import java.util.List;

public class DriverApp {

	public static void main(String[] args) {
		
		Rating rating1=new Rating(3.9,120);
		Rating rating2=new Rating(4.1,259);
		
		
		Product product1=new Product(1,"Foldsack No. 1 Backpack",109.95,"Your perfect pack for everyday use","men","https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_t.png",rating1);
		Product product2=new Product(2,"Mens Casual Premium Slim",22.3,"Slim-fitting style, contrast raglan","men","https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_t.png",rating2);
		

		List<Product> products=new ArrayList();
		products.add(product1);
		products.add(product2);
		
		//System.out.println(products);
		
		for(Product product: products)
		{
			if(product.getPrice()>100)
				System.out.println(product);
				
		}
			
	}

}
