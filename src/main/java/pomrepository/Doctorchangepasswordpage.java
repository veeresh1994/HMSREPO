package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Doctorchangepasswordpage {
	//declaration
	@FindBy(xpath="//input[@name='cpass']")
	private WebElement currentpassword;
	@FindBy(xpath="//input[@name='npass']")
	private WebElement newpassword;
	@FindBy(xpath="//input[@name='cfpass']")
	private WebElement confirmpassword;
	@FindBy(xpath="//button[@name='submit']")
	private WebElement submitbutton;
	//initialization
	public Doctorchangepasswordpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
    //utilization
	public WebElement getCurrentpassword() {
		return currentpassword;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	//Business Logic
	public void doctorchangePswd(String Cur_pswd,String New_Pswd,String Conf_Pswd)
	{
		currentpassword.sendKeys(Cur_pswd);
		newpassword.sendKeys(New_Pswd);
		confirmpassword.sendKeys(Conf_Pswd);
		submitbutton.click();
	}

}
