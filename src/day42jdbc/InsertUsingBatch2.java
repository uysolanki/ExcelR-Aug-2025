package day42jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingBatch2 {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelraugdb", "root", "");
		
		String query="insert into customer values(?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of records to be inserted");
		int size=sc.nextInt();
		
		
		for(int i=1;i<=size;i++)
		{
			System.out.println("Enter customer number");
			int a=sc.nextInt();
			
			System.out.println("Enter customer Name");
			String b=sc.next();
			
			System.out.println("Enter customer age");
			int c=sc.nextInt();
			
			ps.setInt(1, a);
			ps.setString(2, b);
			ps.setInt(3, c);
			
			ps.addBatch();
		}
	
		int rows[]=ps.executeBatch();
		
		if(rows.length>0)
			System.out.println(rows.length + " Records Inserted");
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
