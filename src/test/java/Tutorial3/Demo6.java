package Tutorial3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo6 {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
        driver.get("https://prafpawar11.github.io/multiplewindows.html");
		

	}

}
