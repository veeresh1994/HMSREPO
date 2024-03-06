package graph;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;	import org.openqa.selenium.interactions.Actions;


public class Handlegraph {

public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://emicalculator.net/");
	String Ttippath="//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']";
	String grect="//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
	List<WebElement> ele=driver.findElements(By.xpath(grect));
	Actions act=new Actions(driver);
	for(WebElement e:ele)
	{
		act.moveToElement(e).perform();
		Thread.sleep(500);
		String tooltiptext=driver.findElement(By.xpath(Ttippath)).getText();
		System.out.println(tooltiptext);
				
	}
			

 }

}



