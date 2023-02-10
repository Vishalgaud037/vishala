package day18;

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
public class Demo2 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get("http://www.google.com");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count = allLinks.size();
		System.out.println("link count"+count);
		
		for(int i=0;i<count;i++)
		{
			WebElement link = allLinks.get(i);
			String text=link.getText();
			System.out.println(text+":text");
		
		boolean disp = link.isDisplayed();
		System.out.println(disp);
		}
		driver.quit();
		}}