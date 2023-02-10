package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;

public class Demo1 {
	static {
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);

		WebElement errMsg = driver.findElement(By.xpath("//span[contains(text(),'Username')]"));

		String tag = errMsg.getTagName();
		System.out.println("tag:" + tag);

		String className = errMsg.getAttribute("class");
		System.out.println("className:"+className);

		String text = errMsg.getText();
		System.out.println("text:"+text);

		String fontType = errMsg.getCssValue("font-family");
		System.out.println("fontType:"+fontType);

		String font = errMsg.getCssValue("font-size");
		System.out.println("font:"+font);

		String c = errMsg.getCssValue("color");
		System.out.println("color:" + c);

		// convert color from RGBa to Hexa
		String colorInHexa = Color.fromString(c).asHex();
		System.out.println("color in Hexa:" + colorInHexa);

		driver.quit();
	}
}
