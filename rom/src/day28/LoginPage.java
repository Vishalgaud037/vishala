package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class St
public class LoginPage {
@FindBy(id="username")
private WebElement unTB;

@FindBy(name="pwd")
private WebElement pwTB;

@FindBy(xpath="//div[.='Login ']")
private WebElement loginBTN;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setUsername(String un)
{
	unTB.sendKeys(un);
}
public void setPassword(String pw) {
	pwTB.sendKeys(pw);
}
public void clickLoginButton()
{
loginBTN.click();	
}
}
