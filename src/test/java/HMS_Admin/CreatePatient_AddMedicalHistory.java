package HMS_Admin;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.HMS.genericUtils.Baseclass;
import com.HMS.genericUtils.ExcelUtility;
import com.HMS.genericUtils.PropertyFileUtility;
import com.HMS.genericUtils.WebdriverUtility;

import pomrepository.Addmedicalhistorypage;
import pomrepository.DoctorLoginpage;
import pomrepository.Doctoraddpatientpage;
import pomrepository.DoctorsDashboardpage;
import pomrepository.Patientdashboardpage;
import pomrepository.Patientloginpage;
import pomrepository.Patientsearchpage;
import pomrepository.UserRegistrationpage;
import pomrepository.Welcomepage;

public class CreatePatient_AddMedicalHistory extends Baseclass
{
    //@Parameter()
	@Test
	public void createPatient_AddMedicalHistory() throws Throwable 
	{
		DoctorLoginpage dlp=new DoctorLoginpage(driver);
		DoctorsDashboardpage ddp= new DoctorsDashboardpage(driver);
		ddp.clickonpatientdropdown();
		ddp.clickonAddpatientlink();
		
		String P_name=exlib.readDataFromExcel("Sheet1", 7, 1);
		String Pcontactno=exlib.readDataFromExcel("Sheet1", 8, 1);
	    String Pemail=exlib.readDataFromExcel("Sheet1", 9, 1);
		String Padress=exlib.readDataFromExcel("Sheet1", 10, 1);
		String P_age=exlib.readDataFromExcel("Sheet1", 11, 1);
		String Med_History=exlib.readDataFromExcel("Sheet1", 12, 1);
		Doctoraddpatientpage ap=new Doctoraddpatientpage(driver);
		ap.addfemalepatient(P_name, Pcontactno, Pemail, Padress, P_age, Med_History);
		ddp.clickonsearch();
		Patientsearchpage ps=new Patientsearchpage(driver);
		ps.searchpatient(P_name);
		ps.clickoneyeicon();
		ps.clickonaddmed_historyBtn();
		
		String BP=exlib.readDataFromExcel("Sheet1", 16, 1);
		String Blood_Sugar=exlib.readDataFromExcel("Sheet1", 17, 1);
		String Weight=exlib.readDataFromExcel("Sheet1", 18, 1);
		String Body_Temp=exlib.readDataFromExcel("Sheet1", 19, 1);
		String Prescription=exlib.readDataFromExcel("Sheet1", 20, 1);
		Addmedicalhistorypage amh=new Addmedicalhistorypage(driver);
		amh.addmedicalhistory(BP, Blood_Sugar, Weight, Body_Temp, Prescription);
	    wlib.acceptAlert(driver);
		ddp.clickondoctorprofiledropdown(driver);
		ddp.clickonlogoutlink();
		Welcomepage wel=new Welcomepage(driver);
		wel.TogotoPatient_Loginpage();
		Patientloginpage plp=new Patientloginpage(driver);
		plp.clickoncreateaccountlink();
	    String Full_name=exlib.readDataFromExcel("Sheet1", 20, 1);
	    String Address=exlib.readDataFromExcel("Sheet1", 21, 1);
	    String City=exlib.readDataFromExcel("Sheet1", 22, 1);
	    String email=exlib.readDataFromExcel("Sheet1", 23, 1);
	    String Pswd=exlib.readDataFromExcel("Sheet1", 24 , 1);
	    UserRegistrationpage urp=new UserRegistrationpage(driver);
	    urp.MaleuserRegistration(P_name, Address, City, email, Pswd);
	    WebElement ele=urp.getLoginlink();
	    ele.click();
	    Thread.sleep(3000);
	    plp.loginaspatient(Pemail, Pswd);
	    Thread.sleep(3000);
	    Patientdashboardpage pdb=new Patientdashboardpage(driver);
	    pdb.clickonMedicalhistory();
	    Thread.sleep(3000);
	   
		
	}

}
