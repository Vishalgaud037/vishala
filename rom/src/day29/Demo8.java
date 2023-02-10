package day29;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo8 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}
@Test
public void createUser() throws InterruptedException
{
	WebDriver driver = new EdgeDriver();
	driver.manage().window().setSize(new Dimension(700,700));
	driver.manage().window().setSize(new Dimension(800,10));

	driver.get("https://demo.actitime.com/login.do");
for(int i=0;i<=25;i++)
{
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(500);
	driver.findElement(By.id("username")).clear();
	Thread.sleep(500);
}
driver.quit();
}
}
