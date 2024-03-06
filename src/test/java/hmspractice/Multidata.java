package hmspractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multidata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\CommonData.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		
		

	}

}
