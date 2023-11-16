package popup_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hidden_Division_Popup_handling {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		
		driver.findElement(By.xpath("(//div[@class=\"checkbox inactive\"])[1]")).click();
		
		driver.findElement(By.xpath("//div[@class=\"delete button\"]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		String hiddenMsg =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'You are about to delete ')]"))).getText();
		
		System.out.println(hiddenMsg);
		
		//driver.quit();
	}
}
