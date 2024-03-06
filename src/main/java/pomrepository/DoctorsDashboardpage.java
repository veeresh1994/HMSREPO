package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HMS.genericUtils.WebdriverUtility;

public class DoctorsDashboardpage {
	
	//declaration
	@FindBy(xpath="//span[@class='username']")
	private WebElement Doctorsprofiledropdown;
	@FindBy(xpath="(//a[@href='edit-profile.php'])[1]")
	private WebElement Myprofilelink;
	@FindBy(xpath="(//a[@href='change-password.php'])")
	private WebElement Changepswdlink;
	@FindBy(xpath="//a[@href='logout.php']")
	private WebElement Logoutlink;
	
	public WebElement getMyprofilelink() {
		return Myprofilelink;
	}

	public WebElement getChangepswdlink() {
		return Changepswdlink;
	}

	public WebElement getLogoutlink() {
		return Logoutlink;
	}
	
	@FindBy(xpath="//a[@href='dashboard.php']")
	private WebElement Dashboardlink;
	@FindBy(xpath="(//a[@href='appointment-history.php'])[2]")
	private WebElement Appointmenthistorytab;
	@FindBy(xpath="//span[text()=' Patients ']")
	private WebElement Patientdropdown;
	@FindBy(xpath="//span[text()=' Add Patient']/..")
	private WebElement Addpatientlink;
	@FindBy(xpath="//a[@href='manage-patient.php']")
	private WebElement managepatientlink;
	@FindBy(xpath="//a[@href='search.php']")
	private WebElement Searchlink;
	@FindBy(xpath="(//a[@href='appointment-history.php'])[2]")
	private WebElement viewappointmenthistorylink;
	@FindBy(xpath="(//a[@href='edit-profile.php'])[2]")
	private WebElement updateprofilelink;
	//initialization
	
	public DoctorsDashboardpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilisation
	public WebElement getDoctorsprofiledropdown() {
		return Doctorsprofiledropdown;
	}

	public WebElement getDashboardlink() {
		return Dashboardlink;
	}

	public WebElement getAppointmenthistorytab() {
		return Appointmenthistorytab;
	}

	public WebElement getPatientdropdown() {
		return Patientdropdown;
	}

	public WebElement getSearchlink() {
		return Searchlink;
	}

	public WebElement getViewappointmenthistorylink() {
		return viewappointmenthistorylink;
	}

	public void setAddpatientlink(WebElement addpatientlink) {
		Addpatientlink = addpatientlink;
	}

	public WebElement getUpdateprofilelink() {
		return updateprofilelink;
	}
	
	//Business libraries
	public void clickondashboard(WebDriver driver)
	{
		Dashboardlink.click();
	}
	WebdriverUtility w=new WebdriverUtility();
	public void clickondoctorprofiledropdown(WebDriver driver)
	{
		w.waitforelementtobevisible(driver, Doctorsprofiledropdown);
		Doctorsprofiledropdown.click();
		//Select sel = new Select(Doctorsprofiledropdown);	
	}
	
	public void clickonMyprofilelink()
	{
		Myprofilelink.click();
	}
	
	public void clickonchangepswdlink()
	{
		Changepswdlink.click();
	}
	
	public void clickonlogoutlink()
	{
		Logoutlink.click();
	}
	public void clickonappointmenthistory()
	{
		Appointmenthistorytab.click();
	}
	public void clickonpatientdropdown()
	{
		Patientdropdown.click();
	}
	public void clickonsearch()
	{
		Searchlink.click();
	}
	public void clickonviewappointmenthistory()
	{
		viewappointmenthistorylink.click();
	}
	public void clickonupdateprofilelink()
	{
		updateprofilelink.click();
	}

	public WebElement getAddpatientlink() {
		return Addpatientlink;
	}

	public void clickonAddpatientlink()
	{
		Addpatientlink.click();
	}

	public WebElement getManagepatientlink() {
		return managepatientlink;
	}

	public void clickonmanagepatientlink()
	{
		managepatientlink.click();
	}
	

	
	
}
