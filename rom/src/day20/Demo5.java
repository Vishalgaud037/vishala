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
public class Demo5 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// enter the url and load page
		driver.get("https://eprocure.gov.in/eprocure/app");
		Thread.sleep(1000);
		
		driver.findElement(By.id("PageLink_9")). click();
		Thread.sleep(1000);

		driver.findElement(By.id("DirectLink_13")).click();
		
		//write the code to check if the file is download or not
		//File f= new File("")
		//f.exists();
		
	}
}
