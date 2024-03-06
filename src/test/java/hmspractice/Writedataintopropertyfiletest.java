package hmspractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Writedataintopropertyfiletest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties pobj = new Properties();
		pobj.setProperty("browser", "chrome");
		pobj.setProperty("url", "https://localhost:8888");
		pobj.setProperty("username", "admin");
		pobj.setProperty("password", "admin");
		FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\CommonData.properties");
		pobj.store(fout, "write data");

	}

}
