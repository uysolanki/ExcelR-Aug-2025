package day36;

public class EmployeeDriverApp {

	public static void main(String[] args) {
		Geo geo1=new Geo("-37.3159","81.1496");
		Address address1=new Address("Kulas Light","Apt. 556","Gwenborough", "92998-3874",geo1);
		Company company1=new Company("Romaguera-Crona","Multi-layered client-server neural-net","harness real-time e-markets");
		
		Employee employee1=new Employee(1,"Leanne Graham","Bret","Sincere@april.biz",address1,"1-770-736-8031 x56442","hildegard.org",company1);
		
		System.out.println(employee1);
	}

}
