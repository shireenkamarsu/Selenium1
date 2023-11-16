package generic_uitlities;

import java.util.Random;

/**
 * 
 * @author shireen
 *
 */
public class Java_Utility {
	/**
	 * this method is a generic method to get random number
	 * @return
	 */
	public int getRandomNumber()
	{
		Random r =new Random();
		int num = r.nextInt(10000);
		
		return num;
	}
}
