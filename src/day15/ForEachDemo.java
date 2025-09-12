package day15;

public class ForEachDemo {

	public static void main(String[] args) {
		String cars[]= {"Audi", "BMW", "Merc"};
		//traditional / classical for loop
		for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}

		//for each loop / enhanced for loop
		
		for(String car:cars)
		{
			System.out.println(car);
		}
		

		//
		
		
	}
}
