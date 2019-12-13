package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Travel Customer Page
 * <br><br>
 * Edit all form fields
 * 
 * @author slobodan
 *
 */
public class TravelCustomerPage extends BasicPage {

	private By account = By.cssSelector("#social-sidebar-menu > li:nth-child(5) > a");
	private By customers = By.cssSelector("#ACCOUNTS > li:nth-child(3) > a");
	private By edit = By
			.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[8]/span/a[1]/i");
	private By firstName = By.cssSelector("[placeholder='First name']");
	private By lastName = By.cssSelector("[placeholder='Last name']");
	private By email = By.cssSelector("[placeholder='Email address']");
	private By password = By.cssSelector("[placeholder='Password']");
	private By mobileNumber = By.cssSelector("[placeholder='Mobile Number']");
	private By address1 = By.cssSelector("[placeholder='Full address']");
	private By country = By.cssSelector("div#s2id_autogen1");
	private By inputCountry = By.cssSelector("input.select2-input");
	private By status = By.cssSelector("select.form-control");
	private By checkboxEmail = By.cssSelector("[name='newssub']");
	private By submitBtn = By.cssSelector("#content > form > div > div.panel-footer > button");

	public TravelCustomerPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getAccount() {
		return this.driver.findElement(account);
	}

	public WebElement getCustomers() {
		return this.driver.findElement(customers);
	}

	public WebElement getEdit() {
		return this.driver.findElement(edit);
	}

	public WebElement getFirstName() {
		return this.driver.findElement(firstName);
	}

	public WebElement getLastName() {
		return this.driver.findElement(lastName);
	}

	public WebElement getEmail() {
		return this.driver.findElement(email);
	}

	public WebElement getPassword() {
		return this.driver.findElement(password);
	}

	public WebElement getMobileNumber() {
		return this.driver.findElement(mobileNumber);
	}

	public WebElement getAddress1() {
		return this.driver.findElement(address1);
	}

	public WebElement getCountry() {
		return this.driver.findElement(country);
	}

	public WebElement getStatus() {
		return this.driver.findElement(status);
	}

	public WebElement getCheckboxEmail() {
		return this.driver.findElement(checkboxEmail);
	}

	public WebElement getSubmitBtn() {
		return this.driver.findElement(submitBtn);
	}

	public void clickOnAccount() {
		this.driver.findElement(account).click();
	}

	public void clickOnCustomers() {
		this.driver.findElement(customers).click();
	}

	public void clickOnEdit() {
		this.driver.findElement(edit).click();
	}

	public void clearAndSetFirstName(String newFirstName) {
		this.driver.findElement(firstName).click();
		this.driver.findElement(firstName).clear();
		this.driver.findElement(this.firstName).sendKeys(newFirstName);
	}

	public void clearAndSetLastName(String newLastName) {
		this.driver.findElement(lastName).click();
		this.driver.findElement(lastName).clear();
		this.driver.findElement(this.lastName).sendKeys(newLastName);
	}

	public void clearAndSetEmail(String newEmail) {
		this.driver.findElement(email).click();
		this.driver.findElement(email).clear();
		this.driver.findElement(this.email).sendKeys(newEmail);
	}

	public void clearAndSetPassword(String newPassword) {
		this.driver.findElement(password).click();
		this.driver.findElement(password).clear();
		this.driver.findElement(this.password).sendKeys(newPassword);
	}

	public void clearAndSetMobileNumber(String newMobNumber) {
		this.driver.findElement(mobileNumber).click();
		this.driver.findElement(mobileNumber).clear();
		this.driver.findElement(this.mobileNumber).sendKeys(newMobNumber);

	}

	public void chooseCountry(String countryName) {
		this.driver.findElement(country).click();
		this.driver.findElement(inputCountry).click();
		this.driver.findElement(this.inputCountry).sendKeys(countryName);
		driver.findElement(By.cssSelector("input.select2-input")).sendKeys(Keys.ENTER);

	}

	public void clearAndSetAddress1(String newAddress1) {
		this.driver.findElement(address1).click();
		this.driver.findElement(address1).clear();
		this.driver.findElement(this.address1).sendKeys(newAddress1);

	}

	public void changeStatus() {
		WebElement selectStatus = driver.findElement(this.status);
		Select sStatus = new Select(selectStatus);
		sStatus.selectByVisibleText("Disabled");

	}

	public void clickOnCheckboxEmail() {
		this.driver.findElement(checkboxEmail).click();
	}

	public void clickOnSubmitBtn() {
		this.driver.findElement(submitBtn).click();
	}

}
