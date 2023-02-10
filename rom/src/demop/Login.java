package demop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
	static
	{
		System.setProperty("webdriver.msedge.driver","D:\\\\Un\\\\edge");
	}
public static void main(String[] args) {
	//open the browser
	WebDriver driver= new EdgeDriver();
	//enter the url
	driver.get("https://acensoft.com/bbtours/enquiry.php");
	driver.manage().window().maximize();
	//enter the first name
	
	driver.findElement(By.id("lname")).sendKeys("vishal");
	//enter the number
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9533784779");
	//enter the email
	driver.findElement(By.id("email")).sendKeys("vishal@gmail.com");
	
	driver.findElement(By.id("date")).sendKeys("02022022");
	
	

}
}
