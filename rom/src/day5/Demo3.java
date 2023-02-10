package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo3 {
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
		}
		public static void main(String[] args) throws InterruptedException {
			//open the browser
			WebDriver driver= new EdgeDriver();
			// enter the url
			driver.get("http://www.google.com");
			Thread.sleep(3000);
			
			driver.get("http://www.fb.com");
			Thread.sleep(3000);

			driver.navigate().back();
			Thread.sleep(3000);

			driver.navigate().forward();
			Thread.sleep(3000);

			driver.navigate().refresh();
			Thread.sleep(3000);

			driver.quit();
			
}}
