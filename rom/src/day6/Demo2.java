package day6;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//write a script to open fb.com and verify that fb is displayed
public class Demo2 {
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
		
			//get the current size(width & height in pixels)
			Dimension currentSize = driver.manage().window().getSize();
		System.out.println(currentSize);
		
		//set the size(resize the browser)
		Dimension newSize= new Dimension(400, 400);
		driver.manage().window().setSize(newSize);
		//get the current location of the browser (x & y)
		Point currentPosition = driver.manage().window().getPosition();
		System.out.println(currentPosition);
		
		//set the location of browser(move the browser)
		int x=500,y=100;
		for(int i=1;i<=5;i++) {
			Point newPosition = new Point(x,y);
			driver.manage().window().setPosition(newPosition);
			
			x=x+100;
			y=y+100;
			Thread.sleep(1000);
		}
		driver.quit();
		}
}