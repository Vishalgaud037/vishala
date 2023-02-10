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

public class Demo4 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		Thread.sleep(2000);

		driver.manage().window().maximize();

		WebElement block1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement block3 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(block1, block3).perform();

		driver.quit();
	}
}
