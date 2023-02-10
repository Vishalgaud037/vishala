package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EnterTheURL {
static {
	System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	
}
public static void main(String[] args) {
	WebDriver driver= new EdgeDriver();
	driver.get("http://www.gf.com");
}
}

