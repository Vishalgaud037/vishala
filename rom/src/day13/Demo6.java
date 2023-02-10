package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo6 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);

		// find the link
		WebElement link = driver.findElement(By.id("toPasswordRecoveryPageLink"));

		String actualText = link.getText();
		System.out.println(actualText);

		String expectedText = "Forgot your password?";
		System.out.println(expectedText);

//compare actual res with exp 
		if (actualText.equals(expectedText)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		driver.quit();

	}
}