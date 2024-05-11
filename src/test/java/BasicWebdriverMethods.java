import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebdriverMethods {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.get("https://saucedemo.com");
		driver.manage().window().fullscreen();

		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);

		String title = driver.getTitle();
		System.out.println(title);

		String PageSource = driver.getPageSource();
		System.out.println(PageSource);

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");

		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class=\'inventory_list\']/div"));
		System.out.println(webelements);

		driver.navigate().to("https://www.sugarcrm.com");

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

	}

}
