package day27;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo4 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
//open the excel file
	Workbook wb= WorkbookFactory.create(new FileInputStream("D:/Book1.xlsx"));

	//goto sheet1>goto 1st row > goto 1st cell> get value in string format
String v=	wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
	//print the value
	System.out.println(v);
	
	//close the file
	wb.close();
	
}
}