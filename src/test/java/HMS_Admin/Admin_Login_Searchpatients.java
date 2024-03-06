package HMS_Admin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.HMS.genericUtils.ExcelUtility;
import com.HMS.genericUtils.PropertyFileUtility;
import com.HMS.genericUtils.WebdriverUtility;

import pomrepository.Admindashboardpage;
import pomrepository.Adminloginpage;
import pomrepository.Welcomepage;

public class Admin_Login_Searchpatients {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		PropertyFileUtility pobj=new PropertyFileUtility();
		WebdriverUtility web=new WebdriverUtility();
		String Url=pobj.readDataFromPropertyFile("url");
		String Admin_UN=pobj.readDataFromPropertyFile("username");
		String Admin_pswd=pobj.readDataFromPropertyFile("password");
        web.maximizeWindow(driver);
    	driver.get(Url);
    	web.waitForPageLoad(driver);
		Welcomepage wel=new Welcomepage(driver);
		wel.getAdmin_Login();
		Adminloginpage al=new Adminloginpage(driver);
		al.logintoappasadmin(driver, Admin_UN, Admin_pswd);
		Admindashboardpage adb=new Admindashboardpage(driver);
		//WebElement ele=adb.getPatientsdropdown();
		adb.clickonPatientsdropdown(1);
		adb.clickonContactusqueries();
		adb.clickonDoctorsessionlogs();
		adb.clickonUsersessionlogs();
		adb.clickonReportsdropdown();
 		adb.clickonPatientsearch();
 		adb.clickonAdminprofiledropdown();
 		WebElement ele1=adb.getAdminprofiledropdown();
 		web.select(ele1, "Logout");
 		
	}

}
