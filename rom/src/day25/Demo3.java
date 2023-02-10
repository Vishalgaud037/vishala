package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo3 {
static
{
	System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
}
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.actitime.com/login.do");
//driver.findElement(By.id("username")).sendKeys("Bhanu");

//WebElement unTB = driver.findElement(By.id("username"));
//unTB.sendKeys("Bhanu");
WebElement unTB;//declartion//
unTB=driver.findElement(By.id("username"));//initial
unTB.sendKeys("Bhanu");//utilization

}
}
