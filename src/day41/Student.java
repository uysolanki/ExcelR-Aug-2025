package day41;

public abstract class Student implements FeeOperations {
	protected int rno;
	protected String sname;
	protected String course;
	protected double baseFees;
	
	public Student() {}
	public Student(int rno, String sname, String course, double baseFees) {
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
		System.out.println("Rno is "+this.rno);
		System.out.println("Student Name is "+this.sname);
		System.out.println("Student Course is "+this.course);
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
