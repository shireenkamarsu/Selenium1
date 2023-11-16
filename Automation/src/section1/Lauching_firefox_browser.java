package section1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Lauching_firefox_browser {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","D:\\Selenium files\\geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("https://www.flipkart.com");
		fd.close();
    }
}
