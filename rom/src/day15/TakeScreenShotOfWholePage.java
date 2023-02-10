package day15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TakeScreenShotOfWholePage {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\un\\edge");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.fb.com");

		TakesScreenshot t = (TakesScreenshot) driver;
		File src1 = t.getScreenshotAs(OutputType.FILE);
		File dst1 = new File("./img/fb.png");

		FileUtils.copyFile(src1, dst1);

		driver.get("http://www.youtube.com");
		TakesScreenshot t1= (TakesScreenshot)driver;
		
		File src2=t1.getScreenshotAs(OutputType.FILE);
		
		File dst2= new File("./img/youtube.png");
		
		FileUtils.copyFile(src2, dst2);
		
		
		
		
		
	}
}
