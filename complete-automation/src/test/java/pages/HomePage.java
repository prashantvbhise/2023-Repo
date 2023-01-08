package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import common.BaseSeleniumPage;

public class HomePage extends BaseSeleniumPage {

	@FindBy(xpath = "//p[text()='helan POL']")
	private WebElement welcomeText;

	@FindBy(xpath = "//button[@title='Assign Leave']")
	private WebElement btnAssignLeave;

	@FindBy(xpath = "//button[@title='Leave List']")
	private WebElement btnLeaveList;

	@FindBy(xpath = "//button[@title='Timesheets']")
	private WebElement btnTimesheets;

	@FindBy(xpath = "//button[@title='Apply Leave']")
	private WebElement btnApplyLeave;

	@FindBy(xpath = "//button[@title='My Leave']")
	private WebElement btnMyLeave;

	@FindBy(xpath = "//button[@title='My Timesheet']")
	private WebElement btnMyTimesheet;

	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement btnDashboard;

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement btnPIM;

	@FindBy(xpath = "//span[text()='Leave']")
	private WebElement btnLeave;

	@FindBy(xpath = "//span[text()='Time']")
	private WebElement btnTime;

	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement btnAdmin;

	public HomePage verifyWelcomeText() {
		//wait.until(ExpectedConditions.visibilityOf(welcomeText));
		waitForElementToAppear(welcomeText);
		Assert.assertEquals(welcomeText.getText(), "helan POL");
		return this;
	}

	public HomePage verifyClickingOnAssignLeave() {
		//wait.until(ExpectedConditions.visibilityOf(btnAssignLeave));
		waitForElementToAppear(btnAssignLeave);
		btnAssignLeave.click();
		//wait.until(ExpectedConditions.visibilityOf(btnDashboard));
		waitForElementToAppear(btnDashboard);
		btnDashboard.click();
		return this;

	}

	public HomePage verifyClickingOnLeaveList() {
		//wait.until(ExpectedConditions.visibilityOf(btnLeaveList));
		waitForElementToAppear(btnLeaveList);
		btnLeaveList.click();
		waitForElementToAppear(btnDashboard);
		//wait.until(ExpectedConditions.visibilityOf(btnDashboard));
		btnDashboard.click();
		return this;

	}

	public HomePage verifyClickingOnTimeSheets() {
		//wait.until(ExpectedConditions.visibilityOf(btnTimesheets));
		waitForElementToAppear(btnTimesheets);
		btnTimesheets.click();
		waitForElementToAppear(btnDashboard);
		//wait.until(ExpectedConditions.visibilityOf(btnDashboard));
		btnDashboard.click();
		return this;

	}

	public HomePage verifyClickingOnApplyLeave() {
		waitForElementToAppear(btnApplyLeave);
		//wait.until(ExpectedConditions.visibilityOf(btnApplyLeave));
		btnApplyLeave.click();
		waitForElementToAppear(btnDashboard);
		//wait.until(ExpectedConditions.visibilityOf(btnDashboard));
		btnDashboard.click();
		return this;

	}

	public HomePage verifyClickingOnMyLeave() {
		waitForElementToAppear(btnMyLeave);
		//wait.until(ExpectedConditions.visibilityOf(btnMyLeave));
		btnMyLeave.click();
		waitForElementToAppear(btnDashboard);
		//wait.until(ExpectedConditions.visibilityOf(btnDashboard));
		btnDashboard.click();
		return this;

	}

	public HomePage verifyClickingOnMyTimesheets() {
		waitForElementToAppear(btnMyTimesheet);
		//wait.until(ExpectedConditions.visibilityOf(btnMyTimesheet));
		btnMyTimesheet.click();
		waitForElementToAppear(btnDashboard);
		//wait.until(ExpectedConditions.visibilityOf(btnDashboard));
		btnDashboard.click();
		return this;

	}

	public AdminPage verifyClickingOnMenuAdmin() {
		waitForElementToAppear(btnAdmin);
		//wait.until(ExpectedConditions.visibilityOf(btnAdmin));
		btnAdmin.click();
		AdminPage ap= new AdminPage();
		return ap;

	}
}
