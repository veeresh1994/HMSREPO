package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HMS.genericUtils.WebdriverUtility;

public class Adminloginpage {

	//declaration
	@FindBy(xpath="//input[@name='username']")
	private WebElement Admin_username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Admin_Password;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement Adminlogin_btn;
	
	//UTILIZATION
	public Adminloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdmin_username() {
		return Admin_username;
	}

	public WebElement getAdmin_Password() {
		return Admin_Password;
	}

	public WebElement getAdminlogin_btn() {
		return Adminlogin_btn;
	}
	WebdriverUtility w=new WebdriverUtility();
	//BUSINESS LIBRARIES
	public void logintoappasadmin(WebDriver driver,String USERNAME, String PASSWORD) throws InterruptedException
	{
		w.waitforElementToBeClickable(driver, Admin_username);
		Admin_username.sendKeys(USERNAME);
		
		w.waitforElementToBeClickable(driver, Admin_username);
		Admin_Password.sendKeys(PASSWORD);
		//Thread.sleep(2000);
		Adminlogin_btn.click();
	}
	
	
	
	
	
	
}
