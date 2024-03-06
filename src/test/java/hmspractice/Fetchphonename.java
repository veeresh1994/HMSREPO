package hmspractice;

import java.net.http.HttpClient;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fetchphonename {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//int price=20000;
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(3);
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung Phones");
		driver.findElement(By.xpath("//a[@title='England v India - 4th Test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
	    List<WebElement> scoreboard=driver.findElements(By.xpath("(//div[@class='cb-col cb-col-25 ']/../..)[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']"));
	    
	    for(WebElement ele : scoreboard)
	    { 
	          String Batsman=ele.findElement(By.xpath("//div[@class='cb-col cb-col-25 ']")).getText();
	          String Runs=ele.findElement(By.xpath("//div[@class='cb-col cb-col-8 text-right text-bold']")).getText();
	          System.out.println(Batsman+"  "+Runs);
	    }	  
		   
	}
}
