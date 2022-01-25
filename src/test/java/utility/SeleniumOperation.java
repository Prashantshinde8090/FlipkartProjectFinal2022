package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class SeleniumOperation
{

	public static ConfigReader config= null;

	 public static WebDriver driver= null;
	 
	 
	 public static Hashtable<String,Object> outputParameter=new Hashtable<String,Object>();
	 
	public static Hashtable<String,Object> browserLaunch(Object[] inputParameter)          //BrowseLaunch
	{
		try {
		String strBrowserName= (String) inputParameter[0];
		
	config=new ConfigReader();
	
	if (strBrowserName.equalsIgnoreCase("Chrome"))
	
	{
		System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	}
	 
	else if (strBrowserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	}
	
	outputParameter.put("STATUS", "PASS");
	outputParameter.put("MESSAGE", "Methodused:browserLaunch, Input_Data :" + inputParameter[0].toString());
	
	}catch(Exception e)
	{
		outputParameter.put("STATUS", "FAIL");
		outputParameter.put("MESSAGE", "Methodused:browserLaunch, Input_Data :" + inputParameter[0].toString());
	}
		return outputParameter;
	}
	
	public static Hashtable<String,Object> openapplication ()                                         //open application
	{
		try {
		
		driver.get(config.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		
		outputParameter.put("STATUS", "PASS");
		outputParameter.put("MESSAGE", "Methodused:openapplication, Input_Data :" + config.getApplicationUrl().toString());
		
	}catch(Exception e)
		{
		outputParameter.put("STATUS", "FAIL");
		outputParameter.put("MESSAGE", "Methodused:openapplication, Input_Data :" + config.getApplicationUrl().toString());
		}
		return outputParameter;
	}
	public static Hashtable<String,Object> clickonelement (Object[] inputParameter)        //click on close button
	{
		try {
	
	    String xpath= (String) inputParameter[0];
	    driver.findElement(By.xpath(xpath)).click();
	    driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	
	    outputParameter.put("STATUS", "PASS");
	    outputParameter.put("MESSAGE", "Methodused:clickonelement, Input_Data :" + inputParameter[0].toString());
	
	}
	catch(Exception e)
		{
		outputParameter.put("STATUS", "FAIL");
		outputParameter.put("MESSAGE", "Methodused:clickonelement, Input_Data :" + inputParameter[0].toString());
		}
		return outputParameter;
	}
	
	public static Hashtable<String,Object> movetoelement (Object[] inputParameter)     //move to login & click on my profile
	{
		
	   try {
		String xpath= (String) inputParameter[0];
		Actions act= new Actions (driver);
		WebElement element = driver.findElement(By.xpath(xpath));
		act.moveToElement(element).build().perform();
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		
		 outputParameter.put("STATUS", "PASS");
		 outputParameter.put("MESSAGE", "Methodused:movetoelement, Input_Data :" + inputParameter[0].toString());
		
	}catch(Exception e)
	   {
		outputParameter.put("STATUS", "FAIL");
		outputParameter.put("MESSAGE", "Methodused:movetoelement, Input_Data :" + inputParameter[0].toString());
	   }
	   return outputParameter;
	}
	
	public static Hashtable<String,Object> sendkeys (Object[] inputParameter)	      //enter user name and password
	{
		try {
		String xpath=  (String) inputParameter[0];
		String xpath1= (String) inputParameter[1];
	    WebElement pass=driver.findElement(By.xpath(xpath));
		
	    pass.sendKeys(xpath1);
	    driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	    
	    outputParameter.put("STATUS", "PASS");
	    outputParameter.put("MESSAGE", "Methodused:sendkeys, Input_Data :" + inputParameter[1].toString());
	    
		}catch(Exception e)
		{
		outputParameter.put("STATUS", "FAIL");
		outputParameter.put("MESSAGE", "Methodused:sendkeys, Input_Data :" + inputParameter[1].toString());	
		}
		return outputParameter;
	}
	public static Hashtable<String,Object> gettext(Object[] inputparameter)
	{
		try {
		String xpath= (String) inputparameter[0];
		WebElement obj=driver.findElement(By.xpath(xpath));
		String hello=obj.getText();
		
		String text= (String) inputparameter[1];
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		
		if(hello.equalsIgnoreCase(text))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");	
		}
		
		 outputParameter.put("STATUS", "PASS");
		 outputParameter.put("MESSAGE", "Methodused:gettext, Input_Data :" + inputparameter[1].toString());
		
		}catch(Exception e)
		{
		 outputParameter.put("STATUS", "FAIL");
		 outputParameter.put("MESSAGE", "Methodused:gettext, Input_Data :" + inputparameter[1].toString());	
		}
		return outputParameter;
	}
}
		


