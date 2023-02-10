package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		// enter the user-name Admin
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		// enter the password as admin123
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		// click on login-button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		// should display dash-board page
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("dashboard")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		// close the driver
		driver.quit();
	}
}
