package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2 {static
	{
	System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		//1.open the browser
		WebDriver driver= new EdgeDriver();
		
		//2.enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		//3.enter the username Admin
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		//4.enter the password as admin123
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		//5.click on loginbutton
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//6.should display dashboard page
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	if(url.contains("dashboard")) {
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	//close the driver
	driver.quit();
	}}
