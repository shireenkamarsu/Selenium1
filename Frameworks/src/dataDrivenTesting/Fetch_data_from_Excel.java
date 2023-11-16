package dataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data_from_Excel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\Selenium files\\DataEntry.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		/*
		Row r = sh.getRow(1);
		Cell c = r.getCell(1);
		
		String value = c.getStringCellValue();
		System.out.println(value);
		*/
		
		// optimized way
		String value = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(value); 
	}
}
