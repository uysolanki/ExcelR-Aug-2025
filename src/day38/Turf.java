package day38;

@FunctionalInterface
public interface Turf {
		double getPrice();		//abstract
		default String getOwnerName()
		{
			return "ExcelR";
		}
}
