package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Customer management page
 * <br><br>
 * Check first and last name of customer in Customer management page
 * 
 * @author slobodan
 *
 */
public class CustomerManagementPage extends BasicPage {

	private By account = By.cssSelector("#social-sidebar-menu > li:nth-child(5) > a");
	private By customers = By.cssSelector("#ACCOUNTS > li:nth-child(3) > a");
	private By searchBtn = By.cssSelector(
			"#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-nav > a");
	private By inputSearch = By.cssSelector("input.xcrud-searchdata ");
	private By goBtn = By.cssSelector("[data-search='1']");
	private By firstRowResult = By.cssSelector(".xcrud-list.table.table-striped.table-hover tr td:nth-child(1)");

	public CustomerManagementPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getAccount() {
		return this.driver.findElement(account);
	}

	public WebElement getCustomers() {
		return this.driver.findElement(customers);
	}

	public WebElement getSearchBtn() {
		return this.driver.findElement(searchBtn);
	}

	public WebElement getInputSearch() {
		return this.driver.findElement(inputSearch);
	}

	public WebElement getGoBtn() {
		return this.driver.findElement(goBtn);
	}

	public void clickOnAccount() {
		this.driver.findElement(account).click();
	}

	public void clickOnCustomers() {
		this.driver.findElement(customers).click();
	}

	public void clickOnSearchBtn() {
		this.driver.findElement(searchBtn).click();
	}

	public void clickOnInputSearch() {
		this.driver.findElement(inputSearch).click();
	}

	public void clickOnGoBtn() {
		this.driver.findElement(goBtn).click();
	}

	public void setCustomerName(String customerName) {
		this.driver.findElement(this.inputSearch).sendKeys(customerName);
	}

	/**
	 * Check search result
	 * 
	 * @return returns false in case nothing found
	 */
	public boolean isContainsCustomerName() {
		boolean contain = true;

		WebElement firstRow = driver.findElement(this.firstRowResult);
		String errorMessage = firstRow.getText();
		if (errorMessage.equals("Entries not found.")) {
			contain = false;
		}
		return contain;
	}

}
