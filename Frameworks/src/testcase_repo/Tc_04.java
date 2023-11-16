package testcase_repo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import generic_uitlities.Properties_Utility;

public class Tc_04 {
	public static void main(String[] args) throws Exception {
		
		Properties_Utility putil = new Properties_Utility();
		String USERNAME = putil.getDataFromProperties("username");
		String PASSWORD = putil.getDataFromProperties("password");
		String URL = putil.getDataFromProperties("url");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
		driver.findElement(By.xpath("//span[text()='New Report']")).click();
		driver.findElement(By.xpath("//div[text()='Invoice Export']")).click();
		driver.findElement(By.xpath("//div[text()='Configure Report Parameters']")).click();
		driver.findElement(By.xpath("//span[text()='Create Invoice on Detailed Preview']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
}
