package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userchangepassword {
	
	//declaration
	@FindBy(name="cpass")
	private WebElement currentpswd;
	@FindBy(name="npass")
	private WebElement newpswd;
	@FindBy(name="cfpass")
	private WebElement confirmpswd;
	@FindBy(name="submit")
	private WebElement submitBtn;
	
	//initialization
	public Userchangepassword(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	//business logic
	public void userchangepassword(String current_pswd,String new_pswd)
	{
		currentpswd.sendKeys(current_pswd);
		newpswd.sendKeys(new_pswd);
		confirmpswd.sendKeys(new_pswd);
		submitBtn.click();
	}
	

}
