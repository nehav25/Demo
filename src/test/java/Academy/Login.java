package Academy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.Base;
import resources.LandingPage;
import resources.LoginPage;

public class Login extends Base {

	@Test(dataProvider="getData")
	public void loginpage(String username,String password) throws Exception
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage lp=new LandingPage(driver);
		lp.getLogin().click();
		
		//object for login page and access login details
		LoginPage lp1=new LoginPage(driver);
		lp1.username().sendKeys("abc");
		lp1.password().sendKeys("ahdgf");
		lp1.loginbutton().click();
		//System.out.println(text);
		
	}
	
	//if there are multiple input values to be used for login
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="ftfdft";
		data[0][1]="ahdgf";
		//data[0][2]="afhggf";
		
		data[1][0]="ugygrf";
		data[1][1]="jrgf";
		
		return data;
		
	}
}
