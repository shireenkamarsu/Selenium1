package test_ng_sample_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_Program4 {
	@Test(priority = 1)
	public void createUser()
	{
		System.out.println("user created successfully!!");
	}
	@Test(priority = 2, dependsOnMethods = "createUser")
	public void modifyUser()
	{
		System.out.println("user modified successfully!!");
		Reporter.log("this method depends on createUser");
	}
	@Test(priority = 3)
	public void deleteUser()
	{
		System.out.println("user deleted successfully!!");
	}
	@Test(priority = 4, dependsOnMethods = "deleteUser")
	public void reCreateUser()
	{
		System.out.println("user recreated successfully!!");
		Reporter.log("this method depends on deleteUser");
	}
}
