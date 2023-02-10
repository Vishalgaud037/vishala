package day30;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {

	@Test(priority = 2)
	public void registerUser()
	{
		Reporter.log("registerUser",true);
//		Assert.fail();
	}
	
	@Test(priority=1,dependsOnMethods = "registerUser")// run delete use only if registerUser is passed
	public void deleteUser()
	{
		Reporter.log("deleteUser",true);	
//		Assert.fail();
	}
}

