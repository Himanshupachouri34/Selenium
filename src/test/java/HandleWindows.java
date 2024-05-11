import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://salesforce.com/au/");
		driver.findElement(By.xpath("//a[@href= '/au/form/signup/freetrial-sales-starter/?d=jumbo1-btn-ft']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> iterator = windows.iterator();
		
		
		String Tab1 = iterator.next();
		String Tab2 = iterator.next();
		
		driver.switchTo().window(Tab2);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Himanshu");
		driver.findElement(By.name("UserLastName")).sendKeys("Himanshu");
		
		driver.switchTo().window(Tab1);
		
		
	    
	}

}
