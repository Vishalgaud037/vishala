package day27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class GooglePage
{

	@FindBy(name="q")
	private WebElement searchBox;
	
	
	void setValue(String value)
	{
		searchBox.sendKeys(value);
	}
	
}
public class Demo1 
{
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");		
	}
	
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.google.com");
		GooglePage g=new GooglePage();
		PageFactory.initElements(driver,g);//2nd arg name of Ref var of POM class object
		g.setValue("selenium vs");
		
	}
}

