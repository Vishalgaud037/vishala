package day15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);

//take screenshot of elememt

		String xp = "//img[@alt='company-branding']";
		WebElement logo = driver.findElement(By.xpath(xp));
		// create new inage abd copy and paste screenshot
		File srcImg = logo.getScreenshotAs(OutputType.FILE);
		File dstImg = new File("./img/logo.png");
		FileUtils.copyFile(srcImg, dstImg);
		
		

		driver.quit();
	}
}