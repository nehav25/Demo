package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	By username=By.id("user_email");
	By password=By.id("user_password");
	By lgnbtn=By.xpath(".//*[@id='new_user']/div[3]/input");
	
	//adding a comment
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
		
		public WebElement username()
		{
			return driver.findElement(username);
		}
		
		public WebElement password()
		{
			return driver.findElement(password);
		}
		
		public WebElement loginbutton()
		{
			return driver.findElement(lgnbtn);
		}
		
		
	}



