package object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * this POM class for HOME_PAGE
 * @author shireen
 *
 */
public class Home_Page {
	
	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement clickTasks;
	
	@FindBy(xpath = "//div[@id='containerreports']")
	private WebElement clickReports;
	
	@FindBy(xpath = "//div[@id='container_users']") 
	private WebElement clickUsers;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement clickLogout;


	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickTasks() {
		return clickTasks;
	}

	public WebElement getClickReports() {
		return clickReports;
	}

	public WebElement getClickUsers() {
		return clickUsers;
	}

	public WebElement getClickLogout() {
		return clickLogout;
	}
	
	/**
	 * business library for tasks
	 */
	public void performTasks()
	{
	   getClickTasks().click();
	}
	
	/**
	 * business library for reports
	 */
	
	public void performReports()
	{
		getClickReports().click();
	}
	
	/**
	 * business library for users
	 */
	public void performUsers()
	{
		getClickUsers().click();
	}
	
	/**
	 * business library for logout
	 */
	public void performLogout()
	{
		getClickLogout().click();
	}
	
}
