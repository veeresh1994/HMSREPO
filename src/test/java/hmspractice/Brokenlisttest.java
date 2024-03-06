package hmspractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Brokenlisttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(WebElement link:allLinks)
		{
			String eachlink = link.getAttribute("href");
			URL url= null;
			int statuscode=0;
			try {
				url=new URL(eachlink);
				HttpURLConnection httpconn=(HttpURLConnection) url.openConnection();
				statuscode=httpconn.getResponseCode();
				if(statuscode>=400)
				{
					System.out.println(eachlink+"---->"+statuscode);
			}
			}
			catch(Exception e)
			{
				System.out.println(eachlink+"---->"+statuscode);
				
			}
		}
		}
		
	

}

