package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//button[@id='btn']"));
		System.out.println(ele.isSelected());
		ele.click();
		WebElement ele1=driver.findElement(By.xpath("//span[@class='text-green-600 p-1 px-2 ms-2 rounded-md']"));
		String text=ele1.getText();
		if(ele.isDisplayed())
		{
			System.out.println("The button is clicked");
		}
		Actions act=new Actions(driver);
		act.contextClick(ele);
		if(ele.isEnabled())
		{
			System.out.println("button is enabled");
		}
		else {
			System.out.println("button is disabled");
		}

	}

}
