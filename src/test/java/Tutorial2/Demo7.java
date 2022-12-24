package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement wb1 =driver.findElement(By.id("day"));
		WebElement wb2 =driver.findElement(By.name("birthday_month"));
		WebElement wb3 =driver.findElement(By.id("year"));
		
		Select sel1 =new Select (wb1);
		Select sel2 =new Select (wb2);
		Select sel3 =new Select (wb3);
		
		sel1.selectByValue("2");
		sel2.selectByVisibleText("Jul");
		sel3.selectByValue("1990"); 
		
		WebElement abc =sel1.getFirstSelectedOption();
		WebElement pqr =sel2.getFirstSelectedOption();
		WebElement xyz =sel3.getFirstSelectedOption();
		
		String a =abc.getText();
		String b =pqr.getText();
		String c =xyz.getText();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
