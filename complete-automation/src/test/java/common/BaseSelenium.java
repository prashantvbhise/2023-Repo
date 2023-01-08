package common;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSelenium {
	
	@BeforeMethod
	public void beforeEveryMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriverFactory.setDriver(new ChromeDriver());
		
		WebDriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//WebDriverFactory.getDriver().get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		
		WebDriverFactory.getDriver().manage().window().maximize();
		
		//WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
			
	}
	@AfterMethod
	public void afterEveryMethod() {
		
		WebDriverFactory.getDriver().quit();
		
	}
	
}
