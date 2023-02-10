package day5;

import org.openqa.selenium.edge.EdgeDriver;

public class GetTitlee {
static
{
	System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
}
public static void main(String[] args) {
	EdgeDriver driver= new EdgeDriver();
	driver.get("https://passport.quiestatechnologies.com/index.php");
	String actualtext="Apply online Passport | Renewal Passport online -India Passport";
	String exptext	=driver.getTitle();
	if(actualtext.equals(exptext)) {
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	
	driver.quit();
}

}
