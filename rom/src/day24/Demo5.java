package day24;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo5 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}
//write a script to verify wheather page is loaded or not within 55sec
	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();
		Duration v=driver.manage().timeouts().getPageLoadTimeout();

		driver.manage().timeouts().getScriptTimeout();
		System.out.println(v);//5m
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	Duration v2=driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(v2);
		try
		{
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("page is loaded within 5 sec");		
				
			} catch (Exception e) {
				System.out.println("page is not loaded within 5 sec");
			}
			
				
			}
		
	}
	

