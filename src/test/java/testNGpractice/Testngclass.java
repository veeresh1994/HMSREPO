package testNGpractice;

import org.testng.annotations.Test;

public class Testngclass {
	
	@Test(invocationCount = 0,dependsOnMethods = "edittest")
	public void createtest()
	{
		System.out.println("create test");
	}
	
	@Test(invocationCount=1,dependsOnMethods = "deletetest")
	public void edittest()
	{
		System.out.println("edit test");
	}
	
	@Test(dependsOnMethods="createtest")
	public void deletetest()
	{
		System.out.println("Delete test");
	}
	

}
