package common;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.AccountsOverview;
import pages.BillPay;
import pages.FindTransactions;
import pages.LoginPage;
import pages.OpenNewAccount;
import pages.RequestLoan;
import pages.TransferFunds;
import pages.UpdateContactInfo;

public class BaseSeleniumPage {

	protected WebDriverWait wait; 

	@FindBy(xpath="//a[text()='Open New Account']")
	private WebElement openNewAccountLink;

	@FindBy(xpath="//a[text()='Accounts Overview']")
	private WebElement accountsOverviewLink;

	@FindBy(xpath="//a[text()='Transfer Funds']")
	private WebElement transferLink;

	@FindBy(xpath="//a[text()='Bill Pay']")
	private WebElement billPayLink;
	
	@FindBy(xpath="//a[text()='Find Transactions']")
	private WebElement findTransactionsLink;

	@FindBy(xpath="//a[text()='Update Contact Info']")
	private WebElement updateContactInfoLink;
	
	@FindBy(xpath="//a[text()='Request Loan']")
	private WebElement requestLoanLink;

	@FindBy(xpath="//a[text()='Log Out']")
	private WebElement logoutLink;
	
	@FindBy(xpath="//h1[text()='Accounts Overview']")
	private WebElement successfulLogon;

	public BaseSeleniumPage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
		wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(5));
	}
	public void waitForElementToAppear(WebElement abc) {

		//wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(abc));

	}
	public void waitForElementToEnable(WebElement abc) {

		//wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(abc));

	}
	public void waitForElementToDisappear(WebElement abc) {

		//WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(abc));

	}

	public OpenNewAccount goToOpenNewAccount() {

		//waitForElementToAppear(openNewAccountLink);
		openNewAccountLink.click();
		OpenNewAccount oa= new OpenNewAccount();
		return oa;		
	}
	public AccountsOverview goToAccountsOverview() {

		accountsOverviewLink.click();
		AccountsOverview ao= new AccountsOverview();
		return ao;
	}

	public TransferFunds goToTransferFund() {

		transferLink.click();
		TransferFunds tf= new TransferFunds();
		return tf;		
	}
	public BillPay goToBillPay() {

		billPayLink.click();
		BillPay bp= new BillPay();
		return bp;		
	}
	public FindTransactions goToFindTransactions() {

		findTransactionsLink.click();
		FindTransactions ft= new FindTransactions();
		return ft;		
	}
	public UpdateContactInfo goToUpdateContactInfo() {

		updateContactInfoLink.click();
		UpdateContactInfo ui= new UpdateContactInfo();
		return ui;		
	}
	public RequestLoan goToRequestLoan() {

		requestLoanLink.click();
		RequestLoan rl= new RequestLoan();
		return rl;		
	}
	public LoginPage goToLogout() {

		logoutLink.click();
		LoginPage lp= new LoginPage();
		return lp;		
	}
}


