package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.BaseSelenium;
import common.ITestListenerImpl;
import pages.LoginPage;

@Listeners(ITestListenerImpl.class)
public class LoginTest extends BaseSelenium{

	@Test
	public void LoginToOrangeHRM() {

		LoginPage lp= new LoginPage();
		lp.successfulLogin("admin", "admin123")
		.verifyWelcomeText();	
		
	}

	@Test
	public void VerifyClickingOnQuickLinks() {

		LoginPage lp= new LoginPage();
		lp.successfulLogin("admin", "admin123")
		.verifyWelcomeText()
		.verifyClickingOnAssignLeave()
		.verifyClickingOnLeaveList()
		.verifyClickingOnTimeSheets()
		.verifyClickingOnApplyLeave()
		.verifyClickingOnMyLeave()
		.verifyClickingOnMyTimesheets();		
	}
	//@Test
	public void LoginToOrangeHRMAndNvaigateToAdminPage() throws InterruptedException {

		LoginPage lp= new LoginPage();
		lp.successfulLogin("admin", "admin123")
		.verifyClickingOnMenuAdmin()
		.verifySearchingSystemUsers("admin");
	}

	}
