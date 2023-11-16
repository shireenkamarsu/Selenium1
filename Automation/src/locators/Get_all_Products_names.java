package locators;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_all_Products_names {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium files\\chromedriver.exe");
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
		
		//Approach 1
		Iterator <WebElement> itr  = products.iterator();
		/*
		while(itr.hasNext())
		{
			String allPros = itr.next().getText();
			System.out.println(allPros);
		}
		*/
		
		//Approach 2 using Streams API
		//products.stream().forEach(p->System.out.println(p.getText()));
		
		//Approach 3 using Lambda Expressions
		products.forEach(p->System.out.println(p.getText()));
		
		driver.quit();
	}

}
