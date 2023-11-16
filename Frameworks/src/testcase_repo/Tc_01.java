package testcase_repo;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generic_uitlities.Base_Class;
import generic_uitlities.Excel_Utilities;

@Listeners(generic_uitlities.Listeners_Implementation.class)
public class Tc_01 extends Base_Class{
	
	@Test(groups = {"smoke"}, alwaysRun = true)
	public void createTask() throws Exception {
		Excel_Utilities EUTIL =new Excel_Utilities();
		String CUSTOMERNAME = EUTIL.getDataFromExcel("Task", 2, 1);
		String CUSTDESCRIPTION = EUTIL.getDataFromExcel("Task", 2, 2);
		int RANDOMNUM =JUTIL.getRandomNumber();
		hp.performTasks();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(CUSTOMERNAME + RANDOMNUM);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(CUSTDESCRIPTION);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		System.out.println("Main task Successful!!");
	}
}
