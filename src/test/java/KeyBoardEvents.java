import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.j2objc.annotations.Weak;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[14]/pre"));
		WebElement paste = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[10]/pre"));
		Actions action = new Actions(driver);
		
		action.keyDown(text, Keys.COMMAND).sendKeys("a").sendKeys("c").build().perform();
		action.keyDown(paste, Keys.COMMAND).sendKeys("a").sendKeys("v").build().perform();
		
	}

}
