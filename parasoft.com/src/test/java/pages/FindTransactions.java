package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindTransactions {
	
	@FindBy(id="accountId")
	private WebElement accountIddrdn;
	
	@FindBy(id="criteria.transactionId")
	private WebElement transactionId;
	
	@FindBy(xpath="//button[contains(@ng-click,'ID')]")
	private WebElement findByIdbtn;
	
	@FindBy(id="criteria.onDate")
	private WebElement searchDate;
	
	@FindBy(xpath="//button[contains(@ng-click,'DATE')]")
	private WebElement findByDatebtn;
	
	@FindBy(id="criteria.fromDate")
	private WebElement trxFromDate;
	
	@FindBy(id="criteria.toDate")
	private WebElement trxToDate;
	
	@FindBy(xpath="//button[contains(@ng-click,'DATE_RANGE')]")
	private WebElement findByDateRangebtn;
	
	@FindBy(id="criteria.amount")
	private WebElement searchAmount;
	
	@FindBy(xpath="//button[contains(@ng-click,'AMOUNT')]")
	private WebElement findByAmountbtn;

}
