package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation {

	static {
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");

	}

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.automationtesting.in/Index.html");

		driver.findElement(By.id("btn2")).click();

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("vishal");

		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("aud");

		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("rishi");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vishal@gmail.com");

		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("6266626622");

		driver.findElement(By.xpath("//input[@type='radio']")).click();

		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));

		int count = checkbox.size();
		for (int i = 0; i < count; i++) {
			WebElement allcheckBox = checkbox.get(i);
			allcheckBox.click();
		}
			  WebElement listbox = driver.findElement(By.id("Skills"));
		
			Select select = new Select(listbox);

			select.selectByIndex(5);
			
			WebElement ele = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
			ele.click();
			
			
			
		}
		
	}

