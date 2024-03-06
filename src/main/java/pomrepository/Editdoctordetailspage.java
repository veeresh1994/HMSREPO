package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Editdoctordetailspage {
	
	@FindBy(name="Doctorspecialization")
	private WebElement Doctorspecializationdropdown;
	@FindBy(name="docname")
	private WebElement doctorname;
	@FindBy(name="clinicaddress")
	private WebElement clinicaddress;
    @FindBy(name="docfees")
    private WebElement doctorfee;
    @FindBy(name="doccontact")
    private WebElement doctorcontactno;
    @FindBy(name="docemail")
    private WebElement doctoremail;
    @FindBy(xpath="//button[@name='submit']")
    private WebElement Updatebutton;
    
    public Editdoctordetailspage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	
    }
    
    public void selectspecialization(String specialization)
    {
    	Select sel= new Select(Doctorspecializationdropdown);
    			sel.selectByVisibleText(specialization);
    }
	public void enterdoctorname(String Doc_name)
	{
		doctorname.clear();
		doctorname.sendKeys(Doc_name);
	}
	public void Enterclinicaddress(String Clinicaddress)
	{
		clinicaddress.clear();
		clinicaddress.sendKeys(Clinicaddress);
	}
	public void enterdoctorfee(String Doc_fee)
	{
		doctorfee.clear();
		doctorfee.sendKeys(Doc_fee);
	}
    public void enterdoctorcontactno(String contactno)
    {
    	doctorcontactno.clear();
    	doctorcontactno.sendKeys(contactno);
    }
    public void enterdoctoremail(String Doc_email)
    {
    	doctoremail.clear();
    	doctoremail.sendKeys(Doc_email);
    }
    public void clickonupdate()
    {
    	Updatebutton.click();
    }
}
