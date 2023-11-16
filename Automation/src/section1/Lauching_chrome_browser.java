package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lauching_chrome_browser {
	//step 1:- declare main method
	public static void main(String[] args) {
		//step 2:- setProperty method
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium files\\chromedriver.exe");
		//step 3:- create an object for chromeDriver
		ChromeDriver driver=new ChromeDriver();
		//step 4:- use get() method to access the chrome browser
		driver.get("https://www.flipkart.com/");
		driver.close();
		
	}
}
