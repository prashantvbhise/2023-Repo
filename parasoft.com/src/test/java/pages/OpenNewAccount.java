package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import common.BaseSeleniumPage;

public class OpenNewAccount extends BaseSeleniumPage{
	
	@FindBy(xpath="//select[@id='type']")
	private WebElement accountType;
	
	@FindBy(id="fromAccountId")
	private WebElement fromAccountIdDropdown;
	
	@FindBy(css="input.button")
	private WebElement openNewAccountButton;
	
	
	public AccountOpened openNewAccounts(String accountTypedropdownValue, String fromAccountIdDropdownValue) throws InterruptedException {
		waitForElementToAppear(accountType);
		Select accountTypedropdown= new Select(accountType);
		accountTypedropdown.selectByVisibleText(accountTypedropdownValue);
		waitForElementToAppear(fromAccountIdDropdown);
		Select fromAccountId= new Select(fromAccountIdDropdown);
		fromAccountId.selectByVisibleText(fromAccountIdDropdownValue);
		waitForElementToEnable(openNewAccountButton);
		openNewAccountButton.click();
		AccountOpened aop= new AccountOpened();
		return aop;
		
	}
	
	

}
