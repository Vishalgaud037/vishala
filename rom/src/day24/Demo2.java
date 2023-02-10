package day24;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the browser
		WebDriver driver = new EdgeDriver();
		Duration ito = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(ito);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ito=driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(ito);
	
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String title = driver.getTitle();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("div[.='Login ']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Enter"));//waiting condition
	
		String title2=driver.getTitle();
		System.out.println(title2);
		
		//wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		
		
	}
	
}
