package section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProductDetails {
	public static void main(String[] args, Object p1) throws Exception {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		WebElement element =driver.findElement(By.xpath("//input[contains(@title,'Search for products')]"));
		element.sendKeys("iphone 11");
		element.submit();
		Thread.sleep(3000);
		List <WebElement> products = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List <WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		//Appraoch 1
		for(int i=0; i<products.size(); i++)
		{
			String pros = products.get(i).getText();
			String pris = prices.get(i).getText();
			System.out.println(pros+" "+pris);
		}
		
			
		driver.quit();
	}
}
