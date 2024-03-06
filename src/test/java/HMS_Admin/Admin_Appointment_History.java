package HMS_Admin;

import static org.testng.Assert.*;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.HMS.genericUtils.Baseclass;
import com.HMS.genericUtils.Listimpclass;

import pomrepository.Admindashboardpage;
import pomrepository.Adminloginpage;
import pomrepository.Welcomepage;

@Listeners(Listimpclass.class)
public class Admin_Appointment_History extends Baseclass {

	@Test(groups="smoke")
	public void adminappointmenthistory() throws Throwable 
	{
		/*wlib.maximizeWindow(driver);
		String URL=plib.readDataFromPropertyFile("url");
		driver.get(URL);*/
		//wlib.waitForPageLoad(driver);
		Welcomepage wel=new Welcomepage(driver);
		wel.Togotoadmin_Loginpage();
		Thread.sleep(2000);
		String USERNAME=plib.readDataFromPropertyFile("username");
		String PASSWORD=plib.readDataFromPropertyFile("password");
		
		Adminloginpage al=new Adminloginpage(driver);
		al.logintoappasadmin(driver,USERNAME, PASSWORD);
		Thread.sleep(2000);
		System.out.println("Logged in as admin");
		Admindashboardpage adb=new Admindashboardpage(driver);
		adb.clickonAppointmenthistory();
		Thread.sleep(3000);
		System.out.println("Appointment history page displayed");
		String title=driver.getTitle();
		System.out.println(title);
		String et="Patients | Appointment History";
		assertEquals(et,title);
		fail();
		
	}

}
