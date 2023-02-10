package day26;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//what is meaning of staleElementReference exception?
/*it means address of the element is old or expired
 * 
 * when do we get staleelement exception?
 * after finding the element 
 * before performing the action on that element
 * if pages is refreshed then we get staleElementReferenceException
 * 
 * how to u handle staleElemenet ReferenceException
 *using page object model(pom) java design pattern
 * 
 */


public class Demo4 {
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement unTB = driver.findElement(By.name("username"));
		driver.navigate().refresh();
		unTB.sendKeys("admin");
		
}}
