package day42jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelraugdb", "root", "");
				Statement st=connection.createStatement();)
		{
		String query="create table customer123(\r\n"
				+ "cno int(5) primary key,\r\n"
				+ "cname varchar(10) not null,\r\n"
				+ "cage int(5))";
		
		st.execute(query);
	
		System.out.println("Table created");
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}

	}

}
