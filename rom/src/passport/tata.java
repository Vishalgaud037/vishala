package passport;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class tata {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.tatamotors.com/");
		driver.manage().window().fullscreen();

	WebElement takesc = driver.findElement(By.xpath("//a[@class='cd-logo']"));
	File src=takesc.getScreenshotAs(OutputType.FILE);
	File dstImg=new File("./img/tata.png");
	
	FileUtils.copyFile(src, dstImg);
	
	driver.quit();
	
	
	
	
	}}
