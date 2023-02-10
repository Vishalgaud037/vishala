package day15;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TakesScreenShot {
static {
	System.setProperty("webdriver.msedge.driver","D:\\Un\\edge");
}
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver= new EdgeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	Thread.sleep(1000);
	WebElement logo=driver.findElement(By.xpath("//div[@class='atLogoImg']"));
	File srcImg=logo.getScreenshotAs(OutputType.FILE);
	
	File dstImg=new File("./Img/logo.png");
	
	FileUtils.copyFile(srcImg, dstImg);
	
	driver.get("http://www.google.com");
	
	driver.manage().window().maximize();
	
	WebElement google=driver.findElement(By.xpath("//img[@alt='Google']"));
	
	File src1Img=google.getScreenshotAs(OutputType.FILE);
	
	File dst1Img=new File("./img/google1.png");
	
	FileUtils.copyFile(src1Img, dst1Img);
	
	//driver.get("")
	//a[@href='https://timesofindia.indiatimes.com/business/india-business/covid-19-has-accelerated-demand-for-tech-contractors/articleshow/79044244.cms']
	driver.quit();
	
	
}
}
