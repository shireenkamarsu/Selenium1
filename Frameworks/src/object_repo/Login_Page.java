package object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This POM class is for LOGIN_PAGE
 * @author shireen 
 *
 */
public class Login_Page {
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passWord;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;

	public Login_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	/**
	 * business library for Login page
	 * @param username
	 * @param password
	 * @return 
	 */
	public void loginOperation(String username, String password)
	{
		getUserName().sendKeys(username);
		getPassWord().sendKeys(password);
		getLoginButton().click();
	}
	
	
	
}
