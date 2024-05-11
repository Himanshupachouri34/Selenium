import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        
        // Set implicit wait with java.time.Duration
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/img"));
        
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        
        // Initialize WebDriverWait with java.time.Duration
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/object/a[5]")));
        clickableElement.click();
        
        // Optionally, close the driver after operations are complete
    }
}
