package day41;

public class Hostelite extends Student
{
	double foodCharges;
	
	public Hostelite(int rno, String sname, String course, double baseFees,double foodCharges)
	{
		super(rno, sname, course, baseFees);
		this.foodCharges=foodCharges;
	}

	@Override
	public double calculateFees() {
		return this.baseFees+this.foodCharges;
	}

	@Override
	public void printFeeReceipt() {
		super.displayStudentDetails();
		System.out.println("Base Fees for Day Scholar Student "+this.baseFees);
		System.out.println("Food Charges "+this.foodCharges);
		System.out.println("Total Fees "+this.calculateFees());
		
//		super.displayStudentDetails();
//		System.out.println(String.format("%-37s %-15.2f","Base Fees for Day Scholar Student:",this.baseFees));
//		System.out.println(String.format("%-37s %-15.2f","Food Charges  :",this.foodCharges));
//		System.out.println(String.format("%-37s %-15.2f","Total Fees  :",this.calculateFees()));
		
	}
}
