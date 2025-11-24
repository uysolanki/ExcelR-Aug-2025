package day42jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateUsingStatement {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelraugdb", "root", "");
		
		Statement st=connection.createStatement();
		
		String query="update customer set cage=cage+1 where cno=3";
		int rows=st.executeUpdate(query);
		
		if(rows>0)
			System.out.println(rows + " Records Updated");
		else
			System.out.println("No records Updated");
		
		st.close();
		connection.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}

	}

}
