package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		WebElement wb =driver.findElement(By.id("rightClickBtn"));
		Actions act =new Actions(driver);
		act.doubleClick().build().perform();
		String a =driver.findElement(By.id("rightClickBtn")).getText();
		System.out.println(a);
		
	}

}
