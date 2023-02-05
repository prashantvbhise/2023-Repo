package test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.BaseSelenium;
import common.ITestListenerImpl;
import pages.LoginPage;

@Listeners(ITestListenerImpl.class)
public class OpenAccount extends BaseSelenium {
	
	@Test(dataProvider="getData")
	public void verifyAccountOpening(HashMap<String, String> input) throws InterruptedException {
		
		LoginPage lp = new LoginPage();
		lp.loginToParaBank("john", "demo");
		lp.goToOpenNewAccount()
		.openNewAccounts(input.get("accountType"), input.get("accountId"))
		.verifyAccountOpeningConfirmation()
		.verifyAccountDetailsForNewlyOpendAccount();
	}
	
	//Data Provided using json file
	@DataProvider
	public Object[][] getData() throws IOException {	
		List<HashMap<String, String>>  data = getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\AccountOpeningData.json"); 
		return new Object[][] {{data.get(0)},{data.get(1)},{data.get(2)}};
	}
	
	

}
