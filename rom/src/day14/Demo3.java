package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;

public class Demo3 {
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
		int y1=unTB.getLocation().getY();
		System.out.println("y1 value of username:"+y1);
		
		int h1=unTB.getSize().getHeight();
		System.out.println("h1 height value of username:"+h1);
		
		WebElement pwTB=driver.findElement(By.name("pwd"));
		int y2=pwTB.getLocation().getY();
		System.out.println("y2 height value of password"+y2);
		
	int g1=5;
	int g2=10;
	
	int min=y1+h1+g1;
	System.out.println("min:"+min);
		
	int max=y1+h1+g2;
	System.out.println("max:"+max);
	
	if(y2>y1+h1+g1 && y2<y1+h1+g2)
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
