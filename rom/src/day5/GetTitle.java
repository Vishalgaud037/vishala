package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle {
static
{
	//set the path
	System.setProperty("webdriver.msedge.driver", "D:\\un\\edge");
}
public static void main(String[] args) {
	//open the edge browser
	WebDriver driver = new EdgeDriver();
	//enter the url
	driver.get("https://passport.quiestatechnologies.com/index.php");
	//get the title
	String title=driver.getTitle();
	//print the title
	System.out.println(title);
	//check the title correct or not
	if(title.contains("Apply online Passport | Renewal Passport online -India Passport"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	//get the current url
	String url=driver.getCurrentUrl();
	if(url.contains("passport")) {
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
driver.quit();
}
}
