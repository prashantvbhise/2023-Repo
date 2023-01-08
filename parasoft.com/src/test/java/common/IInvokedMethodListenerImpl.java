package common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodListenerImpl implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriverFactory.setDriver(new ChromeDriver());
		
		WebDriverFactory.getDriver().get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		
		WebDriverFactory.getDriver().manage().window().maximize();
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		
		WebDriverFactory.getDriver().quit();
		
	}

}
