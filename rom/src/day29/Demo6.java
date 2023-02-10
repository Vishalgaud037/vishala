package day29;

import org.junit.AfterClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo6 {
@BeforeClass //run this before the current test class
public void openBrowser()
{
	Reporter.log("open browser",true);
}
@AfterClass 
public void closeBrowser()
{
	Reporter.log("close browser",true);
}
@BeforeMethod //run this before every test method 
public void login()
{
	Reporter.log("-login",true);
}
@AfterMethod //run this method after every test method
public void logout()
{
	Reporter.log("-logout",true);
}
@Test //run this before the current test class
public void createUser()
{
	Reporter.log("--create user",true);
}
@Test //run this before the current test class
public void deleteUser()
{
	Reporter.log("delete user",true);
}
}

