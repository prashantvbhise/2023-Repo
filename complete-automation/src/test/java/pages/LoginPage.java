package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import common.BaseSeleniumPage;

public class LoginPage extends BaseSeleniumPage {
	
	@FindBy(xpath ="//input[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath ="//input[@name='password']")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnSubmit;
		
	public HomePage successfulLogin(String strUsername, String StrPassword) {
		//wait.until(ExpectedConditions.visibilityOf(userName));
		waitForElementToAppear(userName);
		userName.sendKeys(strUsername);
		passWord.sendKeys(StrPassword);
		btnSubmit.click();
		HomePage hp = new HomePage();
				return hp;
			
	}

}
