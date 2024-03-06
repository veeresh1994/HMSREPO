package hmspractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xddf.usermodel.XDDFColorSystemDefined;

public class Excelfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fi= new FileInputStream(".\\src\\test\\resources\\CommonData.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		//String value = wb.getSheet("Organization").getRow(1).getCell(0).getStringCellValue();
		Sheet sh = wb.getSheet("Organization");
		int Rowcount = sh.getLastRowNum();
		int celcount = sh.getRow(0).getLastCellNum();
		for(int i=0;i<Rowcount;i++)
		{
			for(int j=0;j<celcount;j++)
			{
				String value=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
	         System.out.println();
		}
		

	}

}
