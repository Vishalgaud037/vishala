package day20;

import java.io.IOException;
import java.util.List;

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
public class Demo1 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get(
				"file:///D:/photos/test%20y/m/cyber/sele/Selenium%20Day1%20to%2030/Day19%2008-08-2022/ListBox2.html");
		WebElement listBox = driver.findElement(By.id("A3"));

		Select select = new Select(listBox);
		List<WebElement> alloption = select.getOptions();// return all options as single element
		int count = alloption.size();
		Thread.sleep(1000);

		for (int i = 0; i < count; i++) {
			select.selectByIndex(i);
			Thread.sleep(500);
		}
		Thread.sleep(1000);
		for(int i=0;i<count;i++) {
			select.deselectByIndex(i);
			Thread.sleep(500);
		}
		driver.quit();
	}
}
