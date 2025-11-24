package day42jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateUsingPreparedStatement3 {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelraugdb", "root", "");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer number");
		int a=sc.nextInt();
		
		System.out.println("Enter numbers of years to increase");
		int b=sc.nextInt();
		
		System.out.println("Enter new name");
		String c=sc.next();
		
		String query="update customer set cage=cage+?,cname=? where cno=?";
		
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1, b);
		ps.setString(2, c);
		ps.setInt(3, a);
		
		
		int rows=ps.executeUpdate();
		
		if(rows>0)
			System.out.println(rows + " Records Updated");
		else
			System.out.println("No records Updated");
		
		ps.close();
		connection.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}

	}

}
