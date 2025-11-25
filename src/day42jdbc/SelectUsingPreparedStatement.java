package day42jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectUsingPreparedStatement {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelraugdb", "root", "");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int a=sc.nextInt();
		
		String query="select cage,cname from customer where cage>=? order by cage desc";
		
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1, a);
		
		ResultSet rs=ps.executeQuery();
		System.out.println(String.format("%-10s %-10s", "Cust Name" ,"Age"));
		System.out.println(String.format("--------------"));
		while(rs.next())	
			System.out.println(String.format("%-10s %-3d", rs.getString("cname") ,rs.getInt("cage")));
		
		ps.close();
		connection.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}

	}

}
