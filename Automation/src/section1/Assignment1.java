package section1;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium files\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://demo.actitime.com/login.do");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Dimension d=new Dimension(300, 100);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		driver.manage().window().setPosition(new Point(200,300));
		Thread.sleep(4000);
		String srcCode=driver.getPageSource();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(srcCode);
		Thread.sleep(4000);
		driver.close();
	}
}
