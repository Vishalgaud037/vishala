package day26;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * in page object model we declare the element using @FindBy(Find By annotation)
 *syntax
 *@finby(locator="value")
 *private WebElement elementName
 *
 *using priivate is not mandatory
 *
 *in POM we initialize using PageFactory.initElements, for which we send 2 arg
 * 1. driver (browser)
 * 2. POM class object (this
 *
 */

class LoginPage4
{
	//declartion
@FindBy(id="username")	
private WebElement unTB;

@FindBy(name="pwd")	
private WebElement pwTB;

@FindBy(xpath="//div[.='Login ']")	
private WebElement loginBTN;


	//initialization
	 LoginPage4(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 
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

public class Demo5 {
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage4 l= new LoginPage4(driver);//findelement
		
		l.setUserName("bhanu");
		l.setPassword("damager");
		l.clickLoginButton();//refresh
		Thread.sleep(2000);
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLoginButton();
		System.out.println("End");
		
				
}}
