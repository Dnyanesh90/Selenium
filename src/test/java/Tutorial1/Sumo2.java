package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sumo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kadam\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		driver.findElement(By.name("firstname")).sendKeys("DNYANESHWAR");
		driver.findElement(By.name("lastname")).sendKeys("KADAM");
		driver.findElement(By.name("reg_email__")).sendKeys("8425092160");
		driver.findElement(By.id("password_step_input")).sendKeys("7507847874");
		
		
		Thread.sleep(5000);
		
		WebElement wb =driver.findElement(By.id("day"));
		WebElement wc =driver.findElement(By.id("month"));
		WebElement wd =driver.findElement(By.id("year"));
		
		Thread.sleep(5000);
		
		Select sel =new Select(wb);
		Select sel1 =new Select(wc);
		Select sel2 =new Select(wd);
		
		sel.selectByValue("2");
		sel1.selectByValue("7");
		sel2.selectByValue("1990");
		
		WebElement abc =sel.getFirstSelectedOption();
		WebElement pqr =sel1.getFirstSelectedOption();
		WebElement xyz =sel2.getFirstSelectedOption();
		
		String a =abc.getText();
		String b =pqr.getText();
		String c =xyz.getText();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='_58mt'and text()='Male']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("websubmit")).click();
		
		//driver.close();

	}

}
