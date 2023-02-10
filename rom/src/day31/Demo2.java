package day31;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
class B
{
	@BeforeMethod
public void login()
{
	Reporter.log("login",true);
}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
}
		
public class Demo2 extends B {
	 
	
	@Test
	public void testB() {
		Reporter.log("test B",true);
	}
	

}
