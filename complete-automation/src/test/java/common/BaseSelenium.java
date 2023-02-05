package common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	public String getScreenshots(String testCaseName, ChromeDriver chromeDriver) throws IOException {
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)WebDriverFactory.getDriver();
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"//reports//" +"//"+timeStamp +"//"+ testCaseName +"//"+ testCaseName +".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"//reports//" +"//"+timeStamp +"//"+ testCaseName +"//"+ testCaseName +".png";
		
	}
	
}
