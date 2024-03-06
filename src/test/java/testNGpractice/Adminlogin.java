package testNGpractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.HMS.genericUtils.ExcelUtility;
import com.HMS.genericUtils.PropertyFileUtility;
import com.HMS.genericUtils.WebdriverUtility;

import pomrepository.Adminloginpage;
import pomrepository.Welcomepage;

public class Adminlogin {
	
	@Test(dataProvider="testdata")
	public void loginasadmin(String UN,String Pswd) throws Throwable
	{
	   WebDriver driver = new ChromeDriver();
	   WebdriverUtility web=new WebdriverUtility();
	   PropertyFileUtility pobj=new PropertyFileUtility();
	   String URL=pobj.readDataFromPropertyFile("url");
	   web.maximizeWindow(driver);
	   web.waitForPageLoad(driver);
	   driver.get(URL);
	   Welcomepage wp=new Welcomepage(driver);
	   WebElement ele=wp.getAdmin_Login();
	   web.scrollAction(driver, ele);
	   wp.Togotoadmin_Loginpage();
	   Adminloginpage alp=new Adminloginpage(driver);
	   alp.logintoappasadmin(driver, UN, Pswd);
	}
    @DataProvider
    public Object[][] testdata() throws EncryptedDocumentException, IOException
    {
    	ExcelUtility exc= new ExcelUtility();
    	Object[][] excelData = exc.excelData("Sheet3");
    	return excelData; 
    	
    }
	
	
}
