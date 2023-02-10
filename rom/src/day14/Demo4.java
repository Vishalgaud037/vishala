package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;

public class Demo4 {
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
	//int x=unTB.getLocation().getX();
	//	int y=unTB.getLocation().getY();
		
	//int	h=unTB.getSize().getHeight();
	//	System.out.println(h);
		
	//	int w= unTB.getSize().getWidth();
		
		int x=unTB.getRect().getX();
		int y=unTB.getRect().getY();
		int h=unTB.getRect().getHeight();
		int w=unTB.getRect().getWidth();
		
System.out.println(w);	

driver.quit();
	}
	}
