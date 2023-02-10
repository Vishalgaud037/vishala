package day22;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * 1.select alternative check box 1 3 5 7 9
 * 2.select 1st and last check box using findelements
 * slect 1st and last check box using findelements
 * 
 */
//home work select oct 15th
public class Demo6 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();
		driver.get(
				"file:///D:/photos/test%20y/m/cyber/sele/Selenium%20Day1%20to%2030/Day21%2010-08-2022/PopUpDemo.html");

		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);

		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String windowHandle:allWindowHandles)
		{
			driver.switchTo().window(windowHandle);
			String title=driver.getTitle();
			try {
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pune");
				System.out.println("textbox found in:"+driver.getTitle());
			} catch (Exception e) {
System.out.println("text box not found in:"+driver.getTitle());;
			}
	}}
}