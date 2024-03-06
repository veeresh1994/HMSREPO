package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookAppointmentpage {
	
	//declaration
	@FindBy(xpath="//select[@name='Doctorspecialization']")
	private WebElement Doctor_Speciln;
	@FindBy(xpath="//select[@name='doctor']")
    private WebElement sel_doctor;
	@FindBy(xpath="//select[@name='fees']")
	private WebElement doc_fee;
	@FindBy(xpath="//input[@name='appdate']")
	private WebElement date;
	@FindBy(xpath="//input[@name='apptime']")
	private WebElement time;
	@FindBy(xpath="//button[@name='submit']")
	private WebElement sub_Btn;
	
	//initialization
	public BookAppointmentpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	//Business logic
	public void bookappointment(String Doc_spltn,String doctrname,String Doc_fee,String Date,String timevalue)
	{
		Select sel= new Select(Doctor_Speciln);
		sel.selectByVisibleText(Doc_spltn);
		Select sel1= new Select(sel_doctor);
		sel1.selectByVisibleText(doctrname);
		Select sel2 = new Select(doc_fee);
		sel2.selectByVisibleText(Doc_fee);
		date.sendKeys(Date);
		time.sendKeys(timevalue);
		sub_Btn.click();
	}
	
	
	
}
