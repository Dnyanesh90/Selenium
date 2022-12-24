package Tutorial3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
					
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		driver.findElement(By.name("fname")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		String parent =driver.getWindowHandle();
		
		driver.findElement(By.partialLinkText("book")).click();
		
		Set<String> allwindow =driver.getWindowHandles();
		
		String fbid;
		
		for(String a:allwindow)
		{	
			if(!a.equals(parent))
			{
				//here we focus on other window 
				driver.switchTo().window(a);
				//here we capture window id number
				fbid=driver.getWindowHandle();
				
				
			}
		}
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("firstname")).sendKeys("java");
		
		driver.findElement(By.name("lastname")).sendKeys("java");
		
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		
		driver.findElement(By.name("address")).sendKeys("Pune");
		
		driver.close();

	}

}
