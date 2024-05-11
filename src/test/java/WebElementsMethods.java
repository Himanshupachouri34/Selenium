import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsMethods {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("Testing");
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.name("user-name")).getAttribute("id");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getCssValue("border"));
		

	}

}
