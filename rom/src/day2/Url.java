package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Url {
static
{
	System.setProperty("webdriver.msedge.driver", "D:\\un\\edge");
}
public static void main(String[] args) {
	WebDriver driver= new EdgeDriver();
	driver.get("http://www.google.com");
driver.quit();

}
}
