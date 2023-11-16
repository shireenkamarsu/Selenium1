package dataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SpecialCase_fetch_data_from_Excel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\Selenium files\\DataEntry.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		DataFormatter df = new DataFormatter();
		
		String value = df.formatCellValue(sh.getRow(0).getCell(4));
		System.out.println(value);
	}
}
