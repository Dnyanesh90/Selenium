package Tutorial1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sumo4 {

	private static WebElement xyz;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kadam\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.demo.guru99.com/test/newtours/register.php");
		
		WebElement wb=driver.findElement(By.name("country"));
		
		Select sel =new Select(wb);
		
		sel.selectByVisibleText("INDIA");
		String a=sel.getFirstSelectedOption().getText();
		
		if(a.equals("INDIA"))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		List<WebElement> ls =sel.getOptions();
		
		System.out.println(ls.size());
		
		for (WebElement xyz:ls);
		{
			System.out.println(xyz.getText());
		}
		

	}

}
