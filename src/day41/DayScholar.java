package day41;

public class DayScholar extends Student
{
	double busFare;
	
	public DayScholar(int rno, String sname, String course, double baseFees,double busFare)
	{
		super(rno, sname, course, baseFees);
		this.busFare=busFare;
	}
	
	@Override
	public double calculateFees() {
		return this.baseFees+this.busFare;
	}

	@Override
	public void printFeeReceipt() {
		super.displayStudentDetails();
//		System.out.println(String.format("%-37s %-15.2f","Base Fees for Day Scholar Student:",this.baseFees));
//		System.out.println(String.format("%-37s %-15.2f","Bus Fare  :",this.busFare));
//		System.out.println(String.format("%-37s %-15.2f","Total Fees  :",this.calculateFees()));
		
		
		
		System.out.println("Base Fees for Day Scholar Student "+this.baseFees);
		System.out.println("Bus Fare "+this.busFare);
		System.out.println("Total Fees "+this.calculateFees());
		
	}

}
