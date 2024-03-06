package com.HMS.genericUtils;


import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRandomNumber()
	{
		Random ran = new Random();
		int random=ran.nextInt(500);
		return random;
	}
	
	public String getSystemDate()
	{
		Date d=new Date();
		String date=d.toString();
		return date;
	}
	public String getSystemDateInFormat()
	{
		Date d = new Date();
		String d1=d.toString();
		String[]date=d1.split(" ");
		String mon=date[1];
		String day=date[2];
		String time=date[3].replace(":","-");
		String year=date[5];
		String DateFormat=day+"-"+mon+"-"+year+"-"+time;
		return DateFormat;
	}
}
