package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		//WebElement abc =driver.findElement(By.partialLinkText("Already have an account?"));
		
		String xyz =driver.findElement(By.id("facebook")).getText();
		//String x =abc.getText();
		//String a =driver.getCurrentUrl();
		//String b =driver.getTitle();
		//String c =driver.getPageSource();
		
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(x);
		System.out.println(xyz);
		Thread.sleep(2000);
		driver.close();

	}

}
