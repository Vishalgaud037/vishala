package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2 {static
	{
	System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver= new EdgeDriver();
		
		//enter the url
		driver.get("file:///D:/New%20folder/Demo1.html");
		
		driver.findElement(By.tagName("a")).click();

		//find element returns web-element object it has click method
		
		Demo2.goBack(driver);
		
		driver.findElement(By.id("a1")).click();
		
		Demo2.goBack(driver);
		
		driver.findElement(By.name("n1")).click();

		Demo2.goBack(driver);
		driver.findElement(By.className("c1")).click();

		driver.quit();
	
	}
public static void goBack(WebDriver driver) throws InterruptedException	{
Thread.sleep(1000);
driver.navigate().back();

Thread.sleep(1000);
}}
