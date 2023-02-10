package day29;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo5 {
@DataProvider
public Object[]getUserNames()
{
	Object[]user=new Object[3];
	user[0]="arjun";
	user[1]=123;
	user[2]=true;
	return user;
	
}
@Test(dataProvider="getUserNames")//get the data from data provider method
public void createUser(Object name)
{
	Reporter.log("Create User:"+name,true);
}
/*
 * for(String name:user)
 * 
 */
}
