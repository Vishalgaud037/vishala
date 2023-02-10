package day17;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get("file:///D:/photos/test%20y/m/cyber/sele/Selenium%20Day1%20to%2030/Day17%2005-08-2022%20Frame/Demo9.html");

		List<WebElement> e2 = driver.findElements(By.tagName("input"));
		
		for(WebElement v:e2)
		{
			v.sendKeys("hi");
		}
	int count=e2.size();
	System.out.println(count);
	
	WebElement textBox=e2.get(0);//get 1st 
	textBox.sendKeys("bhanu");
	
	WebElement textbox1 = e2.get(1);//get the 2nd
	textbox1.sendKeys("prakash");
	Thread.sleep(1000);
	try {
		WebElement textbox2= e2.get(2);//get the 3 rd --indexout of Bound exception
		textbox2.sendKeys("hk");
	} catch (Exception e) {
String msg=e.getMessage();
System.out.println("hi here is the problem");
e.printStackTrace();
	}
	driver.quit();
	
	}}