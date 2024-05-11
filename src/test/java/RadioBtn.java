import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioBtn {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();

		WebElement radio1 = driver.findElement(By.id("bookFlights"));
		WebElement radio2 = driver.findElement(By.id("redeemFlights"));

		radio1.click();

		System.out.println(radio1.isSelected());
		System.out.println(driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());
	}

}
