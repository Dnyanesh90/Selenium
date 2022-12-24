package Tutorial5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingActionClass {
	
	
	public static int convertToInteger(String s)
	{
		
		char[]abc=s.toCharArray();
		String b="";
		for(int i=0;i<abc.length;i++)
		{
			if(Character.isDigit(abc[i]))
			{
				b=b+abc[i];
			}
		}
		
		int amount=Integer.parseInt(b);
		return amount;
		
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
         WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));	
	WebElement wb=driver.findElement(By.xpath("//div[text()='Electronics']"));
	
	
		Actions act=new Actions(driver);
		act.moveToElement(wb).build().perform();
		WebElement wb1=driver.findElement(By.xpath("//a[contains(text(),'Laptop and')]"));
		act.moveToElement(wb1).build().perform();
		WebElement wb2=driver.findElement(By.xpath("(//a[text()='Laptops'])[1]"));	
		act.click(wb2).build().perform();
		WebElement wb3=driver.findElement(By.linkText("ASUS Vivobook Pro 15 Ryzen 7 Octa Core AMD R7-4800H - (16 GB/512 ..."));
		act.click(wb3).build().perform();
		Set<String>ls=driver.getWindowHandles();
		Iterator<String>ite=ls.iterator();
		ite.next();
		String child=ite.next();
		driver.switchTo().window(child);
		
		String s=driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		System.out.println("Price of Product is:"+s);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		System.out.println("Added in cart");
		
		Thread.sleep(3000);
		
		WebElement p=driver.findElement(By.xpath("//input[@class='_253qQJ']"));
	   String m=p.getAttribute("value");
	   System.out.println(m);
	   Thread.sleep(3000);
		WebElement q=driver.findElement(By.xpath("(//button[@class='_23FHuj'])[2]"));//ADD button Quqntity
		
		while(true)
		{
			if(m.equals("5"))
			{
				break;
			}
			else
			{
				act.click(q).build().perform();
				m=p.getAttribute("value");
			
			}
		
		}
	
	String totalprice=driver.findElement(By.xpath("//div[@class='_24KATy']//following::span")).getText();//total price
	String discountprice=driver.findElement(By.xpath("//div[@class='1YVZr']")).getText();//discount price
	String totalamount=driver.findElement(By.xpath("((//div[@class='_24KATy'])[4]//following::span)[1]")).getText();

	int tp=UsingActionClass.convertToInteger(totalprice);
	int dp=UsingActionClass.convertToInteger(discountprice);
	int ta=UsingActionClass.convertToInteger(totalamount);
	
	int fi=tp-dp;
	if(fi==ta)
	{
		System.out.println("Test case pass");
	}
	else
	{
		System.out.println("Test case fail");
	}
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File f1=ts.getScreenshotAs(OutputType.FILE);
	File dist=new File("C:\\Users\\kadam\\eclipse-workspace1\\Selenium\\Selenium\\Screenshot\\flipcart.png");
	FileUtils.copyFile(f1, dist);
	}

}

