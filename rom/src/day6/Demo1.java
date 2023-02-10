package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//write a script to open fb.com and verify that fb is displayed
public class Demo1 {
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
		}
		public static void main(String[] args) throws InterruptedException {
			//open the browser
			WebDriver driver= new EdgeDriver();
			// enter the url
			driver.get("http://www.google.com");
			Thread.sleep(1000);
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.manage().window().fullscreen();
			Thread.sleep(1000);

			driver.manage().window().minimize();
			Thread.sleep(1000);

			driver.quit();
}
}