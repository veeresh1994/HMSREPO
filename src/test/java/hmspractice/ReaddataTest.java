package hmspractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReaddataTest {

		@Test
        public void Launchappmaven() throws InterruptedException
        {
			String browser = System.getProperty("browser");
			String URL = System.getProperty("url");
			String UN = System.getProperty("un");
			String Password = System.getProperty("pwd");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		    driver.manage().window().maximize();
			driver.get(URL);
			driver.findElement(By.name("user_name")).sendKeys(UN);
			driver.findElement(By.name("user_password")).sendKeys(Password);
			driver.findElement(By.xpath("//input[@id='submitButton']")).click();
			Thread.sleep(3000);
			driver.close();
			
		

	}

}
