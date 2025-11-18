package day36;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadJsonFile {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Employee> employees=null;
		try {
			employees = mapper.readValue(
					//new File("D:\\EclipseJavaprogs2\\ITPAugust\\myfolder\\products1.json"), //absolute path
					new File("myfolder/employees.json"), // relative path
					new TypeReference<List<Employee>>() {
					});

		} catch (FileNotFoundException ex1) {
			System.out.println(ex1.getMessage());
		}
		
		for(Employee employee : employees)
		{
			System.out.println(employee);
		}
		System.out.println("---");
		List<Employee> MrsEemployees=employees.stream().filter(emp->emp.getName().contains("Mrs")).collect(Collectors.toList());
		System.out.println(MrsEemployees);
		
		System.out.println("---");
		List<Employee> jasperEemployees=employees.stream().filter(emp->emp.getEmail().endsWith("jasper.info")).collect(Collectors.toList());
		System.out.println(jasperEemployees);
		
//		ZoneId zone = ZoneId.of("Australia/Sydney");
//		ZonedDateTime zdt = ZonedDateTime.now(zone);
//
//		System.out.println(zdt);
//		
		
		//Convert from one zone to another:
			ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));
			System.out.println(usa);
			ZonedDateTime syd = usa.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
			
			System.out.println(syd);
			
	}

}
