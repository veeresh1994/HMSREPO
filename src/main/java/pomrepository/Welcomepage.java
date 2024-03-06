package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
    //declaration
	@FindBy(xpath="//a[@href='hms/admin']")
	private WebElement Admin_Login;
	
	@FindBy(xpath="//a[@href='hms/doctor/']")
    private WebElement doctor_Login;
	
	@FindBy(xpath="//a[@href='hms/patient']")
	private WebElement Patient_Login;
	//initialization
	public Welcomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    //utilization
	public WebElement getAdmin_Login() {
		Admin_Login.click();
		return Admin_Login;
	}

	public WebElement getDoctor_Login() {
		doctor_Login.click();
		return doctor_Login;
	}

	public WebElement getPatient_Login() {
		return Patient_Login;
	}
    	
	public void Togotoadmin_Loginpage()
	{
		Admin_Login.click();		
	}
	public void TogotoDoctor_Loginpage()
	{
		doctor_Login.click();
	}
	public void TogotoPatient_Loginpage()
	{
		Patient_Login.click();
	}
	
}

	
	

