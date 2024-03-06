package pomrepository;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Admindashboardpage {
	//declaration
	@FindBy(xpath="//a[@href='dashboard.php']")
	private WebElement Dashboardmajortab;
	@FindBy(xpath="//a[@href='javascript:void(0)']")
	private WebElement Doctordropdown;
	@FindBy(xpath="//a[@href='doctor-specilization.php']")
	private WebElement Doctorspecialization;
	@FindBy(xpath="//a[@href='add-doctor.php']")
	private WebElement Adddoctorlink;
	@FindBy(xpath="//a[@href='Manage-doctors.php']")
	private WebElement Managedoctorslink;
	@FindBy(xpath="//a[@href='javascript:void(0)']")
	private WebElement Usersdropdown;
	@FindBy(xpath="(//a[@href='manage-users.php'])[1]")
	private WebElement Manageuserslink;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[3]")
	private WebElement Patientsdropdown;
	@FindBy(xpath="//a[@href='manage-patient.php']")
	private WebElement Managepatients;
	@FindBy(xpath="(//a[@href='appointment-history.php'])[1]")
	private WebElement Appointmenthistory;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[4]")
	private WebElement Contactusqueries;
	@FindBy(xpath="(//a[@href='unread-queries.php'])[1]")
	private WebElement Unreadqueries;
	@FindBy(xpath="//a[@href='read-query.php']")
	private WebElement Readqueries;
	@FindBy(xpath="//a[@href='doctor-logs.php']")
	private WebElement Doctorsessionlogs;
	@FindBy(xpath="//a[@href='user-logs.php']")
	private WebElement Usersessionlogs;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[5]")
	private WebElement Reportsdropdown;
	@FindBy(xpath="//a[@href='between-dates-reports.php']")
	private WebElement btwdatesreportslink;
	@FindBy(xpath="//a[@href='patient-search.php']")
	private WebElement Patientsearch;
	@FindBy(xpath="(//p[@class='links cl-effect-1'])[1]")
	private WebElement Totaluserlink;
	@FindBy(xpath="//p[@class='cl-effect-1']")
	private WebElement Totaldoctorslink;
	@FindBy(xpath="(//a[@href='appointment-history.php'])[2]")
	private WebElement Totalappointmentslink;
	@FindBy(xpath="(//a[@href='manage-patient.php'])[2]")
	private WebElement Totalpatientslink;
	@FindBy(xpath="(//a[@href='unread-queries.php'])[2]")
	private WebElement Totalnewqueries;
	@FindBy(xpath="//li[@class='dropdown current-user']")
	private WebElement Adminprofiledropdown;
	//initialization
	public Admindashboardpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getDashboardmajortab() {
		return Dashboardmajortab;
	}

	public WebElement getDoctordropdown() {
		return Doctordropdown;
	}

	public WebElement getDoctorspecialization() {
		return Doctorspecialization;
	}

	public WebElement getAdddoctorlink() {
		return Adddoctorlink;
	}

	public WebElement getManagedoctorslink() {
		return Managedoctorslink;
	}

	public WebElement getUsersdropdown() {
		return Usersdropdown;
	}

	public WebElement getManageuserslink() {
		return Manageuserslink;
	}

	public WebElement getPatientsdropdown() {
		return Patientsdropdown;
	}

	public WebElement getManagepatients() {
		return Managepatients;
	}

	public WebElement getAppointmenthistory() {
		return Appointmenthistory;
	}

	public WebElement getContactusqueries() {
		return Contactusqueries;
	}

	public WebElement getUnreadqueries() {
		return Unreadqueries;
	}

	public WebElement getReadqueries() {
		return Readqueries;
	}

	public WebElement getDoctorsessionlogs() {
		return Doctorsessionlogs;
	}

	public WebElement getUsersessionlogs() {
		return Usersessionlogs;
	}

	public WebElement getReportsdropdown() {
		return Reportsdropdown;
	}

	public WebElement getBtwdatesreportslink() {
		return btwdatesreportslink;
	}

	public WebElement getPatientsearch() {
		return Patientsearch;
	}

	public WebElement getTotaluserlink() {
		return Totaluserlink;
	}

	public WebElement getTotaldoctorslink() {
		return Totaldoctorslink;
	}

	public WebElement getTotalappointmentslink() {
		return Totalappointmentslink;
	}

	public WebElement getTotalpatientslink() {
		return Totalpatientslink;
	}

	public WebElement getTotalnewqueries() {
		return Totalnewqueries;
	}

	public WebElement getAdminprofiledropdown() {
		return Adminprofiledropdown;
	}
	//Business Libraries
	
	public void clickondashboard()
	{
		Dashboardmajortab.click();
	}
	public void clickonDoctordropdown()
	{
		Doctordropdown.click();
		//Select sel=new Select(Doctordropdown);
		//sel.selectByVisibleText(Visibletext);
	}
	public void clickonDoctorspecialization()
	{
		Doctorspecialization.click();
	}
	public void clickonAdddoctorlink()
	{
		Adddoctorlink.click();
	}
	public void clickonManagedoctorslink()
	{
		Managedoctorslink.click();
	}
	public void clickonUsersdropdown(int ind)
	{
		Usersdropdown.click();
		Select sel=new Select(Usersdropdown);
		sel.selectByIndex(ind);
	}
	public void clickonManageuserslink()
	{
		Manageuserslink.click();
	}
	public void clickonPatientsdropdown(int ind)
	{
		Patientsdropdown.click();
		Select sel=new Select(Patientsdropdown);
		sel.selectByIndex(ind);
	}
	public void clickonManagepatients()
	{
		Managepatients.click();
	}
	public void clickonAppointmenthistory()
	{
		Appointmenthistory.click();
	}
	public void clickonContactusqueries()
	{
		Contactusqueries.click();
		//Select sel=new Select(Contactusqueries);
		//sel.selectByIndex(ind);
	}
	public void clickonUnreadqueries()
	{
		Unreadqueries.click();
	}
	public void clickonReadqueries()
	{
		Readqueries.click();
	}
	public void clickonDoctorsessionlogs()
	{
		Doctorsessionlogs.click();
	}
	public void clickonUsersessionlogs()
	{
		Usersessionlogs.click();
	}
	public void clickonReportsdropdown()
	{
		Reportsdropdown.click();
		//Select sel=new Select(Reportsdropdown);
		//sel.selectByIndex(0);
	}
	public void clickonbtwdatesreportslink()
	{
		btwdatesreportslink.click();
	}
	public void clickonPatientsearch()
	{
		Patientsearch.click();
	}
	public void clickonTotaluserlink()
	{
		Totaluserlink.click();
	}
	public void clickonTotaldoctorslink()
	{
		Totaldoctorslink.click();
	}
	public void clickonTotalappointmentslink()
	{
		Totalappointmentslink.click();
	}
	public void clickonTotalpatientslink()
	{
		Totalpatientslink.click();
	}
	public void clickonTotalnewqueries()
	{
		Totalnewqueries.click();
	}
	public void clickonAdminprofiledropdown()
	{
		Adminprofiledropdown.click();
		//Select sel=new Select(Adminprofiledropdown);
		//sel.selectByIndex(ind);
	}

	
 
}
