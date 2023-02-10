package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

// write a script to open fb.com and that fb page is displayed
public class Demo1 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new EdgeDriver();
		// enter the url
		driver.get("http://www.fb.com");

		// get the title and print it
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Facebook ")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		String current = driver.getCurrentUrl();
		System.out.println(current);
		if (current.contains("facebook")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		driver.close();

	}
}
