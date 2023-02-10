package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MinMaxFull {
static
{
	System.setProperty("webdriver.msedge.driver", "D:\\un\\edge");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new EdgeDriver();
	driver.get("https://passport.quiestatechnologies.com/index.php");
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.manage().window().fullscreen();
	Thread.sleep(1000);

	driver.manage().window().minimize();
	Thread.sleep(1000);

	driver.manage().window().maximize();
	Thread.sleep(1000);

	driver.quit();
}


}
