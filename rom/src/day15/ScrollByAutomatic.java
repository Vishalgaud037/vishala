package day15;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollByAutomatic {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get("https://passport.quiestatechnologies.com/reissue-passport.php");
		Thread.sleep(2000);

	int y = driver.findElement(By.xpath("//button[@type='submit']")).getLocation().getY();
	JavascriptExecutor j= (JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(0,"+y+")");
	
	
}
}