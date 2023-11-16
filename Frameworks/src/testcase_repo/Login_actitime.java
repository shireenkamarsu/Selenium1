package testcase_repo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import generic_uitlities.Properties_Utility;

public class Login_actitime {
	public static void main(String[] args) throws Exception {
		/* reading data from properties */
		Properties_Utility PUTIL = new Properties_Utility();
		String USERNAME = PUTIL.getDataFromProperties("username");
		String PASSWORD =PUTIL.getDataFromProperties("password");
		String URL = PUTIL.getDataFromProperties("url");
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
}
