package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HMS.genericUtils.WebdriverUtility;

public class DoctorLoginpage {

	WebdriverUtility w=new WebdriverUtility();
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement Doctor_Username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Doctor_Password;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement DoctorLogin_button;
	
	@FindBy(linkText="forgot-password.php")
	private WebElement Forgot_Password;
	
	public DoctorLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getDoctor_Username(String Dusername) {
		Doctor_Username.sendKeys(Dusername);
		return Doctor_Username;
	}

	public WebElement getDoctor_Password(String Dpassword) {
		Doctor_Password.sendKeys(Dpassword);
		return Doctor_Password;
	}

	public WebElement getDoctorLogin_button(WebDriver driver) {
		
		w.waitforelementtobevisible(driver, DoctorLogin_button);
		DoctorLogin_button.click();
		return DoctorLogin_button;
		
	}

	public WebElement getForgot_Password(String Dpassword) {
		
		return Forgot_Password;
	}
	
	public void doctorLoginpage(String Dusername,String Dpassword)
	{
		Doctor_Username.sendKeys(Dusername);
		Doctor_Password.sendKeys(Dpassword);
		DoctorLogin_button.click();
	}
}
