package generic_uitlities;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author shireen
 *
 */
public class Properties_Utility {
	/**
	 * 
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public String getDataFromProperties (String data) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\Selenium files\\ActitimeCredentials.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		
		return pobj.getProperty(data);
	}
}
