package passport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://passport.quiestatechnologies.com/index.php");

		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Passport")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		WebElement scrnshot = driver.findElement(By.xpath("//h2[text()='Online Passport Private Consultancy']"));

		File srcImg = scrnshot.getScreenshotAs(OutputType.FILE);

		File dstImg = new File("./img/online.png");
		FileUtils.copyFile(srcImg, dstImg);
		
		WebElement shot=driver.findElement(By.xpath("//img[@src='swaksh-bharat1.png']"));
		File src=shot.getScreenshotAs(OutputType.FILE);
		
		File dst=new File("./img/glass.png");
		
		FileUtils.copyFile(src, dst);
		
		driver.quit();
	}
}
