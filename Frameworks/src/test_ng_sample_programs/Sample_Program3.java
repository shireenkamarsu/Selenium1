package test_ng_sample_programs;

import org.testng.annotations.Test;

public class Sample_Program3 {
	@Test(invocationCount = 10)
	public void createUser()
	{
		System.out.println("user created successfully!!");
	}
}
