package generic_uitlities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import object_repo.Home_Page;
import object_repo.Login_Page;

public class Base_Class {
	public static WebDriver driver = null;
	public Properties_Utility PUTIL = new Properties_Utility();
	public Java_Utility JUTIL = new Java_Utility();
	public Home_Page hp;
    
	
	@BeforeSuite(alwaysRun = true)
	public void establishDbConnection()
	{
		System.out.println("Db Connection Successful");
	}
	
	@BeforeClass(alwaysRun = true)
	public void lauchBrowser() throws Exception
	{
		String URL = PUTIL.getDataFromProperties("url");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println("Driver launched Successfully");
	}

	@BeforeMethod(alwaysRun = true)
	public void loginToApp() throws Exception
	{
		String USERNAME = PUTIL.getDataFromProperties("username");
		String PASSWORD = PUTIL.getDataFromProperties("password");
		Login_Page lp = new Login_Page(driver);
		lp.loginOperation(USERNAME, PASSWORD);
		System.out.println("Login Successful");
		hp = new Home_Page(driver);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutFromApp()
	{
		hp.performLogout();
		System.out.println("Logout Successful");
	}
	@AfterClass(alwaysRun = true)
	public void closeWindow()
	{
		driver.close();
		System.out.println("Driver closed Successfully");
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeDbConnection()
	{
		System.out.println("Db connection closed Successfully");
	}
}
