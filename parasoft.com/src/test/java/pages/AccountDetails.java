package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import common.BaseSeleniumPage;

public class AccountDetails extends BaseSeleniumPage{
	
	@FindBy(id="accountType")
	private WebElement accountType;
	
	@FindBy(id="accountId")
	private WebElement accountId;
	
	public void verifyAccountDetailsForNewlyOpendAccount() {
		
		Assert.assertEquals(accountId.isDisplayed(), true);
		Assert.assertEquals(accountType.isDisplayed(), true);
	}

}
