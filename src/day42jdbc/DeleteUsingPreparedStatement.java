package day42jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteUsingPreparedStatement {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelraugdb", "root", "");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer number");
		int a=sc.nextInt();
		
		
		
		String query="delete from customer where cno=?";
		
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1, a);
		
		
		int rows=ps.executeUpdate();
		
		if(rows>0)
		System.out.println(rows + " Records Deleted");
			else
		System.out.println("No records Deleted");
		
		ps.close();
		connection.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}

	}

}
