package day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Un\\\\edge");		
	}

	
	@Test
	public void testLoginPage() 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		String actualTitle = driver.getTitle();
		Reporter.log("actualTitle:"+actualTitle,true);
		
		String expectedTitle ="actiTIME - Login";
		Reporter.log("expectedTitle:"+expectedTitle,true);
		
//		if(actualTitle.equals(expectedTitle))
//		{
//			Reporter.log("Pass:Login Page is Displayed",true);
//		}
//		else
//		{
//			Reporter.log("Fail:Login Page is not Displayed",true);
//			Assert.fail();
//		}
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
}


