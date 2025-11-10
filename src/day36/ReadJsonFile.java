package day36;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

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
			if(employee.getAddress().getCity().equals("Delhi"))
				System.out.println(employee);
		}
		
		

	}

}
