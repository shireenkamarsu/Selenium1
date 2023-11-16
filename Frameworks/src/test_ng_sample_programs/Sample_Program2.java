package test_ng_sample_programs;

import org.testng.annotations.Test;

public class Sample_Program2 {
	@Test(priority = -1)
	public void createUser()
	{
		System.out.println("user created successfully!!");
	}
	@Test(priority = 0)
	public void modifyUser()
	{
		System.out.println("user modified successfully!!");
	}
	@Test(priority = 1)
	public void deleteUser()
	{
		System.out.println("user deleted successfully");
	}
}
/* By default test cases will execute by alphabetical order
 * To execute test cases in custom order (Based on requirement) we have to use a method
 * called as 'priority'
 * Priority can be negative also
 * Lowest value will executed first 
 */
