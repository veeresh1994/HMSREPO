package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patientloginpage {
	
	@FindBy(name="username")
	private WebElement Patient_Username;
	
	@FindBy(name="password")
	private WebElement Patient_Password;
	
	@FindBy(name="submit")
	private WebElement PatientLogin_Button;
	
	@FindBy(linkText="//a[@href='forgot-password.php']")
	private WebElement forgot_passwordlink;
	
	@FindBy(xpath="//a[@href='registration.php']")
	private WebElement createaccountlink;
	
	
	public Patientloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getPatient_Username() {
		return Patient_Username;
	}


	public WebElement getPatient_Password() {
		return Patient_Password;
	}


	public WebElement getPatientLogin_Button() {
		return PatientLogin_Button;
	}


	public WebElement getForgot_passwordlink() {
		return forgot_passwordlink;
	}


	public WebElement getCreateaccountlink() {
		return createaccountlink;
	}
    
	//Business library
	public void clickoncreateaccountlink()
	{
		createaccountlink.click();
	}
	public void clickonforgot_passwordlink()
	{
		forgot_passwordlink.click();
	}
	public void loginaspatient(String pemail,String ppswd)
	{
		Patient_Username.sendKeys(pemail);
		Patient_Password.sendKeys(ppswd);
		PatientLogin_Button.click();
	}
	

}
