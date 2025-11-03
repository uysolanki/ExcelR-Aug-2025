package day27;

public class DriverApp {

	public static void main(String[] args) {
//	Person person=new Person();
//	person.acceptPerson();
//	person.displayPerson();

//	Employee employee1=new Employee();
//	employee1.acceptPerson();
//	employee1.acceptEmployee();
//	
//	employee1.displayPerson();
//	employee1.displayEmployee();
//	
	
	Employee employee1=new Employee();
	employee1.displayEmployee();
	System.out.println("----------------------");
	Employee employee2=new Employee(333444L,"Shyam",21,102,"Programmer",1800);
	employee2.displayEmployee();
	}

}
