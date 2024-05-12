import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		//Create instance of ChromeOptions Class
		ChromeOptions handlingSSL = new ChromeOptions();
		
		//Using the accept insecureCert method with true as parameter to accept the untrusted certificate
		handlingSSL.setAcceptInsecureCerts(true);
		
		ChromeDriver driver = new ChromeDriver(handlingSSL);

		driver.get("https://expired.badssl.com/");
		System.out.println("The Page Ttile is: " + driver.getTitle());
	}

}
