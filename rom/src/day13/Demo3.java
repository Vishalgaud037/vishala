package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo3 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("file:///D:/New%20folder/Demo8.html");
		Thread.sleep(1000);

		driver.findElement(By.id("A7")).click();

		// driver.findElement(By.id("A8")).submit();
		Thread.sleep(2000);
		driver.quit();

	}
}