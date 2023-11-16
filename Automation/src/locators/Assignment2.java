package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium files\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//input[contains(@title,'Search for products')]"));
		element.sendKeys("iphone 11");
		Thread.sleep(3000);
		element.submit();
		Thread.sleep(4000);
		WebElement pName=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']"));
		String name=pName.getText();
		System.out.println(name);
		Thread.sleep(3000);
		WebElement allResults=driver.findElement(By.xpath("//span[@class=\"_10Ermr\"]"));
		String resDetails=allResults.getText();
		System.out.println(resDetails);
		driver.close();
		
		
		
	}
}
