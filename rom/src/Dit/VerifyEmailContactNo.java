package Dit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyEmailContactNo {
static 
{
	System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
}
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver= new EdgeDriver();
	//enter the url, load the page
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://ditaxpresso.com/#/contactus");
	
	driver.findElement(By.name("First Name")).sendKeys("Ran");

	driver.findElement(By.name("Last Name")).sendKeys("Nandudkar");

	driver.findElement(By.name("Phone")).sendKeys("5083784779");

	driver.findElement(By.name("Email")).sendKeys("ak@gmail.com");

	driver.findElement(By.name("Title")).sendKeys("Java");

	driver.findElement(By.name("Description")).sendKeys("Ram is good man");

	driver.findElement(By.id("formsubmit")).click();
}
}
