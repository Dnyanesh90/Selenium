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

public class Demo7 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement wb =driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		WebElement youraccount=driver.findElement(By.xpath("//span[text()='Your Prime Video']"));
		
		
		Actions act =new Actions(driver);
		act.moveToElement(wb).click(youraccount).build().perform();
		Thread.sleep(5000);
		WebElement yourorder=driver.findElement(By.xpath("//span[text()='Sign in to join Prime']"));
		
		act.click(yourorder).build().perform();
		
	
		Thread.sleep(5000);
		
		driver.findElement(By.id("ap_email")).sendKeys("selenium@gmail.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File f =ts.getScreenshotAs(OutputType.FILE);
		
		
		File dist =new File(System.getProperty("user.dir")+"//screenshotfolder//b1.png");
		
		FileUtils.copyFile(f, dist);
	
		
		

	}

}
