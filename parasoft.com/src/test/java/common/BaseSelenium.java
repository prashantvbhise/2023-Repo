package common;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseSelenium {

	@BeforeMethod
	public void beforeEveryMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriverFactory.setDriver(new ChromeDriver());

		WebDriverFactory.getDriver().get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");

		WebDriverFactory.getDriver().manage().window().maximize();

		//WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

	}
	@AfterMethod
	public void afterEveryMethod() {

		WebDriverFactory.getDriver().quit();

	}

	public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException {
		String jsonContent=	FileUtils.readFileToString(new File(filePath));
		ObjectMapper mapper= new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>(){});
		return data;	
	}

	public String getScreenshots(String testCaseName, ChromeDriver chromeDriver) throws IOException {

		TakesScreenshot ts= (TakesScreenshot)WebDriverFactory.getDriver();
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+ "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"//reports//" + testCaseName + ".png";


	}

}
