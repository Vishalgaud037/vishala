package day6;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class NewWindowTab {
static {
	System.setProperty("webdriver.msedge.driver", "D\\un\\edge");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new EdgeDriver();
	driver.get("http:\\www.fb.com");
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("http://www.google.com");

	Thread.sleep(1000);
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("http://www.gmail.com");

	Thread.sleep(1000);
	
	driver.quit();
}
}
