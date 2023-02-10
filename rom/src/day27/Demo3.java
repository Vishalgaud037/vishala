package day27;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream("D:/Book1.xlsx");
Workbook wb= WorkbookFactory.create(fis);
org.apache.poi.ss.usermodel.Sheet sheet1= wb.getSheet("sheet1");
Row row0= sheet1.getRow(0);
Cell cell0=row0.getCell(0);
String value=cell0.getStringCellValue();
System.out.println(value);
wb.close();

}
}