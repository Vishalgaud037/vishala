package day30;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4 {
	@Test
	public void test4()
	{
		Reporter.log("test4",true);
		Assert.fail();
	}
}


