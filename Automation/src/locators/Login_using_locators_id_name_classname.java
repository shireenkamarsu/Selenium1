package locators;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_using_locators_id_name_classname {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium files\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://demo.actitime.com/login.do");
		WebElement element=driver.findElement(By.id("username"));
		element.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement element1=driver.findElement(By.className("initial"));
		element1.click();
		driver.close();
	}
}
