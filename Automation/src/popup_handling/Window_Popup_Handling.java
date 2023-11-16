package popup_handling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window_Popup_Handling {
	public static void main(String[] args) {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element =driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("iphone 11");
		element.submit();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).click();
		
		String parentId=driver.getWindowHandle();
		Set <String> childIds=driver.getWindowHandles();
		
		/*	Approach 1
		for(String allIds : childIds)
		{
			if(!allIds.equals(parentId))
			driver.switchTo().window(allIds);
		}  */
		
		//Approach 2
		Iterator <String> itr=childIds.iterator();
		/*
		while(itr.hasNext())
		{
			String allids=itr.next();
			String ids=driver.switchTo().window(allids).getTitle();
			if(ids.contains(parentId))
			{
				break;
			}
		}
		*/
		
		//Approach 3
		childIds.stream().filter(c->!c.equals(parentId)).forEach(c->driver.switchTo().window(c));
		
		String productName =driver.findElement(By.xpath("//span[text()='APPLE iPhone 11 (White, 128 GB)']")).getText();
		System.out.println(productName);
		
		driver.quit();
	}
}
