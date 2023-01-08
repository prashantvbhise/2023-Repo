package test;

import org.testng.annotations.Test;

import common.BaseSelenium;
import pages.LoginPage;

public class LoginTest extends BaseSelenium {
	@Test
	public void verifySuccessfulLogin() {
		
		LoginPage lp = new LoginPage();
		lp.loginToParaBank("John", "demo");
		lp.goToOpenNewAccount();
		lp.goToAccountsOverview();		
		lp.goToTransferFund();
		lp.goToBillPay();
		lp.goToFindTransactions();
		lp.goToUpdateContactInfo();
		lp.goToRequestLoan();
		lp.goToLogout();		
	}
}
