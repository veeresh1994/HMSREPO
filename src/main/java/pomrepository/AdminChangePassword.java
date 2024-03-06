package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminChangePassword {
	
	@FindBy(name="cpass")
	private WebElement currentpswd;
	@FindBy(name="npass")
	private WebElement newpassword;
	@FindBy(name="cfpass")
    private WebElement confirmpswd;
	@FindBy(name="submit")
	private WebElement submitBtn;
	
	public AdminChangePassword(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void adminChangePassword(String cur_pswd,String new_pswd)
	{
		currentpswd.sendKeys(cur_pswd);
		newpassword.sendKeys(new_pswd);
		confirmpswd.sendKeys(new_pswd);
		submitBtn.click();
	}
}
