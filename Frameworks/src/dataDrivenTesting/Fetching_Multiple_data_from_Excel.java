package dataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetching_Multiple_data_from_Excel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\Selenium files\\DataEntry2.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh =book.getSheet("Sheet2");
		DataFormatter format = new DataFormatter();
		int num = sh.getLastRowNum();
		
		for(int i=1; i<=num; i++)
		{
			Row r = sh.getRow(i);
			
			for(int j=1; j<=r.getLastCellNum(); j++)
			{
				String allData = format.formatCellValue(r.getCell(j));
				System.out.println(allData);
			}
		}
	}
}
