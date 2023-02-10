package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo4 {static
	{
	System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver= new EdgeDriver();
		
		//enter the url
		driver.get("file:///D:/New%20folder/Demo2.html");

		driver.findElement(By.linkText("Google")).click();
		
	//	driver.findElement(By.linkText("user")).sendKeys("a")
		goBack(driver);
		
	//	driver.findElement(By.partialLinkText("Ge")).click();
	//	goBack(driver);

		driver.findElement(By.partialLinkText("Google")).click();
		
	}
	public static void goBack(WebDriver driver) throws InterruptedException {
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	}}
