package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {static
	{
	System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver= new EdgeDriver();
		
		//enter the url
		driver.get("file:///D:/New%20folder/Demo1.html");
		driver.findElement(By.id("a1")).click();
		
}}
