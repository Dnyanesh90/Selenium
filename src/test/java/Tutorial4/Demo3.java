package Tutorial4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/buttons");
		WebElement wb =driver.findElement(By.id("JYza9"));	
		Actions act =new Actions(driver);
		act.doubleClick().build().perform();
		String a =driver.findElement(By.id("JYza9")).getText();
		System.out.println(a);

	}

}
