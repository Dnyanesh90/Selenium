package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kadam\\eclipse-workspace\\chromedriver.exe");
		
		
        WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("onward_cal")).click();
				
		while(true)
		{
			String b =driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			System.out.println(b);//Nov 2022  Dec 2022  Jan 2023 Feb 2023 Mar 2023 Apr 2023 May 2023
			
			if(b.equals("May 2023"))
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//td[@class='next']")).click();//Next Button	
			}
		}
		
		driver.findElement(By.xpath("//td[text()='10']")).click();

	}

}
