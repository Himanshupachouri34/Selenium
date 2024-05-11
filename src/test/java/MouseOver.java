import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/cssref/tryit.php?filename=trycss_sel_hover");
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"iframeResult_0\"]"));
		driver.switchTo().frame(frame);
		
		WebElement element = driver.findElement(By.xpath("/html/body/a[1]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

}
