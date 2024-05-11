import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		WebElement frame1 = driver.findElement(By.id("iframeResult"));

		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/button")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
	}

}
