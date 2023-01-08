package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferFunds {
	
	@FindBy(id="amount")
	private WebElement amountField;

	@FindBy(xpath="//input[@value='Transfer']")
	private WebElement transferbtn;

	@FindBy(xpath="//h1[text()='Transfer Complete!']")
	private WebElement successMessageCondition;

	@FindBy(id="fromAccountId")
	private WebElement fromAccountIdDropdown;

	@FindBy(id="toAccountId")
	private WebElement toAccountIdDropdown;

	@FindBy(id="amount.errors")
	private WebElement errorMessage;

}
