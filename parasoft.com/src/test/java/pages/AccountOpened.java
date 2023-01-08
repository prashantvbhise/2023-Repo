package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BaseSeleniumPage;

public class AccountOpened extends BaseSeleniumPage{
	
	@FindBy(xpath="//h1[text()='Account Opened!']")
	private WebElement accountOpenedHeading;
	
	@FindBy(xpath="//p[contains(text(),'Congratulations, your account is now open.')]")
	private WebElement accountOpenSuccessMsg;
	
	@FindBy(id="newAccountId")
	private WebElement newAccountId;
	
	public AccountDetails verifyAccountOpeningConfirmation() throws InterruptedException {
		System.out.println("verifyAccountOpeningConfirmation");
		Thread.sleep(3000);
		accountOpenedHeading.isDisplayed();
		accountOpenSuccessMsg.isDisplayed();
		System.out.println(accountOpenedHeading.getText() +" "+accountOpenSuccessMsg.getText()+ " "+newAccountId.getText());
		newAccountId.click();
		AccountDetails ad= new AccountDetails();
		return ad;	
	}
	
	public String captureAccountId() {

		return newAccountId.getText();
		
		
	}
}
