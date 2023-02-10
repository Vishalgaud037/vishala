package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo4 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("file:///D:/New%20folder/Demo8.html");
		Thread.sleep(1000);

		String tag = driver.findElement(By.id("A2")).getTagName();
		System.out.println(tag);

		String url = driver.findElement(By.id("A2")).getAttribute("href");
		System.out.println(url);
		Thread.sleep(1000);

		String TEXT = driver.findElement(By.id("A2")).getText();
		System.out.println(TEXT);
		Thread.sleep(1000);


		driver.quit();

	}
}