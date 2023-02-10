package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ActiveElement {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new EdgeDriver();
		// enter the url
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("vishal");
		Thread.sleep(2000);
		driver.quit();
	}
}
