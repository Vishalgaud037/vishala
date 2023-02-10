package day18;

import java.io.IOException;
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
public class Demo3 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url and load page
		driver.get("http://www.google.com");

		//driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);

		String xp = "//span[contains(text(),'selenium')]";
		List<WebElement> allAse = driver.findElements(By.xpath(xp));

		int count = allAse.size();
		System.out.println("number of auto suggestion "+count);

		for (int i=0;i<count;i++) {
			WebElement ASE = allAse.get(i);
			String text=ASE.getText();
			System.out.println(text);
		}
		Thread.sleep(1000);
	//	allAse.get(count-1).click();
	}//error
}