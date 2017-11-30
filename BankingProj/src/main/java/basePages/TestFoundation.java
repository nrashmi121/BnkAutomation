package basePages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import baseTestFiles.PreTestFile;


public class TestFoundation extends PreTestFile {
	Properties prop = new Properties();
	FileInputStream input = null;
	
	// Fetch data from property file.
	public String fetchDataFromPropertyFile(String fileName, String fieldName) {
		String name = null;
		System.out.println("TF ----------");
		try {
			input = new FileInputStream("src/main/resources/" + fileName);
			// load a properties file
			prop.load(input);
			// get the property value and print it out
			name = prop.getProperty(fieldName);
		} catch (FileNotFoundException e) {
			System.out.println("EXCEPTION: File is not Found.");
			e.printStackTrace();
		} catch (IOException ex) {
			System.out.println("EXCEPTION: IO Exception is caught.");
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return name;
	}
	
	
}
