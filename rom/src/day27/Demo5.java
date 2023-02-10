package day27;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo5 {
	static
	{
		System.setProperty("webdriver.msedge.driver", "D:\\Un\\edge");
	}
public static void main(String[] args) throws EncryptedDocumentException, IOException {
//open the excel file
	Workbook wb= WorkbookFactory.create(new FileInputStream("D:/TestData.xlsx"));
	
	String un=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
	String pw=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
	wb.close();
	
	WebDriver driver= new EdgeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pw);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	
}
}