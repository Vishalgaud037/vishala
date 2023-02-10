package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle {
static
{
	System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
}
public static void main(String[] args) {
	WebDriver driver= new EdgeDriver();
	driver.get("http://www.fb.com");
	String actualtitle = "Facebook � log in or sign up";
	String exptitle=driver.getTitle();
	if(actualtitle.equals(exptitle)
			)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
}
