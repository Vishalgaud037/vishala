package day15;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get("https://passport.quiestatechnologies.com/new-passport.php#");
		Thread.sleep(2000);
		
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("alert('hi vishal ')");
		
		Thread.sleep(5000);
		
	//	driver.switchTo().newWindow(WindowType.TAB);
		
	//	driver.get("https://www.gmail.com");
	//	Thread.sleep(2000);
		
		//JavascriptExecutor j1=(JavascriptExecutor) driver;
		//j1.executeScript("alert('hello vishal')");
		
		//Thread.sleep(2000);
		
		driver.quit();
		
	}
}