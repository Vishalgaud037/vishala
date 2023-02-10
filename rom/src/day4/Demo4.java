package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*
 * have u used static block in selenium?
 * yes
 * 
 * why?
 * to set the path of driver executable
 */
public class Demo4 {
static {
	System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
}
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver= new EdgeDriver();
	
	driver.get("http://www.gmail.com");

	Thread.sleep(2000);

	driver.get("http://www.fb.com");
	
	
}
}
