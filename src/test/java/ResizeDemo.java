import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizeDemo{
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(iframe);
		
		WebElement resize = driver.findElement(By.xpath("//*[@id ='resizable']"));
		
		Actions action = new Actions(driver);
//		action.dragAndDropBy(resize, 300, 100).perform();
		action.contextClick(resize).perform(); // for right click
		
		
		
	}
}