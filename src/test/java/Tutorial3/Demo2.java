package Tutorial3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		driver.findElement(By.name("fname")).sendKeys("DNYANESHWAR");
		driver.findElement(By.name("lname")).sendKeys("KADAM");
		driver.findElement(By.name("address")).sendKeys("PUNE");
		
		driver.findElement(By.partialLinkText("HRM")).click();
		
		String a =driver.getWindowHandle();
		System.out.println(a);
		
		System.out.println("---------");
		driver.findElement(By.partialLinkText("Google")).click();
		

		Set<String> allwindow =driver.getWindowHandles();
		
		for(String abc:allwindow)
		{
			if(!abc.equals(a))
			{
				driver.switchTo().window(abc);
				System.out.println(driver.getTitle());
			}
		}
			
		
		
	}

}
