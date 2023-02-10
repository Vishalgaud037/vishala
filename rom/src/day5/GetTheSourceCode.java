package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTheSourceCode {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\un\\egde");
	}

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://passport.quiestatechnologies.com/index.php");

		String code = driver.getPageSource();
		System.out.println(code);
	}
}
