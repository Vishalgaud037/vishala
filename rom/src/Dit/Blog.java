package Dit;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Blog {
	static 
	{
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//enter the url, load the page
		driver.manage().window().maximize();
		driver.get("https://ditaxpresso.com/#/contactus");
		//find the element 
		
		driver.findElement(By.xpath("//a[@href='https://blog.metapercept.com/']")).click();
		//click on about us
		
		Set<String> allWHS = driver.getWindowHandles();
		
		//get the current url
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
		String	title=driver.getTitle();
		System.out.println(title);
		}
		String blog=driver.getCurrentUrl();
		if(blog.contains("blog"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(3000);
		
		driver.quit();
	}}
