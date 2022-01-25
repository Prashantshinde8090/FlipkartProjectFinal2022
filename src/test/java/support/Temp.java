package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Temp 
{

	public static void main(String[]args)
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Automation Support\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();           
	
	driver.get("https://www.flipkart.com/");                                    //openApplication
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();       //click on cancel
	
	Actions search= new Actions(driver);
	
	WebElement ab= driver.findElement(By.xpath("//*[@class='_1_3w1N']"));    //click on login
	
	search.moveToElement(ab).build().perform();
	
	WebElement ab1= driver.findElement(By.xpath("//*[text()='My Profile']"));  //click on my profile
	
	search.click(ab1).build().perform();		
	
	driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("7350578090"); //Enter email
	
	driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Pass@123"); //Enter password
	
	driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();    //click on login
	
	}
	
}
	
	
	
	
	
	
		
	






