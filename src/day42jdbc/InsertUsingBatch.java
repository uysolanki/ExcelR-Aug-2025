package day42jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingBatch {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelraugdb", "root", "");
		
		Statement st=connection.createStatement();
		
		String query1="insert into customer values(3,'Chris',19)";
		String query2="insert into customer values(4,'David',22)";
		String query3="insert into customer values(5,'Elcid',32)";
		String query4="insert into customer values(6,'Frank',21)";
		String query5="insert into customer values(7,'George',27)";
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		st.addBatch(query5);
		
		int rows[]=st.executeBatch();
		
		if(rows.length>0)
			System.out.println(rows.length + " Records Inserted");
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
