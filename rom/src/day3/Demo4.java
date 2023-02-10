package day3;

import org.openqa.selenium.edge.EdgeDriver;

public class Demo4 {
	public static void main(String[] args) {
		//set the path
		String key="webdriver.chrome.driver";
		String value="D:\\sel\\driver";
		
		System.setProperty(key, value);
		
		// open the browser
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.gmail.com");
	// close the driver
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	}

