package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo5 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("https://www.google.com");
		Thread.sleep(1000);
//find the logo element using xpath
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Google']"));

		String text = driver.findElement(By.xpath("//img[@alt='Google']")).getText();
		System.out.println("text:" + text);
		// get the tag of the logo element using getTagName
		String tag = logo.getTagName();

		// check if the tag is img or not
		if (tag.equals("img")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		driver.quit();

	}
}