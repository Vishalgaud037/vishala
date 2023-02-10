package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {
	static
	{
	System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver= new EdgeDriver();
		
		//enter the url
		driver.get("file:///D:/New%20folder/Demo8.html");
		Thread.sleep(1000);
		
		driver.findElement(By.id("A1")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).sendKeys("akshara");
		Thread.sleep(1000);
		
		driver.findElement(By.id("A5")).click();
		
		Thread.sleep(1000);

		boolean r1 = driver.findElement(By.id("A5")).isSelected();
	System.out.println("r1:"+r1);
	
	driver.findElement(By.id("A6")).click();
	Thread.sleep(2000);
	
	boolean r2 = driver.findElement(By.id("A1")).isSelected();
	System.out.println(r2);
	
	driver.quit();
	
	}
}