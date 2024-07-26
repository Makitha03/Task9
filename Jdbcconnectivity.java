package mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbcex 
{

	public static void main(String[] args) throws ClassNotFoundException,SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Root");
		
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employee");  
		while(rs.next())  
		System.out.println("empcode="+rs.getInt(1)+"empname="+rs.getString(2)+"empage="+rs.getInt(3)+"esalary="+rs.getString(4));  
		con.close();
	}

}

