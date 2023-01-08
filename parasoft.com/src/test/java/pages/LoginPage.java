package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BaseSeleniumPage;

public class LoginPage extends BaseSeleniumPage{
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginBtn;
	
	public void loginToParaBank(String strUsername, String strPassword) {
		
		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		loginBtn.click();
	}

}
