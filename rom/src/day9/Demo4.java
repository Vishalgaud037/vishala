package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import day8.Demo2;

public class Demo4 {
	{
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
		}
		public static void main(String[] args) throws InterruptedException {
			//open the browser
			WebDriver driver= new EdgeDriver();
			
			//enter the url
			driver.get("file:///D:/New%20folder/Demo1.html");
			
			driver.findElement(By.xpath("./html/body/a")).click();

			//find element returns webelement object it has click method
			
			Demo2.goBack(driver);
			
			driver.findElement(By.xpath("/html/body/a")).click();
			
			driver.quit();
					}
		
	public static void goBack(WebDriver driver) throws InterruptedException	{
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	}}


