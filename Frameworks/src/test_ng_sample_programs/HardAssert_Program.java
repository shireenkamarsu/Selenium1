package test_ng_sample_programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert_Program {
	
	@Test
	public void hardAssertStrictComparison()
	{
		String actual = "maharaja";
		String expected = "raja";
		Assert.assertEquals(actual, expected);
		System.out.println("assertion pass");
		
	}
	
	@Test
	public void hardAssertContainsComparison()
	{
		String actual = "maharaja";
		String expected = "raja";
		Assert.assertTrue(actual.contains(expected));
		System.out.println("assertion pass contains");
	}
}
