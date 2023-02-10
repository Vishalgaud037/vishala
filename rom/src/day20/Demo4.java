package day20;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
public class Demo4 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get(
				"file:///D:/photos/test%20y/m/cyber/sele/Selenium%20Day1%20to%2030/Day20%2009-08-2022/PopUpDemo.html");
		WebElement listBox = driver.findElement(By.id("A3"));
		Thread.sleep(1000);
	
		//driver.findElement(By.id("A2")).sendKeys("./data/myCv.docx");
		
		//driver.findElement(By.id("A2")).sendKeys("/rom/data/myCv.docx");
		
		File f= new File("./data/myCv.docx");
		String absolutePath = f.getAbsolutePath();
driver.findElement(By.id("A2")).sendKeys(absolutePath);
	}}
