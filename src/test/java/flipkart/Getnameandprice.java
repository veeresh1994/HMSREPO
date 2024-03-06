package flipkart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellReferenceType;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getnameandprice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, AWTException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("iphone");
		//Actions act=new Actions(driver);
		//driver.findElement(By.xpath("//path[@class='_34RNph']"));
		//act.sendKeys(Keys.ENTER);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
				
		List<WebElement> phonenames=driver.findElements(By.xpath("//div[@class='_2kHMtA']//div[@class='_4rR01T']"));
		String pricepath="//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']";
		List<WebElement> ele2=driver.findElements(By.xpath(pricepath));
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\HMS_Test_Data1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("Sheet5");	
		for(WebElement e:phonenames)
		{
			for(int i=0;i<phonenames.size();i++)
			{
				WebElement index=phonenames.get(i);
				String name=index.getText();
				Thread.sleep(3000);
			    WebElement price=driver.findElement(By.xpath(pricepath));
			    String pricevalue=price.getText();
			    System.out.println(name+"--->"+pricevalue);
			// sh.createRow(i).createCell(i).setCellValue(name+"--->"+pricevalue);
			 
			    	  					  
			}
			
			driver.quit();
		
	}
			

		
}

