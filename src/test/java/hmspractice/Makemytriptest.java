package hmspractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Makemytriptest {

	public static <Webdriver> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    driver.get("https://www.makemytrip.com/");
	    Thread.sleep(2000);
	    Actions act = new Actions(driver);
	    Thread.sleep(3000);
	    act.doubleClick().perform();
	    Thread.sleep(3000);
	    act.moveByOffset(50, 50).perform();
	    
	//    driver.navigate().refresh();
	    Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi");

	//	driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
	//	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Pune");
		
		
	//	driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]/div[3]/div[4]/div[3]")).click();
		Thread.sleep(2000);
		for(;;)
		{
			try {
				driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]/div[3]/div[4]/div[3]")).click();
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
			}
		}

	}

}
