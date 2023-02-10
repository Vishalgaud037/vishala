package Dit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EmailSubscribe {
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
		//find the element and send valid email id
		Thread.sleep(2000);
		driver.findElement(By.name("EMAIL")).sendKeys("vishalgaud037@gmail.com");
		//click on subscribe button
		driver.findElement(By.name("subscribe")).click();
		Thread.sleep(2000);
		//get the current url
		
				
}}