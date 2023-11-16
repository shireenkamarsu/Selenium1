package test_ng_sample_programs;

import org.testng.annotations.Test;
//@Test we can provide here but not recommended
public class Sample_Program1 {
	@Test
	public void createUser()
	{
		System.out.println("user created successfully!!");
	}
	@Test
	public void modifyUser()
	{
		System.out.println("user modified successfully!!");
	}
	@Test
	public void deleteUser()
	{
		System.out.println("user deleted successfully");
	}
}
/*  @Test annotation is mandatory 
 *  if we don't give @Test if will not consider as a test case
 *  and it will not be a part of execution
 *  we will provide @Test annotation in method level
 *  we can provide in class level also but it is not a recommended choice
 *  because in real time some methods will be present in a class which are not test cases
 *  but if we give @Test in class level those methods will also consider as Test cases 
 */