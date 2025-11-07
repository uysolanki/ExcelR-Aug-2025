package day35;

public class Student {
	
	private int rno;
	private String sname;
	private double per;
	
	
	public Student()  //NoArgConstructor
	{
		this.rno=1;
		this.sname="Raj";
		this.per=40.0;
	}
	
	public Student(int a,String b, double c)  //Parameterised Constructor or AllArgsConstructor
	{
		this.rno=a;
		this.sname=b;
		this.per=c;
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

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public void displayStudent()   //
	{
		System.out.println("Student Roll No is "+ rno);
		System.out.println("Student Name is "+ sname);
		System.out.println("Student Percentage is "+ per);
	}	
}
