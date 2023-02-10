package day18;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * 1.select alternative check box 1 3 5 7 9
 * 2.select 1st and last check box using findelements
 * slect 1st and last check box using findelements
 * 
 */
public class Flipkart {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().getImplicitWaitTimeout();
		// enter the url and load page
		driver.get("https://www.flipkart.com");

		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		//driver.findElement(By.xpath("//input[@fdprocessedid='7du1ha']")).sendKeys("7020061597");
		
		//driver.findElement(By.xpath("//button[@fdprocessedid='7fhl8k']")).click();
		
		//input[@fdprocessedid='lqir9a']
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		

		driver.findElement(By.name("q")).sendKeys("ipad");
		Thread.sleep(2000);

		String xp = "///div[contains(text(),'iPad')]";
		List<WebElement> allAse = driver.findElements(By.xpath(xp));

		int count = allAse.size();
		System.out.println("number of auto suggestion "+count);

		for (int i=0;i<count;i++) {
			WebElement ASE = allAse.get(i);
			String text=ASE.getText();
			System.out.println(text);
			
			if(text.contains("ipad 10th generation")) {
				ASE.click();
				
			}
		}
		Thread.sleep(1000);
	//	allAse.get(count-1).click();
	}//error
}