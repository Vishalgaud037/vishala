package day15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo5 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get("https://www.actimind.com");
		Thread.sleep(2000);

//take screenshot of elememt
		JavascriptExecutor j = (JavascriptExecutor) driver;
		for (int i = 1; i <= 10; i++) {
			j.executeScript("window.scrollBy(0,250)");// scroll down
			Thread.sleep(500);
		}
		for (int i = 1; i <= 10; i++) {
			j.executeScript("window.scrollBy(0,-250)");// scroll up
			Thread.sleep(500);
		}
		driver.quit();

	}
}
