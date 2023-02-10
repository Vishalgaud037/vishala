package day16;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		Thread.sleep(2000);

		driver.manage().window().maximize();

		String msg1 = driver.findElement(By.id("box")).getText();
		System.out.println("msg before double click:" + msg1);

		String xp = "//input[@value='Double click";
		WebElement button = driver.findElement(By.xpath(xp));

		Actions actions = new Actions(driver);
		actions.doubleClick().perform();

		String msg2 = driver.findElement(By.id("box")).getText();
		System.out.println("msg after double click" + msg2);

		driver.quit();
	}
}
