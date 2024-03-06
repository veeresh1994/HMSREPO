package HMS_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.HMS.genericUtils.ExcelUtility;
import com.HMS.genericUtils.FileUtils;
import com.HMS.genericUtils.JavaUtility;
import com.HMS.genericUtils.PropertyFileUtility;
import com.HMS.genericUtils.WebdriverUtility;

import pomrepository.Admindashboardpage;
import pomrepository.DoctorLoginpage;
import pomrepository.Doctoraddpatientpage;
import pomrepository.DoctorsDashboardpage;
import pomrepository.Editdoctordetailspage;
import pomrepository.Welcomepage;

public class Update_Doctorfee_Addpatient {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		PropertyFileUtility p1= new PropertyFileUtility();
		ExcelUtility exc=new ExcelUtility();
		WebdriverUtility we=new WebdriverUtility();
		FileUtils f1=new FileUtils();
		JavaUtility j1=new JavaUtility();
		String URL=p1.readDataFromPropertyFile("url");
		String Doc_UN=p1.readDataFromPropertyFile("Dusername");
		String Doc_Pswd=p1.readDataFromPropertyFile("Dpassword");
		//FileInputStream file=new FileInputStream(".\\src\\test\\resources\\HMS_Test_Data1.xlsx");*/
		we.maximizeWindow(driver);
		driver.get(URL);
		we.waitForPageLoad(driver); 
		Admindashboardpage adm=new Admindashboardpage(driver);
		Welcomepage wel=new Welcomepage(driver);
		wel.TogotoDoctor_Loginpage();
		DoctorLoginpage dl=new DoctorLoginpage(driver);
		dl.doctorLoginpage(Doc_UN, Doc_Pswd);
		DoctorsDashboardpage dd=new DoctorsDashboardpage(driver);
		dd.clickondoctorprofiledropdown();
		WebElement ele=dd.getDoctorsprofiledropdown();
		we.select(ele, "My Profile");
		String Doc_fee=exc.readDataFromExcel("Sheet1", 3, 1);
		Editdoctordetailspage ed=new Editdoctordetailspage(driver);
		ed.enterdoctorfee(Doc_fee);
		ed.clickonupdate();
		we.acceptAlert(driver);
		dd.clickonpatientdropdown();
		WebElement ele1=dd.getAddpatientlink();
		dd.clickonAddpatientlink();
		String P_name=exc.readDataFromExcel("Sheet1", 7, 1);
		String Pcontactno=exc.readDataFromExcel("Sheet1", 8, 1);
		String Pemail=exc.readDataFromExcel("Sheet1", 9, 1);
		String Padress=exc.readDataFromExcel("Sheet1", 10, 1);
		String P_age=exc.readDataFromExcel("Sheet1", 11, 1);
		String Med_History=exc.readDataFromExcel("Sheet1", 12, 1);
		Doctoraddpatientpage ap=new Doctoraddpatientpage(driver);
		ap.addmalepatient(P_name, Pcontactno, Pemail, Padress, P_age, Med_History);
		dd.clickonpatientdropdown(); 
		WebElement ele2=dd.getManagepatientlink();
		we.select(ele1, 2);
		we.scrollAction(driver);
		dd.clickondoctorprofiledropdown();
		WebElement ele3=dd.getDoctorsprofiledropdown();
		we.select(ele3, 3);
		
	}

}
