package Tutorial6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/test/newtours/register.php");
		WebElement wb =driver.findElement(By.name("country"));
		Select sel =new Select(wb);
		sel.selectByVisibleText("INDIA");
		WebElement abc =sel.getFirstSelectedOption();
		String a =abc.getText();
		System.out.println(a);

	}

}
