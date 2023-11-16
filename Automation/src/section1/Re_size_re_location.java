package section1;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Re_size_re_location {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium files\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*to perform re-size operations*/
//driver.manage().window.setSize(new Dimension(100, 300)); //1st approach
		Dimension d=new Dimension(100, 300);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		/*to perform re-location operation*/
		Point p=new Point(200, 300);
		driver.manage().window().setPosition(p);
		driver.close();
	}
}
