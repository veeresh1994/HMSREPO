package com.HMS.genericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class FileUtils {

	
		
		public String readDatafromPropertyFile(String key) throws IOException
		{
			FileInputStream fis= new FileInputStream(IpathConstants.FilePath);
			Properties pobj=new Properties();
			pobj.load(fis);
			String value=pobj.getProperty(key);
			return value; 
			
		}
		public HashMap<String,String> readMltipleData(String sheetName, int cell, WebDriver driver) throws EncryptedDocumentException, IOException
		{
			FileInputStream fi = new FileInputStream(IpathConstants.ExcelPath);
			Workbook wb = WorkbookFactory.create(fi);
			Sheet sh = wb.getSheet(sheetName);
			int rowCount = sh.getLastRowNum();
			
			HashMap<String,String> map= new HashMap<String,String>();
			
			for(int i=0;i<=rowCount; i++)
			{
				String key = sh.getRow(i).getCell(cell).getStringCellValue();
				String value= sh.getRow(i).getCell(cell+1).getStringCellValue();
				map.put(key, value);
			}
			return map;
		}
		
		public void writeDataIntoExcel(String sheetName, int row, int cell, String value) throws EncryptedDocumentException, IOException
		{
			FileInputStream fi= new FileInputStream(IpathConstants.ExcelPath);
			Workbook wb = WorkbookFactory.create(fi);
			wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(value);
			
			FileOutputStream fout = new FileOutputStream(IpathConstants.ExcelPath);
			wb.write(fout);
			wb.close();		
		}
		public int getLastRowNo(String sheetName) throws Throwable
		{
			FileInputStream fi= new FileInputStream(IpathConstants.ExcelPath);
			Workbook wb = WorkbookFactory.create(fi);
			int rowcount = wb.getSheet(sheetName).getLastRowNum();
			
			return rowcount;
		}
}
