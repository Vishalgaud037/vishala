package day15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);

		// find the element
		WebElement UnTB = driver.findElement(By.id("username"));
//take screenshot of elememt

		File srcIng = UnTB.getScreenshotAs(OutputType.FILE);

		// create new inage abd copy and paste screenshot
		File dstImg = new File("./img/un.png");
		FileUtils.copyFile(srcIng, dstImg);

		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement google = driver.findElement(By.xpath("//img[@alt='Google']"));
		File src = google.getScreenshotAs(OutputType.FILE);

		File dst = new File("./img/google.png");
		FileUtils.copyFile(src, dst);
		
		driver.quit();
	}
}