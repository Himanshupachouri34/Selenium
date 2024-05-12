import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor; // Correct import for JavascriptExecutor
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// Setup ChromeDriver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the page
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		// Cast driver to JavascriptExecutor
		JavascriptExecutor jsexec = (JavascriptExecutor) driver;

		// Execute script to get the document title of page
		String script = "return document.title;";
		String title = (String) jsexec.executeScript(script);

		System.out.println("Document title is: " + title);
		
		// to click the button
		driver.switchTo().frame("iframeResult");
		jsexec.executeScript("myFunction()");
		
		//accept the PopUp
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//HighLight The Button
		WebElement btn = driver.findElement(By.xpath("/html/body/button"));
		jsexec.executeScript("arguments[0].style.border='5px solid greeen'", btn);   
		
		//to scroll page
		driver.navigate().to("https://www.w3schools.com/");
		WebElement elem = driver.findElement(By.xpath("//*[@id=\"main\"]/div[16]/p/a"));
		jsexec.executeScript("arguments[0].scrollIntoView(true);", elem);

	}
}
