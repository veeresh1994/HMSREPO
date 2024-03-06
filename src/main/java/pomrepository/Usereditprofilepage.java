package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Usereditprofilepage {
	//declaration
	@FindBy(xpath="//input[@name='fname']")
	private WebElement username;
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement useraddress;
	@FindBy(name="city")
	private WebElement usercity;
	@FindBy(name="gender")
	private WebElement usergender;
	@FindBy(name="uemail")
	private WebElement useremail;
	@FindBy(name="submit")
	private WebElement updateBtn;
	//initialization
	public Usereditprofilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	//business logic
	public void editusername(String uname)
	{
		username.clear();
		username.sendKeys(uname);
		//updateBtn.click();
	}
	public void Edituseraddress(String address)
	{
		useraddress.clear();
		useraddress.sendKeys(address);
		//updateBtn.click();
	}
	public void editusercity(String city)
	{
		usercity.clear();
		usercity.sendKeys(city);
	}
	public void editusergender(String gender)
	{
		Select sel=new Select(usergender);
		sel.selectByVisibleText(gender);
	}
	public void edituseremail(String emailid)
	{
		useremail.clear();
		useremail.sendKeys(emailid);
	}
    public void clickonupdatebtn()
    {
    	updateBtn.click();
    }
}
