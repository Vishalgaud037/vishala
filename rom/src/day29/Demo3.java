package day29;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void test3()
	{
		System.out.println("my test1 in console only");//print in console
	
	Reporter.log("my test3 in html only");//print in html
	Reporter.log("my test3 in only html",false);//print in html

	Reporter.log("my test3 in both html & console",true);//print in html

	}
	

}
