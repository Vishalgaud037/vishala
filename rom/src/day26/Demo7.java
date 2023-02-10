package day26;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*What is POM?
 * -> one of the JAVA Design pattern , we used to handle SERE
 * 
 * How do create a POM class?
 * 1. in POM class we declare element using @FindBy
 * 2. initialize using PF.initElements
 * 3. utilize it using get/set methods
 * 
 * 
 */

class MyPage
{
	//declartion
@FindBy(name="q")	
private WebElement searchBox;
	//initialization
void setSeachBox(String string)	{
	searchBox.sendKeys(string);
}
}
//utilization}
	 
public class Demo7 {
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		MyPage g= new MyPage();
		g.setSeachBox("selenium");
				
}}
