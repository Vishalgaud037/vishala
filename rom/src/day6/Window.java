package day6;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Window {
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
		}
		public static void main(String[] args) throws InterruptedException {
			//open the browser
			WebDriver driver= new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://www.google.com");
			driver.switchTo().activeElement().sendKeys("VISHAL");

			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("http://www.gmail.com");
			
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("http://www.youtube.com");
			
			driver.switchTo().activeElement().sendKeys("VISHAL");
			
			driver.quit();
		
		}
}
