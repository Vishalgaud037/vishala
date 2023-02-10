package day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EnterURLNot {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\un\\egde");
	}

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("http://www.gmaila.com");
		
		Thread.sleep(1000);
	
		URL url= new URL("http://www.fb.com");
		driver.navigate().to(url);
		
		driver.quit();
		
		
		

}}
