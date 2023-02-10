package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo3 {static
	{
	System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		//1.open the browser
		WebDriver driver= new EdgeDriver();
		
		//2.enter the url
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		//3.enter the username admin
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		//4.enter the password as manager
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//5.click on loginbutton
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//6.should display dashboard page
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	if(url.contains("user")) {
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	//close the driver
	driver.quit();
	}}
