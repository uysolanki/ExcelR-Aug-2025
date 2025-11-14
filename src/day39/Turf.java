package day39;


@FunctionalInterface
public interface Turf {
		double getPrice();		//abstract
		default String getOwnerName()
		{
			return "ExcelR";
		}
		
		static void greet()
		{
			System.out.println("Welcome!!!");
		}
		
		default String getOwnerName1()
		{
			return "ExcelR";
		}
		
		static void greet1()
		{
			System.out.println("Welcome!!!");
		}
}

