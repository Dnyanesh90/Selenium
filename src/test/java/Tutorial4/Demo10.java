package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders%3Flink%3Dhome_orders");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7507847874");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dk9762349605");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(2000);
        WebElement wb =driver.findElement(By.xpath("(//div[@class='_1mkliO'])[6]"));
		
		WebElement homefurnishings=driver.findElement(By.xpath("//a[text()='Home Furnishings']"));
		Thread.sleep(5000);
		
		Actions act =new Actions(driver);
		act.moveToElement(wb).click(homefurnishings).build().perform();
		Thread.sleep(5000);
		WebElement bedlines=driver.findElement(By.xpath("//a[text()='Bed Linens']']"));
		
		act.click(bedlines).build().perform();
		

	}

}
