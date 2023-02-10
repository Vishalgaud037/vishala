package day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * give an ex for method overloading in selenium
* to method
* ex--to(String url)
* to(URL url)
 *
 *how do u enter url in selenium without using get method
 *using driver.navigate().to(arg);
 *
 *arg can be string or url
 */

public class Demo4 {
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
		}
		public static void main(String[] args) throws InterruptedException, MalformedURLException {
			//open the browser
			WebDriver driver= new EdgeDriver();
			// enter the url without using driver.get
			driver.navigate().to("http://www.google.com");
			Thread.sleep(3000);
			
			URL url= new URL("http://www.gf.com");

			driver.navigate().to(url);
			Thread.sleep(2000);
			driver.quit();
			
}}
