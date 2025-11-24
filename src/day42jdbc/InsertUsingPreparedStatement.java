package day42jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelraugdb", "root", "");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer number");
		int a=sc.nextInt();
		
		System.out.println("Enter customer Name");
		String b=sc.next();
		
		System.out.println("Enter customer age");
		int c=sc.nextInt();
		
		String query="insert into customer values(?,?,?)";
		
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setInt(3, c);
		
		int rows=ps.executeUpdate();
		
		if(rows>0)
			System.out.println(rows + " Records Inserted");
		else
			System.out.println("No records inserted");
		
		ps.close();
		connection.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}

	}

}
