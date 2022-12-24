package Tutorial3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo5 {
	static String facebookid;
	static String hrmid;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
        driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		
		String parent =driver.getWindowHandle();
		
		System.out.println(parent);
		
		driver.findElement(By.name("address")).sendKeys("Pune");
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("book")).click();
		
		Set<String> allwindow =driver.getWindowHandles();
		
		
		for(String abc:allwindow)
		{
			if(!abc.equals(parent))
			{
				driver.switchTo().window(abc);
				Thread.sleep(5000);
				facebookid=driver.getWindowHandle();
			}
		}
		
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("HRM")).click();
		
		//switch focus HRM link
		//first we need HRM id.
		
		allwindow=driver.getWindowHandles();
		System.out.println(allwindow.size());
		
		for(String abc:allwindow)
		{	
			//window-- fb id-- hrm
			if(!((abc.equals(parent))||(abc.equals(facebookid))))	//false false
			{
				driver.switchTo().window(abc);
				hrmid =driver.getWindowHandle();
			}
		}
		
		Thread.sleep(10000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().window(facebookid);
		Thread.sleep(5000);
		driver.findElement(By.name("lastname")).sendKeys("cucumber");
		
		
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.name("fname")).sendKeys("Mumbai");
		
		Thread.sleep(5000);
		
		driver.quit();	
	}

}
