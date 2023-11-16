package generic_uitlities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author shireen
 *
 */
public class Excel_Utilities {
	/**\
	 * this method is a generic method to fetch data from excel
	 * @param sheetName
	 * @param rowNum
	 * @param colNum
	 * @return
	 * @throws Exception
	 */
	public String getDataFromExcel(String sheetName, int rowNum, int colNum) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium files\\DataEntry2.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		
		String value = df.formatCellValue(sh.getRow(rowNum).getCell(colNum));
		return value;
	}
}
