package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

class LoginPage
{
	//declartion
	private WebElement unTB;
	
	//initiilization
	public LoginPage(WebDriver driver) {
	unTB= driver.findElement(By.id("username"));
	}
	//utilization
	void setValue()
	{
		unTB.sendKeys("Bhanu");
	}
}
public class Demo4 {
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
	}
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l= new LoginPage(driver);
		l.setValue();
		
		driver.quit();
	}
	}
