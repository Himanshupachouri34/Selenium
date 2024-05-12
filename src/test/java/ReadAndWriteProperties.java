import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadAndWriteProperties {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		FileInputStream  input =  new FileInputStream("/Users/himanshupachouri/Desktop/Selenium/Selenium/src/test/resources/properties/testData.properties");
		properties.load(input);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		FileOutputStream output = new FileOutputStream("/Users/himanshupachouri/Desktop/Selenium/Selenium/src/test/resources/properties/testData.properties");
		properties.setProperty("TestId", "123456");
		properties.store(output, "This is Comment You Want to Add");
		
		
	}

}
