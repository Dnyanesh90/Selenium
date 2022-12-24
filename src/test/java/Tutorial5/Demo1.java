package Tutorial5;

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

public class Demo1 {

	public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
        WebElement wb =driver.findElement(By.xpath("//span[text()='Computers & Gaming']"));
		
		WebElement youraccount=driver.findElement(By.xpath("//span[text()='Pen Drives']"));
		
		
		Actions act =new Actions(driver);
		act.moveToElement(wb).click(youraccount).build().perform();
		Thread.sleep(5000);
		WebElement yourorder=driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[5]"));
		
		act.click(yourorder).build().perform();
		
	
		Thread.sleep(5000);
		
		driver.findElement(By.id("ap_email")).sendKeys("selenium@gmail.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File f =ts.getScreenshotAs(OutputType.FILE);
		
		
		File dist =new File(System.getProperty("user.dir")+"//screenshotfolder//b1.png");
		
		FileUtils.copyFile(f, dist);
	

	}

}
