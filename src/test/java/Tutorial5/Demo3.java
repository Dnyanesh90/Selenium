package Tutorial5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(120));
		
		WebElement wb =wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		wb.sendKeys("admin123");
		
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
