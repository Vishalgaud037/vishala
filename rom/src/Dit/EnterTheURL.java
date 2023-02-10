package Dit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EnterTheURL {
static 
{
	System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
}
public static void main(String[] args) {
	//open the browser
	WebDriver driver= new EdgeDriver();
	//enter the url, load the page
	driver.get("https://ditaxpresso.com/#/contactus");
	//close the browser
	driver.quit();
}
}
