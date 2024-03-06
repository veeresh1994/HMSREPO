package com.HMS.genericUtils; 


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Driver;

public class Databaseutility {
	
	Connection con=null;
	
	public void connectToDB() throws Throwable
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con= DriverManager.getConnection(IpathConstants.DBURL, IpathConstants.DBUsername, IpathConstants.DBPassword);
	}
	
	public void closeDB() throws Throwable
	{
		con.close();
	}
	
	public String executeQueryAndGetData(String query, int columnIndex,String expData) throws Throwable
	{
		String data=null;
		boolean flag=false;
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next())
		{
			data=result.getString(columnIndex);
			if(data.equals(expData))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(data+"-->data verified");
			return expData;
		}
		else
		{
			System.out.println("data not verified");
			return "";
		}
	}	
}
