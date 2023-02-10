package day3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1 {
	public static void main(String[] args) {   
	RemoteWebDriver r;
	TakesScreenshot t;
	JavascriptExecutor j;
	WebDriver w;
	SearchContext s;
		//set the path                         
		String key="webdriver.msedge.driver";  
		String value="D:\\Un\\edge";        
		                                       
		System.setProperty(key, value);        
		                                       
		// open the browser                    
		EdgeDriver driver=new EdgeDriver();    
		driver.get("http://www.fb.com");  
		String title=driver.getTitle();
		System.out.println(title);
	// close the driver                        
		driver.close();                         
	}                                          
}
