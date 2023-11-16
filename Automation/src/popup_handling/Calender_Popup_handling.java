package popup_handling;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender_Popup_handling {
	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance();
		//cal.add(Calendar.DAY_OF_YEAR, 1);
		Date d=cal.getTime();
		//System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		String modifiedDate =sdf.format(d);
		System.out.println(modifiedDate);
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(modifiedDate);
		
		
	}
}
