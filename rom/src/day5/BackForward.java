package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BackForward {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\un\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.fb.com");
		Thread.sleep(1000);
		driver.get("http://www.gmail.com");
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().forward();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().forward();
		Thread.sleep(1000);

		driver.quit();
	}
}
