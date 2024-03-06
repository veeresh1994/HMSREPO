package HMS_Admin;


import static org.testng.Assert.*;
import org.testng.annotations.Test;

import com.HMS.genericUtils.Baseclass;

import pomrepository.Admindashboardpage;
import pomrepository.Adminloginpage;
import pomrepository.Welcomepage;

public class Admin_Doctors_Specialization extends Baseclass
{
    @Test(groups="smoke")
	public void admin_Doctors_Specialization() throws Throwable 
    {
    	Welcomepage wel=new Welcomepage(driver);
		wel.Togotoadmin_Loginpage();
		/*wlib.maximizeWindow(driver);
		String BROWSER = plib.readDataFromPropertyFile("browser");
		String URL = plib.readDataFromPropertyFile("url");*/
		String USERNAME = plib.readDataFromPropertyFile("username");
		String pswd= plib.readDataFromPropertyFile("password");
		
		//driver.get(URL);
		//wlib.waitForPageLoad(driver);
		
		Adminloginpage alp=new Adminloginpage(driver);
		alp.logintoappasadmin(driver,USERNAME, pswd);
		Thread.sleep(2000);
		Admindashboardpage adb=new Admindashboardpage(driver);
		adb.clickonDoctordropdown();
		Thread.sleep(2000);
		adb.clickonDoctorspecialization();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		String exp="Admin | Doctor Specialization";
		/*if(title.equalsIgnoreCase("ADMIN | DOCTOR SPECIALIZATION"))
		{
		     System.out.println("Smoke testing passed");
		}
		else {
			System.out.println("Smoke testing failed");
		}*/
        assertEquals(exp,title);
	}

}
