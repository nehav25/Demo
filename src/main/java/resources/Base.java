package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	public WebDriver initializeDriver() throws Exception
	
	{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Project\\src\\main\\java\\resources\\Data.properties");
		
		prop.load(fis);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		if(browser.equals("chrome"))
		{
			//driver=new FirefoxDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			//
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

}
