package Tutorial1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sumo1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kadam\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[starts-with(text(),'Create New Account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("DNYANESHWAR");
		driver.findElement(By.name("lastname")).sendKeys("KADAM");
		driver.findElement(By.name("reg_email__")).sendKeys("7507847874");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Dk@7507847874");
		
		Thread.sleep(5000);
		WebElement wb =driver.findElement(By.id("day"));
		WebElement wc =driver.findElement(By.id("month"));
		WebElement wd =driver.findElement(By.id("year"));
		
        Select sel1 =new Select(wb);
        Select sel2 =new Select(wc);
        Select sel3 =new Select(wd);
        
        
		sel1.selectByValue("2");
		sel2.selectByValue("7");
		sel3.selectByValue("1990");
		
		
		WebElement abc =sel1.getFirstSelectedOption();
		WebElement pqr=sel2.getFirstSelectedOption();
		WebElement xyz =sel3.getFirstSelectedOption();
		
		
		String a=abc.getText();
		String b=pqr.getText();
		String c=xyz.getText();
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='_58mt'and text()='Male']")).click();
		
		Thread.sleep(5000);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File f =ts.getScreenshotAs(OutputType.FILE);
		
        FileUtils.copyFile(f, new File("C:\\Users\\kadam\\eclipse-workspace1\\Selenium\\Selenium\\Screenshot\\\\1.png"));
		
		
		System.out.println("Screenshot capture");
		Thread.sleep(2000);
		
		driver.close();	
	}

}
