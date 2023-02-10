package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*what is upcasting ?
 * converting child class object to parent type
 * 
 * 2.give example
 * WebDriver driver= new ChromeDriver()
 * 
 * 3.Have u used up-casting in selenium,why?
 * yes, so that same script works on any browser
 * it save time,memory, effort
 * 
 */
class Bhanu
{
	public static void testscript(EdgeDriver driver)
	{
		driver.get("http://www.ilovepdf.com");//enter the url
	String title = driver.getTitle();//get the title
	System.out.println(title);//print the url
	driver.quit();
	}}
public class Student {
static {
	System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
}public static void main(String[] args) {
	EdgeDriver driver= new EdgeDriver();
	Bhanu.testscript(driver);
}}
