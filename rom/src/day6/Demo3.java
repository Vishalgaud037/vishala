package day6;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

//write a script to open fb.com and verify that fb is displayed
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
			Thread.sleep(1000);
		
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("http://www.gmail.com");
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			Point newPosition= new Point(900,10);
			driver.manage().window().setPosition(newPosition);
			driver.get("http://www.fb.com");
			
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("http://www.ilovepdf.com");
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("http://www.microsoft.com");
			
			Thread.sleep(1000);
			
			driver.quit();
		}
}