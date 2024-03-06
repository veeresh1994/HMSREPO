package testNGpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest {
	
	
	
	@DataProvider
	public Object[][] storedata()
	{
		Object[][]arr=new Object[3][2];
		arr[0][0]="Username1";
		arr[0][1]="password1";
		arr[1][0]="username2";
		arr[1][1]="password2";
		arr[2][0]="username3";
		arr[2][1]="password3";
		return arr;
	}
	@DataProvider
	public Object[][] data()
	{
		Object[][]obj=new Object[2][2];
		obj[0][0]="Banglore";
		obj[0][1]="Mumbai";
		obj[1][0]="Pune";
		obj[1][1]="Hyderabad";
		return obj;
	}
	@DataProvider
	public Object[][] excelData(String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\HMS_Test_Data1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		int rows=sh.getLastRowNum();
		int lastcell=sh.getRow(0).getLastCellNum();
		
		Object[][]obj=new Object[rows][lastcell];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<lastcell;j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}

}
