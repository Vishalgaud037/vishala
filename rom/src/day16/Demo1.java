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

public class Demo1 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get("https://www.actimind.com");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		
		String xp="//a[contains(text(),'AREAS OF EXPERTISE')]";
		WebElement menu=driver.findElement(By.xpath(xp));

		Actions actions= new Actions(driver);
		
		actions.moveToElement(menu).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Web Crawling")).click();
		
		driver.quit();
	}
		}

