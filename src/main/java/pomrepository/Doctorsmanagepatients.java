package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Doctorsmanagepatients {
	//declaration
	@FindBy(xpath="//i[@class='fa fa-eye']")
	private WebElement eyeicon;
	
	@FindBy(xpath="//i[@class='fa fa-edit']")
	private WebElement editicon;
	
	//initialization
	public Doctorsmanagepatients(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	

}
