package day41;

public abstract class Student2 implements FeeOperations {
	protected int rno;
	protected String sname;
	protected String course;
	protected double baseFees;
	
	public Student2() {}
	public Student2(int rno, String sname, String course, double baseFees) {
		this.rno = rno;
		this.sname = sname;
		this.course = course;
		this.baseFees = baseFees;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getBaseFees() {
		return baseFees;
	}
	public void setBaseFees(double baseFees) {
		this.baseFees = baseFees;
	}
	
	
	public void displayStudentDetails()
	{
		System.out.println(String.format("%s","                  Fee Receipt               "));
		System.out.println(String.format("%s","--------------------------------------------"));
		System.out.println(String.format("%-37s %-7d","Rno :",this.rno));
		System.out.println(String.format("%-37s %-15s","Student Name :",this.sname));
		System.out.println(String.format("%-37s %-15s","Student Course :",this.course));
	}
	
	public double applyDiscount(double percetageDiscount)
	{
		return (calculateFees()*(percetageDiscount/100));
	}
	
	public double applyDiscount(double flatAmount, boolean flat)
	{
		return (flatAmount);
	}
	

}
