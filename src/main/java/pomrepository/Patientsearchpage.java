package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patientsearchpage {
	//declaration
	@FindBy(xpath="//input[@id='searchdata']")
	private WebElement searchtextfield;
	
	@FindBy(xpath ="//button[@class='btn btn-o btn-primary']")
	private WebElement searchBtn;
	
	@FindBy(xpath="(//i[@class='fa fa-eye'])[1]")
	private WebElement eyeicon;
	
	@FindBy(xpath="//button[@class='btn btn-primary waves-effect waves-light w-lg']")
	private WebElement addmed_historyBtn;
	
	//initialization
	public Patientsearchpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilisation
	public WebElement getSearchtextfield() {
		return searchtextfield;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public WebElement geteyeicon() {
		return eyeicon;
	}
	
	public WebElement getaddmed_historyBtn()
	{
		return addmed_historyBtn;
	}
	
	//Business library
	
	public void searchpatient(String Pat_Name)
	{
		searchtextfield.sendKeys(Pat_Name);
		searchBtn.click();
	}
	
	public void clickoneyeicon()
	{
		eyeicon.click();
	}
	public void clickonaddmed_historyBtn()
	{
		addmed_historyBtn.click();
	}
}
