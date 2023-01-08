package common;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSeleniumPage {

	protected WebDriverWait wait; 

	public BaseSeleniumPage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
		wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(5));
	}
	public void waitForElementToAppear(WebElement abc) {

		//wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(abc));

	}
	public void waitForElementToDisappear(WebElement abc) {

		//WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(abc));

	}

}
