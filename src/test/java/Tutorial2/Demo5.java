package Tutorial2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\kadam\\\\eclipse-workspace\\\\chromedriver.exe");

		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		
		while(true)
		{
			String a =driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText();
			Thread.sleep(2000);
			if(a.equals("March 2023"))
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//span[contains(@class,'next')]")).click();
			}
			
		}
		
		driver.findElement(By.xpath("(//p[text()='10'])[1]")).click();

	}

}
