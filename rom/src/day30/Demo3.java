package day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo3 {
	static {
		System.setProperty("webdriver.msedge.driver", ".D:\\\\\\\\Un\\\\\\\\edge");		
	}
	
	WebDriver driver;
	
	@BeforeMethod
	public void openApp(){
		driver=new EdgeDriver();
	}
	
	@Test
	public void testLoginPage() {
		Reporter.log("Start of testLoginPage",true);
		
		driver.get("https://www.google.com");
		
		String actualTitle = driver.getTitle();
		Reporter.log("actualTitle:"+actualTitle,true);
		
		String expectedTitle ="Boogle";
		Reporter.log("expectedTitle:"+expectedTitle,true);
		
		
		SoftAssert softAssert2 = new SoftAssert();
		softAssert2.assertEquals(actualTitle, expectedTitle);// 1. compare & 2. report
		
		Reporter.log("End of testLoginPage",true);//if above assert fails, this will be skipped
	
		//softAssert2.assertAll();
	}
	
	@AfterMethod
	public void closeApp(){
		driver.quit();
	}
}

