package testcase_repo;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic_uitlities.Base_Class;
import generic_uitlities.Excel_Utilities;
import object_repo.Home_Page;

@Listeners(generic_uitlities.Listeners_Implementation.class)
public class Tc_02 extends Base_Class{

	@Test(groups = {"smoke", "regression"}, alwaysRun = true)
	public void createUser() throws Exception {
		Excel_Utilities EUTIL = new Excel_Utilities();
		String FIRSTNAME = EUTIL.getDataFromExcel("NewUser", 2, 1);
		String LASTNAME = EUTIL.getDataFromExcel("NewUser", 2, 2);
		String EMAIL =EUTIL.getDataFromExcel("NewUser", 2, 3);
		Home_Page hp = new Home_Page(driver);
		hp.performUsers();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys(FIRSTNAME);
		driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[3]")).sendKeys(LASTNAME);
		driver.findElement(By.xpath("(//input[@placeholder=\"Email\"])[3]")).sendKeys(EMAIL);
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		System.out.println("Main task Successful!!");
		driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
	}

}
