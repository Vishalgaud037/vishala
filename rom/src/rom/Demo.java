package rom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\sel\\driver");

WebDriver driver= new EdgeDriver();

	driver.get("http://www.google.com");
	Thread.sleep(1000);
	driver.quit();
	
}
}
