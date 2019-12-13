package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Logout Page
 * <br><br>
 * Test logout action
 * 
 * @author slobodan
 *
 */
public class LogoutPage extends BasicPage {

	private By logoutBtn = By.id("logout");
	private By loginBtn = By.cssSelector("button[type='submit']");

	public LogoutPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getLoginBtn() {
		return this.driver.findElement(loginBtn);
	}

	public void clickOnLogoutBtn() {
		this.driver.findElement(logoutBtn).click();
	}
}
