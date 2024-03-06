package assertions;

//import static org.testng.Assert.;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionpractice {
	
	@Test
	public void assertion1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String at=driver.getTitle();
		System.out.println(at);
		String expt="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		assertEquals(at, expt);	
	}
	@Test
	public void assertion2()
	{
		int a=5;
		int b=5;
		SoftAssert sa=new SoftAssert();
		sa.assertSame(a,b,"a doesnot have any null value");
		sa.assertAll();
	}
	

}
