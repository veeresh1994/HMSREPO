package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addmedicalhistorypage {

	@FindBy(xpath="//input[@placeholder='Blood Pressure']")
	private WebElement bloodpressurefield;
	@FindBy(xpath="//input[@name='bs']")
	private WebElement bloodsugarfield;
	@FindBy(xpath="//input[@placeholder='Weight']")
	private WebElement weightfield;
	@FindBy(xpath="//th[text()='Body Temprature :']/../td")
	private WebElement bodytemp_field;
	@FindBy(xpath="//textarea[@placeholder='Medical Prescription']")
	private WebElement med_prescription;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement submitBtn;
	@FindBy(xpath="//button[text()='Close']")
	private WebElement closeBtn;
	//initialization
	public Addmedicalhistorypage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getBloodpressurefield() {
		return bloodpressurefield;
	}
	public WebElement getBloodsugarfield() {
		return bloodsugarfield;
	}
	public WebElement getWeightfield() {
		return weightfield;
	}
	public WebElement getBodytemp_field() {
		return bodytemp_field;
	}
	public WebElement getMed_prescription() {
		return med_prescription;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public WebElement getCloseBtn() {
		return closeBtn;
	}
	//business library
	public void addmedicalhistory(String BP,String Blood_Sugar,String Weight,String Body_Temp,String Prescription)
	{
		bloodpressurefield.sendKeys(BP);
		bloodsugarfield.sendKeys(Blood_Sugar);
		weightfield.sendKeys(Weight);
		bodytemp_field.sendKeys(Body_Temp);
		med_prescription.sendKeys(Prescription);
		submitBtn.click();
	}
	
	
}
