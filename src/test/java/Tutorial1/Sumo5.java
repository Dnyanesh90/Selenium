package Tutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sumo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kadam\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		WebElement wb =driver.findElement(By.id("month"));
		
		Select sel =new Select(wb);
		
		List<WebElement> ls =sel.getOptions();
		
		int a= ls.size();
		//System.out.println(a);
		
		for (int i=0;i<a;i++)
		{
			String b=ls.get(i).getText();
			//System.out.println(b);
			
			if(b.equals("Jul"))
			{
				System.out.println("Test case is pass");
			}
		}

	}

}
