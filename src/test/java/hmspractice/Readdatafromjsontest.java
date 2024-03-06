package hmspractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Readdatafromjsontest {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader filepath = new FileReader(".\\src\\test\\resources\\data.json");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(filepath);
		
		Map map=(JSONObject) obj;
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
		System.out.println(map.get("browser"));

	}

}
