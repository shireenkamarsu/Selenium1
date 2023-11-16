package testcase_repo_cross_browser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_uitlities.Base_Class;
import generic_uitlities.Base_Class_Cross_Browser;
import generic_uitlities.Excel_Utilities;

public class Tc_01 extends Base_Class_Cross_Browser {
	
	@Test(groups = {"smoke"}, alwaysRun = true)
	public void createTask() throws Exception {
		Excel_Utilities EUTIL =new Excel_Utilities();
		String CUSTOMERNAME = EUTIL.getDataFromExcel("Task", 2, 1);
		String CUSTDESCRIPTION = EUTIL.getDataFromExcel("Task", 2, 2);
		int RANDOMNUM =JUTIL.getRandomNumber();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(CUSTOMERNAME + RANDOMNUM);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(CUSTDESCRIPTION);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(3000);
		System.out.println("Main task Successful!!");
	}
}
