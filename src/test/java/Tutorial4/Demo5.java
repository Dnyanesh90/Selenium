package Tutorial4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement wb =driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement wb2 =driver.findElement(By.xpath("//span[text()='Copy']"));
		
		
		Actions act =new Actions(driver);
		//actions chaining method
		act.contextClick(wb).click(wb2).build().perform();
		
		Thread.sleep(4000);
		//act.click(wb2).build().perform();
		
		
		Alert alt =driver.switchTo().alert();
		Thread.sleep(4000);
		String a =alt.getText();
		System.out.println(a);
		if(a.contains("copy"))
		{
			alt.accept();
		}
		
		Thread.sleep(4000);
		driver.close();		

	}

}
