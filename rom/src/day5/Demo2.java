package day5;

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
		driver.get("http://www.fb.com");

		// get html code of page and print it
		String page = driver.getPageSource();
		System.out.println(page);
		// close the browser
		driver.close();

	}
}
