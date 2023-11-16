package section1;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser_control_methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium files\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String title= driver.getTitle();
		String url= driver.getCurrentUrl();
		String srcCode= driver.getPageSource();
		System.out.println(title);
		System.out.println(url);
		System.out.println(srcCode);
		Thread.sleep(3000);
		driver.close();
	}
}
