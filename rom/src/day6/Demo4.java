package day6;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

//write a script to open fb.com and verify that fb is displayed
public class Demo4 {
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
		}
		public static void main(String[] args) throws InterruptedException {
			//open the browser
			WebDriver driver= new EdgeDriver();
			// enter the url
			driver.get("https://demo.actitime.com/login.do");
			Thread.sleep(1000);
		
			//go to active element cursor blinking
			WebElement username = driver.switchTo().activeElement();
			
			//type bhanu
			username.sendKeys("admin");
			
			driver.quit();
		}
}