import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table3");
		
		WebElement iframe =driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iframe);
		
		List<WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		List<WebElement> col = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td"));

		System.out.println(rows.size());
		
		for(int i=2; i<= rows.size(); i++) {
			for(int j=1; j <= col.size(); j++) {
				System.out.print(
						driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText() + " "
						);
			}
			System.out.println();
		}
	}
}
