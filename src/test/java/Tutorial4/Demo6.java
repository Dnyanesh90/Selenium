package Tutorial4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
		
		WebElement wb =driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions act =new Actions(driver);
		act.moveToElement(wb).build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[contains(text(),'Your Orders')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("selenium@gmail.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File f =ts.getScreenshotAs(OutputType.FILE);
		
		
		File dist =new File(System.getProperty("user.dir")+"//Screenshot//b1.png");
		
		FileUtils.copyFile(f, dist);
		

	}

}
