package day19;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
/*
 * 1.select alternative check box 1 3 5 7 9
 * 2.select 1st and last check box using findelements
 * slect 1st and last check box using findelements
 * 
 */
public class Demo1 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get("file:///D:/photos/test%20y/m/cyber/sele/Selenium%20Day1%20to%2030/Day18%2006-08-2022/Demo10.html");
		
		//select 1st check box-//input[@type='checkbox']
		String xp="(//input[@type='checbox'])[1]";
		driver.findElement(By.xpath(xp)).click();
		
		String xp2="(//input[@type='checkbox'])[last()]";
		driver.findElement(By.xpath(xp2)).click();
	
	}}
