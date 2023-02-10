package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo3 {static
	{
	System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver= new EdgeDriver();
		
		//enter the url
		driver.get("file:///D:/New%20folder/Demo2.html");

		driver.findElement(By.tagName("input")).sendKeys("a");
		
		driver.findElement(By.id("a2")).sendKeys("b");
		
		driver.findElement(By.name("n2")).sendKeys("c");
		
		driver.findElement(By.className("c2")).sendKeys("d");



		
	}}
