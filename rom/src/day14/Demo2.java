package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;

public class Demo2 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);

		WebElement unTB=driver.findElement(By.id("username"));
		int x1=unTB.getLocation().getX();
		System.out.println("x value of username:"+x1);
		
		WebElement pwTB=driver.findElement(By.name("pwd"));
		int x2=pwTB.getLocation().getX();
		System.out.println("x value of password"+x2);
		
		if(x1==x2)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();
	}
}
