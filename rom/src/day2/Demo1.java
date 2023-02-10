package day2;

import org.openqa.selenium.edge.EdgeDriver;
/*in selenium to automate browser we have methods
 * ex
 * methods are availble under edge-driver class which can be used
 * to perform action on edge browser
 * 
 * all the methods are non static
 * 
 * how to call non static method?
 * by creating object
 * 
 * how to static method
 * using class name
 * 
 * how to create object of class 'A"?
 * a.method();
 * 
 * if any ckass is not present in current package we should import it
 * 
 * Note: if we create object of edgedriver class it woll open the edgebrowser
 * (there is no method to open the browser)
 * 
 * IllegalstateException -path to driver executable must be set
 * 
 * it means don't know where is driver exe file
 * 
 * we should specify path of the exe using system.setproperty method
 * 
 */
public class Demo1 {
public static void main(String[] args) {
	//set the path
	String key="webdriver.msedge.driver";
	String value="D:\\Un\\edge";
	
	System.setProperty(key, value);
	
	// open the browser
	EdgeDriver driver=new EdgeDriver();
	driver.get("http://www.visa.com");
// close the driver
	driver.quit();
}
}
