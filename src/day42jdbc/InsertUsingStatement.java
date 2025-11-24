package day42jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelraugdb", "root", "");
		
		Statement st=connection.createStatement();
		
		String query="insert into customer values(2,'Ben',22)";
		int rows=st.executeUpdate(query);
		
		if(rows>0)
			System.out.println(rows + " Records Inserted");
		else
			System.out.println("No records inserted");
		
		st.close();
		connection.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}

	}

}
