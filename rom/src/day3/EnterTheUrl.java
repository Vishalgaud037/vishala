package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EnterTheUrl {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");

	}

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.fb.com");

		String Title = driver.getTitle();
		System.out.println(Title);
		driver.quit();
	}
}
