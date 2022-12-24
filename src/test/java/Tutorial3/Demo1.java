package Tutorial3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.railyatri.in/train-ticket");
		
		driver.findElement(By.id("datepicker")).click();
		
		while (true)
		{
           String b= driver.findElement(By.xpath("//div[@class='date_designs']")).getText();
			
			System.out.println(b);
			
			if(b.equals("January 2023"))
			{
				break;
			}
			else
			{
				//driver.findElement(By.xpath(""))
			}
		}
		
	
		

	}

}
