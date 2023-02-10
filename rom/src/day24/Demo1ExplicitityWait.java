package day24;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1ExplicitityWait {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();
		System.out.println("this is:"+driver.getTitle());

		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println("title is :"+driver.getTitle());//actitime login
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		System.out.println("title is:"+driver.getTitle());

		wait.until(ExpectedConditions.titleContains("Enter"));
		System.out.println("title is"+driver.getTitle());//actiTIME -Enter Time
		
		driver.findElement(By.id("logoutLink")).click();
				wait.until(ExpectedConditions.titleContains("Login"));
				System.out.println("Title is "+driver.getTitle());//actiTIME- Login

	}
	
}
