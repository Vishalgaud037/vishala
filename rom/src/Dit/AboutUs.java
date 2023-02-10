package Dit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AboutUs {
	static 
	{
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver= new EdgeDriver();
		//enter the url, load the page
		driver.manage().window().maximize();
		driver.get("https://ditaxpresso.com/#/contactus");
		//find the element 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#/about']")).click();
		//click on about us
		Thread.sleep(2000);
		//get the current url
		String current = driver.getCurrentUrl();
		//verify that user land on about us section or not
		if(current.contains("about"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(3000);
		
	}}
