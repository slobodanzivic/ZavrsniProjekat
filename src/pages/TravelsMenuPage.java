package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * Travels Menu Page
 * <br><br> 
 * Check the access to the menu items
 * 
 * @author slobodan
 *
 */
public class TravelsMenuPage extends BasicPage {

	public TravelsMenuPage(WebDriver driver) {
		super(driver);
	}

	private By dashboard = By.cssSelector("#social-sidebar-menu > li:nth-child(1) > a");
	private By updates = By.cssSelector("#social-sidebar-menu > li:nth-child(2) > a");
	private By modules = By.cssSelector("#social-sidebar-menu > li:nth-child(3) > a");
	private By tours = By.cssSelector("#social-sidebar-menu > li:nth-child(9) > a");
	private By coupons = By.cssSelector("#social-sidebar-menu > li:nth-child(15) > a");
	private By newsletter = By.cssSelector("#social-sidebar-menu > li:nth-child(16) > a");
	private By bookings = By.cssSelector("#social-sidebar-menu > li:nth-child(17) > a");
	private By addNew = By.cssSelector("#Tours > li:nth-child(2) > a");
	private By cars = By.cssSelector("#social-sidebar-menu > li:nth-child(10) > a");
	private By carsCars = By.cssSelector("#Cars > li:nth-child(1) > a");

	public WebElement getDashboard() {
		return this.driver.findElement(dashboard);
	}

	public WebElement getUpdates() {
		return this.driver.findElement(updates);
	}

	public WebElement getModules() {
		return this.driver.findElement(modules);
	}

	public WebElement getToures() {
		return this.driver.findElement(tours);
	}

	public WebElement getCoupons() {
		return this.driver.findElement(coupons);
	}

	public WebElement getNewsletter() {
		return this.driver.findElement(newsletter);
	}

	public WebElement getBookings() {
		return this.driver.findElement(bookings);
	}

	public WebElement getAddNew() {
		return this.driver.findElement(addNew);
	}

	public WebElement getCars() {
		return this.driver.findElement(cars);
	}

	public WebElement getCarsCars() {
		return this.driver.findElement(carsCars);
	}

	public void clickOnDashboard() {
		this.driver.findElement(dashboard).click();
	}

	public void clickOnUpdates() {
		this.driver.findElement(updates).click();
	}

	public void clickOnModules() {
		this.driver.findElement(modules).click();
	}

	public void clickOnTours() {
		this.driver.findElement(tours).click();
	}

	public void clickOnCoupons() {
		this.driver.findElement(coupons).click();
	}

	public void clickOnNewsletter() {
		this.driver.findElement(newsletter).click();
	}

	public void clickOnBookings() {
		this.driver.findElement(bookings).click();
	}

	public void clickOnAddNew() {
		this.driver.findElement(addNew).click();
	}

	public void clickOnCars() {
		this.driver.findElement(cars).click();
	}

	public void clickOnCarsCars() {
		this.driver.findElement(carsCars).click();
	}
}
