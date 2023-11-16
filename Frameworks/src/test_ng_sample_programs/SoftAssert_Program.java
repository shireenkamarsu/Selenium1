package test_ng_sample_programs;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Program {
	
	@Test
	public void softAssertStrictComparison()
	{
		String actual = "maharaja";
		String expected = "abcd";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		System.out.println("soft assertion strict pass");
		sa.assertAll();
	}
	
	@Test
	public void softAssertionContainsComparison()
	{
		String actual =  "maharaja";
		String expected = "raja";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actual.contains(expected));
		System.out.println("soft assertion contains pass");
		sa.assertAll();
	}

}
