package day42jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver"); //version 5.1.15
		
		//Class.forName("com.mysql.cj.jdbc.Driver"); //version 8.0.33
	
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelraugdb", "root", "");
		
		Statement st=connection.createStatement();
		
		String query="create table customer(\r\n"
				+ "cno int(5) primary key,\r\n"
				+ "cname varchar(10) not null,\r\n"
				+ "cage int(5))";
		
		st.execute(query);
	
		System.out.println("Table created");
		
		st.close();
		connection.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}

	}

}
