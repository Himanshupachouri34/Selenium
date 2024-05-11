import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		WebElement drop = driver.findElement(By.className("product_sort_container"));

		Select select = new Select(drop);

		WebElement firstElement = select.getFirstSelectedOption();
		System.out.println(firstElement.getText());

		select.selectByValue("az");
		select.selectByIndex(2);

	}

}
