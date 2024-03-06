package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class Jdbcpractice {

	public static void main(String[] args) throws SQLException {
		
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/veeresh","root","root");
		Statement state=con.createStatement();
		
		//String query="Select * from rmg;";
		//String query="insert into rmg values(5,'Prakash','Python','1 week');";
		//ResultSet result=state.executeQuery(query);
		/*if(result>=1)
		{
			System.out.println("data is updated");
		}
		else {
			System.out.println("data not inserted");
		}*/
		String query="create table employees(E_id int(10),Ename varchar(20));";
		state.executeQuery(query);
		String q1="insert into employees values(1,'ram'),(2,'hrithik'),(3,'sharuk');";
		state.executeUpdate(q1);
		ResultSet result=state.executeQuery("Select * from employees");
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2));
					//+" "+result.getString(3)+" "+result.getString(4));
 		}
		con.close();

	}

}
