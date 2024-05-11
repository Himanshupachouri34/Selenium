import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateSite {

	public static String browser = "chrome";
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if(browser.equals("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 
		}else if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Software Jobs");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		driver.findElement(By.cssSelector("#APjFqb")).clear();
//		driver.close();
	}

}

