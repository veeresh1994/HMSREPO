package HMS_Admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatePatient_SearchPatient {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream f1=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties pobj = new Properties();
		pobj.load(f1);
		String URL = pobj.getProperty("url");
		String Doct_UN = pobj.getProperty("Dusername");
		String Doct_pswd = pobj.getProperty("Dpassword");
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\HMS_Test_Data1.xlsx");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@href='hms/doctor/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Doct_UN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Doct_pswd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='edit-profile.php']")).click();
		Thread.sleep(2000);
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.getRow(7);
		String fee=rw.getCell(3).getStringCellValue();
		WebElement ele=driver.findElement(By.xpath("//input[@name='docfees']"));
		ele.clear();
		ele.sendKeys(fee);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-o btn-primary']")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Patients ']/..")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Add Patient']/..")).click();
		Thread.sleep(2000);
		String P_name=wb.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
		String Pcontactno=wb.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		String Pemail=wb.getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
		String Padress=wb.getSheet("Sheet1").getRow(4).getCell(3).getStringCellValue();
		String P_age=wb.getSheet("Sheet1").getRow(4).getCell(4).getStringCellValue();
		String Med_History=wb.getSheet("Sheet1").getRow(4).getCell(5).getStringCellValue();
		driver.findElement(By.xpath("//input[@placeholder='Enter Patient Name']")).sendKeys(P_name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Patient Contact no']")).sendKeys(Pcontactno);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Patient Email id']")).sendKeys(Pemail);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='rg-male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Patient Address']")).sendKeys(Padress);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Patient Age']")).sendKeys(P_age);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Patient Medical History(if any)']")).sendKeys(Med_History);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-o btn-primary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Search ']/ancestor::div[@class='item-content']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='searchdata']")).sendKeys(Pcontactno);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-o btn-primary']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
        		
	}

}
