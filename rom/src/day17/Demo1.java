package day17;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get("file:///D:/photos/test%20y/m/cyber/sele/Selenium%20Day1%20to%2030/Day17%2005-08-2022/sample1.html");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.switchTo().frame(0);// go to inside 1st frame
		Thread.sleep(2000);

		driver.findElement(By.id("t2")).sendKeys("a");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		driver.findElement(By.id("t1")).sendKeys("a");
		Thread.sleep(2000);

		driver.switchTo().frame("f1");
		Thread.sleep(2000);

		driver.findElement(By.id("t2")).sendKeys("b");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		driver.findElement(By.id("t1")).sendKeys("b");

		WebElement frameElement = driver.findElement(By.id("f1"));
		driver.switchTo().frame(frameElement);

		driver.findElement(By.id("t2")).sendKeys("c");
		Thread.sleep(2000);

		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("c");

		driver.quit();
	}
}
