package day30;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActiTIME {
	@BeforeMethod(alwaysRun = true)
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
	
	@Test(groups= {"smoke","User"})
	public void createUser()
	{
		Reporter.log("createUser",true);
	}
	
	@Test(groups= {"regression","User"})
	public void editUser()
	{
		Reporter.log("editUser",true);
	}
	
	@Test(groups= {"regression","User"})
	public void deleteUser()
	{
		Reporter.log("deleteUser",true);
	}
	
	@Test(groups= {"smoke","Customer"})
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	}
	
	@Test(groups= {"regression","Customer"})
	public void editCustomer()
	{
		Reporter.log("editCustomer",true);
	}
	
	@Test(groups= {"regression","Customer"})
	public void deleteCustomer()
	{
		Reporter.log("deleteUser",true);
	}
	
	@Test(groups= {"smoke","Product"})
	public void createProduct()
	{
		Reporter.log("createProduct",true);
	}
	
	@Test(groups= {"regression","Product"})
	public void editProduct()
	{
		Reporter.log("editProduct",true);
	}
	
	@Test(groups= {"regression","Product"})
	public void deleteProduct()
	{
		Reporter.log("deleteProduct",true);
	}
}

