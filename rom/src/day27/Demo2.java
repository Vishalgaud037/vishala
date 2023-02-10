package day27;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class MyGooglePage
{
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	
	public MyGooglePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void printLinkCount()
	{
		int count=allLinks.size();
		System.out.println(count);
		
	}
	public void printAllLinks()
	{
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
	}
}
public class Demo2 {static
	{
	System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");		
}

public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("http://www.google.com");
	MyGooglePage googlePage=new MyGooglePage(driver);
	googlePage.printAllLinks();
	googlePage.printLinkCount();
	driver.quit();
	

}}
