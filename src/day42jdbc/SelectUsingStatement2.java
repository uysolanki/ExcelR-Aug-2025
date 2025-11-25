package day42jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUsingStatement2 {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelraugdb", "root", "");
		
		Statement st=connection.createStatement();
		
		String query="select cage,cname from customer where cage>=30";
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())	
			//System.out.println(rs.getString(1) + " " + rs.getInt(2));
			System.out.println(rs.getString("cname") + " " + rs.getInt("cage"));
		st.close();
		connection.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}

	}

}
