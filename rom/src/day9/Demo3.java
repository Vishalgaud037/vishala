package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import day8.Demo2;

public class Demo3 {
	{
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
		}
		public static void main(String[] args) throws InterruptedException {
			//open the browser
			WebDriver driver= new EdgeDriver();
			
			//enter the url
			driver.get("file:///D:/New%20folder/Demo1.html");
			
			driver.findElement(By.cssSelector("a[id='a1']")).click();

			//find element returns webelement object it has click method
			
			Demo2.goBack(driver);
			
			driver.findElement(By.cssSelector("a#a1")).click();
			
			Demo2.goBack(driver);
			//tag name can be anything but id should be a1
			driver.findElement(By.cssSelector("#a1")).click();

			Demo2.goBack(driver);
			driver.findElement(By.cssSelector("a[class='c1']")).click();

			Demo2.goBack(driver);
			driver.findElement(By.cssSelector("a.c1")).click();
			
			Demo2.goBack(driver);
			//tag name can be anything but class should be c1
			driver.findElement(By.cssSelector(".c1")).click();
			
			driver.quit();
		
		}
	public static void goBack(WebDriver driver) throws InterruptedException	{
	Thread.sleep(1000);
	driver.navigate().back();

	Thread.sleep(1000);
	}}


