package day41;

public class DriverApp1 {

	public static void main(String[] args) {
		Student stud1=new DayScholar(101, "Alice", "BTech", 80000.0, 15000.0);
		Student stud2=new Hostelite(102, "Ben", "BCA", 60000.0, 25000.0);
		double discount;
		stud1.printFeeReceipt();
		discount=stud1.applyDiscount(10);
//		System.out.println("10% Discount Applied : " +discount);
//		System.out.println("Total Payable : " +(stud1.calculateFees()-discount));
		System.out.println(String.format("%-37s %-15.2f","10% Discount Applied : ",discount));
		System.out.println(String.format("%-37s %-15.2f","Total Payable : ",(stud1.calculateFees()-discount)));
		
		System.out.println("\n===================================\n");
		
		stud2.printFeeReceipt();
		discount=stud2.applyDiscount(5000,true);
//		System.out.println("Flat 5000 Rs Discount Applied : " +discount);
//		System.out.println("Total Payable : " +(stud2.calculateFees()-discount));
		
		System.out.println(String.format("%-37s %-15.2f","Flat 5000 Rs Discount Applied : ",discount));
		System.out.println(String.format("%-37s %-15.2f","Total Payable : ",(stud2.calculateFees()-discount)));
		

	}

}
