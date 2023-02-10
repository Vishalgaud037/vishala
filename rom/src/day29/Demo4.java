package day29;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
	
	@Test(priority= -1)	
	public void registerUser() {
		Reporter.log("registerUser",true);
	}
	@Test	
	public void editUser() {
		Reporter.log("editUser",true);
	}
	@Test(priority= 1)	
	public void deleteUser() {
		Reporter.log("deleteUser",true);
	}
}
