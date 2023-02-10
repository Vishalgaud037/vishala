package passport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TakeScreenShot {
	static {
		System.setProperty("webdriver.msedge.driver", "D\\Un\\edge");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://passport.quiestatechnologies.com/new-passport.php");
		driver.manage().window().fullscreen();

		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);

		File dst = new File("./img/passport.png");

		FileUtils.copyFile(src, dst);

	}
}
