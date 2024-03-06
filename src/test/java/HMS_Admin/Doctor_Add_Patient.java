package HMS_Admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doctor_Add_Patient {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fi= new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties pobj = new Properties();
		pobj.load(fi);
		
		String Browser=pobj.getProperty("browser");
		String Url=pobj.getProperty("url");
		String Admin_UN=pobj.getProperty("username");
		String Admin_pswd=pobj.getProperty("password");
		String Doc_UN=pobj.getProperty("Dusername");
		String Doc_Pswd=pobj.getProperty("Dpassword");
		String PNAME=pobj.getProperty("Pname");
		String Pcontactno=pobj.getProperty("Pcontact_no");
		String Pemailid=pobj.getProperty("Pemail");
		String Paddress=pobj.getProperty("Padress");
		String Page=pobj.getProperty("P_age");
		String Med_history=pobj.getProperty("Med_History");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.get(Url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='hms/doctor/']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Doc_UN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Doc_Pswd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		Thread.sleep(3000);
 		driver.findElement(By.xpath("//span[text()=' Patients ']/..")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//span[text()=' Add Patient']/..")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//input[@placeholder='Enter Patient Name']")).sendKeys(PNAME);
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//input[@placeholder='Enter Patient Contact no']")).sendKeys(Pcontactno);
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//input[@placeholder='Enter Patient Email id']")).sendKeys(Pemailid);
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//label[@for='rg-male']")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//textarea[@placeholder='Enter Patient Address']")).sendKeys(Paddress);
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//input[@placeholder='Enter Patient Age']")).sendKeys(Page);
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//textarea[@placeholder='Enter Patient Medical History(if any)']")).sendKeys(Med_history);
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//button[@id='submit']")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.name("username")).sendKeys(Admin_UN);
 		Thread.sleep(3000);
 		driver.findElement(By.name("password")).sendKeys(Admin_pswd);
 		Thread.sleep(3000);
 		driver.findElement(By.name("submit")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//span[text()=' Patients ']")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//span[text()=' Manage Patients ']")).click();
 		Thread.sleep(3000);
 		String title=driver.getTitle();
 		String et="Admin | View Patients";
 		System.out.println(title);
 		if(title.equals(et))
 		{
 			System.out.println("Test case passed");
 		}
 		else {
 			System.out.println("Test case failed");
 		}
		
	}

}
