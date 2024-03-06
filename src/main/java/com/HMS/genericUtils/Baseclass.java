package com.HMS.genericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import pomrepository.Admindashboardpage;
import pomrepository.Adminloginpage;
import pomrepository.DoctorLoginpage;
import pomrepository.Doctorchangepasswordpage;
import pomrepository.DoctorsDashboardpage;
import pomrepository.Welcomepage;

public class Baseclass {
	
	public Databaseutility dlib=new Databaseutility();
	public PropertyFileUtility plib=new PropertyFileUtility();
	public WebdriverUtility wlib=new WebdriverUtility();
	public ExcelUtility exlib=new ExcelUtility();
	public FileUtils flib=new FileUtils();
	public JavaUtility jlib=new JavaUtility();
	public static  WebDriver driver;
	
	@BeforeSuite(alwaysRun=true)
	public void connectDB() throws Throwable
	{
//		dlib.connectToDB();
		System.out.println("connected to data base");
	}
	//@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchbrowser() throws Throwable 
	{
	     String Browser=plib.readDataFromPropertyFile("browser");
		if(Browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			Thread.sleep(2000);
			System.out.println("Chrome launched successfully");
			}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			System.out.println("FIREFOX launched successfully");
		}
		else if(Browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Invalid browser");
		}
	}
	
	@BeforeMethod(alwaysRun=true)
	public void loginasdocor() throws Throwable
	{
		wlib.maximizeWindow(driver);
		String URL=plib.readDataFromPropertyFile("url");
		driver.get(URL);
		wlib.waitForPageLoad(driver);
		/*Welcomepage wel=new Welcomepage(driver);
		wel.TogotoDoctor_Loginpage();*/
		
	}
	@AfterMethod//(alwaysRun=true)
	public void logoutasdoctor() throws InterruptedException
	{
//		DoctorsDashboardpage ddb=new DoctorsDashboardpage(driver);
//		ddb.clickondoctorprofiledropdown(driver);
//		Thread.sleep(2000);
//		ddb.clickonlogoutlink();
//		Thread.sleep(2000);
		System.out.println("--------");
	}
	@AfterClass(alwaysRun=true)
	public void exitbrowser()
	{
		driver.quit();
		System.out.println("Browser closed");
	}
	@AfterSuite(alwaysRun=true)
	public void closeDBconnection() throws Throwable 
	{
//		dlib.closeDB();
		System.out.println("connection closed");
	}
	

}
