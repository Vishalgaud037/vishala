package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import day8.Demo2;

public class Demo1 {
	{
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
		}
		public static void main(String[] args) throws InterruptedException {
			//open the browser
			WebDriver driver= new EdgeDriver();
			
			//enter the url
			driver.get("file:///D:/New%20folder/Demo3.html");
			
			driver.findElement(By.xpath("/html/body/input")).sendKeys("a");
			
			driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("b");

			driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("c");
Thread.sleep(1000);
		driver.quit();
	
	}}


