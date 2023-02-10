package day28;
//test class(Automation test script)
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//utility class-helper class
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getData(String path, String sheet, int r, int c)
			throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String value = wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
		wb.close();
		return value;

	}
}
