package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("file:///D:/New%20folder/Demo1.html");
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		goBack(driver);

		driver.findElement(By.cssSelector("a[name=\"n1\"]")).click();
		goBack(driver);

		driver.findElement(By.cssSelector("a[class='c1']")).click();
		goBack(driver);

		driver.findElement(By.cssSelector("a[title='click me']")).click();
		goBack(driver);

		driver.findElement(By.cssSelector("a[href='http://www.google.com']")).click();

	}

	public static void goBack(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
}
