package hmspractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//div[@class='sc-12foipm-14 lhvXDk']/div[2]")).sendKeys("Pune");
		
		
		
		
		

	}

}
