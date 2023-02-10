package day26;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

class LoginPage3
{
	//declartion
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
	//initialization
	 LoginPage3(WebDriver driver) {
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

public class Demo3 {
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage3 l= new LoginPage3(driver);//findelement
		
		l.setUserName("bhanu");
		l.setPassword("damager");
		l.clickLoginButton();//refresh
		Thread.sleep(2000);
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLoginButton();
		System.out.println("End");
		
				
}}
