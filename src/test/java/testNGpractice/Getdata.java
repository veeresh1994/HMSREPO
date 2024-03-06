 package testNGpractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.HMS.genericUtils.ExcelUtility;

public class Getdata {
	 
	@Test(dataProvider="genericDP")
	public void getdata(String from,String To,String price)
	{
		System.out.println("Travel from "+from+" to "+To+" price is "+price);
	}

	@DataProvider
	public Object[][] genericDP() throws EncryptedDocumentException, IOException
	{
		ExcelUtility exc=new ExcelUtility();
		Object[][]value=exc.excelData("Sheet2");
        return value;
	}
	
}
