package common;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
	
	private static ChromeDriver driver;
	
	public static ChromeDriver getDriver() {
		
		return driver;
	}
	
	public static void setDriver(ChromeDriver localDriver) {
		
		driver = localDriver;
	}

}
