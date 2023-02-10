package day15;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollBy {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();
	
		driver.get("https://passport.quiestatechnologies.com/new-passport.php#");
		Thread.sleep(1000);
		
		JavascriptExecutor j= (JavascriptExecutor)driver;
		for(int i=1;i<30;i++) {
			j.executeScript("window.scrollBy(0,250)");
			Thread.sleep(1000);
			
		}
		
		for(int i=1;i<30;i++) {
			j.executeScript("window.scrollBy(0,-250)");
			Thread.sleep(1000);
	}
		driver.quit();
}}
