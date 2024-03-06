package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegistrationpage {
	
	@FindBy(name="full_name")
	private WebElement Userfullname;
	
	@FindBy(name="address")
	private WebElement Useraddress;
	
	@FindBy(name="city")
	private WebElement Usercity;
	
	@FindBy(xpath="//label[@for='rg-male']")
	private WebElement maleradiobutton;
	
	@FindBy(xpath="//label[@for='rg-female']")
	private WebElement femaleradiobutton;
	
	@FindBy(name="email")
	private WebElement Useremailfield;
	
	@FindBy(name="password")
	private WebElement Userpasswordfield;
	
	@FindBy(name="password_again")
	private WebElement confirmpswdfield;
	
	@FindBy(xpath="//label[@for='agree']")
	private WebElement iagreecheckbox;
	
	@FindBy(xpath="//a[@href='user-login.php']")
	private WebElement loginlink;
	
	@FindBy(name="submit")
	private WebElement submitbutton;
	
	public UserRegistrationpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserfullname() {
		return Userfullname;
	}

	public WebElement getUseraddress() {
		return Useraddress;
	}

	public WebElement getUsercity() {
		return Usercity;
	}

	public WebElement getMaleradiobutton() {
		return maleradiobutton;
	}

	public WebElement getFemaleradiobutton() {
		return femaleradiobutton;
	}

	public WebElement getUseremailfield() {
		return Useremailfield;
	}

	public WebElement getUserpasswordfield() {
		return Userpasswordfield;
	}

	public WebElement getConfirmpswdfield() {
		return confirmpswdfield;
	}

	public WebElement getIagreecheckbox() {
		return iagreecheckbox;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
	public void MaleuserRegistration(String PatientName,String UserAddress,String UserCity,String UserEmail,String UserPassword)
	{
		Userfullname.sendKeys(PatientName);
		Useraddress.sendKeys(UserAddress);
		Usercity.sendKeys(UserCity);
		maleradiobutton.click();
		Useremailfield.sendKeys(UserEmail);
		Userpasswordfield.sendKeys(UserPassword);
		confirmpswdfield.sendKeys(UserPassword);
		submitbutton.click();
	}
	public void femaleuserRegistration(String PatientName,String UserAddress,String UserCity,String UserEmail,String UserPassword)
	{
		Userfullname.sendKeys(PatientName);
		Useraddress.sendKeys(UserAddress);
		Usercity.sendKeys(UserCity);
		femaleradiobutton.click();
		Useremailfield.sendKeys(UserEmail);
		Userpasswordfield.sendKeys(UserPassword);
		confirmpswdfield.sendKeys(UserPassword);
		submitbutton.click();
	}
	
}
