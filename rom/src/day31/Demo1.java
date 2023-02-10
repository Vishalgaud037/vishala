package day31;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	@Test
	public void testA() {
		Reporter.log("test A",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}

}
