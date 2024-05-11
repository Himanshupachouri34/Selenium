import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) throws InterruptedException{
		
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();


		driver.get("https://www.sugarcrm.com");
		driver.manage().window().maximize();
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println("Total Tags:" + alltags.size());
		
		for(int i=0; i < alltags.size(); i++) {
			System.out.println("Links are:" + alltags.get(i).getAttribute("href"));
			System.out.println("Links Text:" + alltags.get(i).getText());
		}	
	}

}

