package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("file:///D:/New%20folder/Demo8.html");
		Thread.sleep(1000);

		boolean enabled = driver.findElement(By.id("A1")).isEnabled();
		System.out.println(enabled);

		boolean enable = driver.findElement(By.id("A4")).isEnabled();
		System.out.println(enable);
		Thread.sleep(1000);

		boolean displayed = driver.findElement(By.id("A1")).isDisplayed();
		System.out.println(displayed);
		Thread.sleep(1000);

		boolean r1 = driver.findElement(By.id("A3")).isDisplayed();
		System.out.println(r1);

		driver.quit();

	}
}