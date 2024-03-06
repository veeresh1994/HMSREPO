package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patientdashboardpage {
	//declaration
	@FindBy(xpath="//a[@href='dashboard.php']")
	private WebElement patientdashboardlink;
	@FindBy(xpath="(//a[@href='book-appointment.php'])[1]")
	private WebElement bookappointment;
	@FindBy(xpath="(//a[@href='appointment-history.php'])[1]")
	private WebElement appointmenthistory;
	@FindBy(xpath="//a[@href='manage-medhistory.php']")
	private WebElement Medicalhistory;
	@FindBy(xpath="(//a[@href='edit-profile.php'])[2]")
	private WebElement updateprofile;
	@FindBy(xpath="(//a[@href='appointment-history.php'])[2]")
	private WebElement viewappointmenthistory;
	@FindBy(xpath="(//a[@href='book-appointment.php'])[2]")
	private WebElement bk_apptmt_link;
	@FindBy(xpath="//li[@class='dropdown current-user']")
	private WebElement profiledropdown;
	//initialization
    public Patientdashboardpage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void clickonpatientdashboard()
    {
    	patientdashboardlink.click();
    }
    public void clickonbookaapointment()
    {
    	bookappointment.click();
    }
    public void clickonappointmenthistory()
    {
    	appointmenthistory.click();
    }
    public void clickonMedicalhistory()
    {
    	Medicalhistory.click();
    }
    public void clickonupdateprofile()
    {
    	updateprofile.click();
    }
    public void clickonviewappointmenthistory()
    {
    	viewappointmenthistory.click();
    }
    public void clickonbk_apptmt_link()
    {
    	bk_apptmt_link.click();
    }
    public void clickonprofiledropdown()
    {
    	profiledropdown.click();
    }
}
