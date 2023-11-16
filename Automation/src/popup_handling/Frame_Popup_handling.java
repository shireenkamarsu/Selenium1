package popup_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame_Popup_handling {
	public static void main(String[] args) {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		String msg = driver.findElement(By.xpath("//h2[text()='Interface Alert']")).getText();
		System.out.println(msg);
		driver.quit();
		
	}
}