package testcase_repo_cross_browser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_uitlities.Base_Class;
import generic_uitlities.Base_Class_Cross_Browser;
import generic_uitlities.Excel_Utilities;

public class Tc_02 extends Base_Class_Cross_Browser{

	@Test(groups = {"smoke", "regression"}, alwaysRun = true)
	public void createUser() throws Exception {
		Excel_Utilities EUTIL = new Excel_Utilities();
		String FIRSTNAME = EUTIL.getDataFromExcel("NewUser", 2, 1);
		String LASTNAME = EUTIL.getDataFromExcel("NewUser", 2, 2);
		String EMAIL =EUTIL.getDataFromExcel("NewUser", 2, 3);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys(FIRSTNAME);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[3]")).sendKeys(LASTNAME);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder=\"Email\"])[3]")).sendKeys(EMAIL);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		Thread.sleep(3000);
		System.out.println("Main task Successful!!");
		driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
		Thread.sleep(3000);
	}

}
