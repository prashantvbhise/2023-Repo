package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import common.BaseSeleniumPage;

public class AdminPage extends BaseSeleniumPage{
	
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement btnSearch;
	
	@FindBy (css="input.oxd-input.oxd-input--active")
	private WebElement inputUsername;
	
	@FindBy (css="span.oxd-text.oxd-text--span")
	private WebElement txtResults;
	
	@FindBy (css="div.oxd-select-text-input")
	private WebElement drpUserrole;
	
	@FindBy (xpath="//div[@role='listbox'//option]")
	private List<WebElement> allOptions;
	
	
	
	@FindBy (xpath="//input[contains(@placeholder,'Type for hints...')]")
	private WebElement inputEmpName;
	
	@FindBy (css="div.oxd-select-wrapper")
	private WebElement drpStatus;
	
	public AdminPage verifySearchingSystemUsers(String strUsername) throws InterruptedException {
		//wait.until(ExpectedConditions.visibilityOf(inputUsername));
		waitForElementToAppear(inputUsername);
		inputUsername.sendKeys(strUsername);
		drpUserrole.click();
		System.out.println(allOptions.size());
		
		//Select userRole = new Select(drpUserrole);
		//userRole.selectByVisibleText("Admin");
		inputEmpName.sendKeys("Paul Collings");

		//wait.until(ExpectedConditions.visibilityOf(txtResults));
		//Thread.sleep(2000);
		Assert.assertEquals(txtResults.isEnabled(), true);
		return this;
		
	}

}
