package day26;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

class LoginPage
{
	//declartion
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
	//initialization
	 LoginPage(WebDriver driver) {
	unTB=driver.findElement(By.id("username"));
	pwTB=driver.findElement(By.name("pwd"));
	loginBTN= driver.findElement(By.xpath("//div[.='Login ']"));
	
	}
//utilization
	 void setUserName(String un)
		 {
			 unTB.sendKeys(un);
		 }
	 void setPassword(String pw)
	 {
		 pwTB.sendKeys(pw);
	 }
	 void clickLoginButton() {
		 loginBTN.click();
	 }
	 }

public class Demo1 {
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
	}
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage l= new LoginPage(driver);
		
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLoginButton();
		
				
}}
