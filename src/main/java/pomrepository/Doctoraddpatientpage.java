package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Doctoraddpatientpage {
	
	@FindBy(xpath="//input[@placeholder='Enter Patient Name']")
	private WebElement Patientname;
	@FindBy(xpath="//input[@placeholder='Enter Patient Contact no']")
	private WebElement Patientcontactno;
	@FindBy(name="patemail")
	private WebElement Patientemail;
	@FindBy(xpath="//label[@for='rg-male']")
	private WebElement Maleradiobutton;
	@FindBy(xpath="//label[@for='rg-female']")
	private WebElement femaleradiobutton;
	@FindBy(xpath="//textarea[@name='pataddress']")
	private WebElement Patientaddress;
	@FindBy(name="patage")
	private WebElement Patientage;
	@FindBy(name="medhis")
	private WebElement Medicalhistory;
	@FindBy(name="submit")
	private WebElement Addbutton;

	public Doctoraddpatientpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addmalepatient(String Pat_name,String Pat_contactno,String Pat_email,String Pat_address,String Pat_age,String Med_history)
	{
		Patientname.sendKeys(Pat_name);
		Patientcontactno.sendKeys(Pat_contactno);
		Patientemail.sendKeys(Pat_email);
		Maleradiobutton.click();
		Patientaddress.sendKeys(Pat_address);
		Patientage.sendKeys(Pat_age);
		Medicalhistory.sendKeys(Med_history);
		Addbutton.click();
	}
	
	public void addfemalepatient(String Pat_name,String Pat_contactno,String Pat_email,String Pat_address,String Pat_age,String Med_history)
	{
		Patientname.sendKeys(Pat_name);
		Patientcontactno.sendKeys(Pat_contactno);
		Patientemail.sendKeys(Pat_email);
		femaleradiobutton.click();
		Patientaddress.sendKeys(Pat_address);
		Patientage.sendKeys(Pat_age);
		Medicalhistory.sendKeys(Med_history);
		Addbutton.click();
	}

}
