package testcase_repo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generic_uitlities.Base_Class;
import object_repo.Home_Page;

@Listeners(generic_uitlities.Listeners_Implementation.class)
public class Tc_03 extends Base_Class{

	@Test(retryAnalyzer = generic_uitlities.RetryAnalyzer_Implementation.class, groups = {"regression"}, alwaysRun = true)
	public void performReport()
	{
	Home_Page hp = new Home_Page(driver);
	hp.performReports();
	}
}
