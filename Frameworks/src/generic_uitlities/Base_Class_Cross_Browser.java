package generic_uitlities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Base_Class_Cross_Browser {
	public WebDriver driver = null;
	public Properties_Utility PUTIL = new Properties_Utility();
	public Java_Utility JUTIL = new Java_Utility();
	public ChromeOptions option = new ChromeOptions();
	
	@BeforeSuite(alwaysRun = true)
	public void establishDbConnection()
	{
		System.out.println("Db Connection Successful");
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void lauchBrowser(String browser) throws Exception
	{
		String URL = PUTIL.getDataFromProperties("url");
		if(browser.equalsIgnoreCase("chrome"))
		{
		option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.get(URL);
		System.out.println("chrome browser launched successfully");
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.get(URL);
			Thread.sleep(3000);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@BeforeMethod(alwaysRun = true)
	public void loginToApp() throws Exception
	{
		String USERNAME = PUTIL.getDataFromProperties("username");
		String PASSWORD = PUTIL.getDataFromProperties("password");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(USERNAME);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PASSWORD);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		System.out.println("Login Successful");
		Thread.sleep(3000);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutFromApp() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a [text()='Logout']")).click();
		Thread.sleep(3000);
		System.out.println("Logout Successful");
	}
	@AfterClass(alwaysRun = true)
	public void closeWindow() throws Exception
	{
		Thread.sleep(3000);
		driver.close();
		System.out.println("Driver closed Successfully");
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeDbConnection()
	{
		System.out.println("Db connection closed Successfully");
	}
}
