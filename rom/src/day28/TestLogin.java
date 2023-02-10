package day28;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestLogin {
	static
	
	{
		System.setProperty("webdriver.msedge.driver", "D:\\\\Un\\\\edge");
	}

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String un = Excel.getData("./data/TestData.xlsx", "ValidLogin", 1, 0);
		String pw = Excel.getData("./data/TestData.xlsx", "ValidLogin", 1, 1);

		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername(un);
		loginPage.setPassword(pw);
		loginPage.clickLoginButton();

	}
}