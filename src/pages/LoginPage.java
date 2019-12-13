package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * Login Page
 * <br><br>
 * Test login panel with email and password and login with checkbox Remember me
 * 
 * @author slobodan
 *
 */
public class LoginPage extends BasicPage {

	private By email = By.cssSelector("[name='email']");
	private By password = By.cssSelector("[name='password']");
	private By rememberMe = By.cssSelector("label.checkbox");
	private By forgetPassword = By.className("forget-password");
	private By loginBtn = By.cssSelector("[type='submit']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getEmail() {
		return this.driver.findElement(email);
	}

	public WebElement getPassword() {
		return this.driver.findElement(password);
	}

	public WebElement getRememberMe() {
		return this.driver.findElement(rememberMe);
	}

	public WebElement getForgetPassword() {
		return this.driver.findElement(forgetPassword);
	}

	public WebElement getLoginBtn() {
		return this.driver.findElement(loginBtn);
	}

	public void setEmail(String email) {
		this.driver.findElement(this.email).sendKeys(email);
	}

	public void setPassword(String password) {
		this.driver.findElement(this.password).sendKeys(password);
	}

	public void clickOnRememberMe() {
		this.driver.findElement(rememberMe).click();
	}

	public void clickOnForgetPassword() {
		this.driver.findElement(forgetPassword).click();
	}

	public void clickOnLoginBtn() {
		this.driver.findElement(loginBtn).click();
	}

	public void singIn(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
		this.clickOnLoginBtn();
	}

	public void singInRememberMe(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
		this.clickOnRememberMe();
		this.clickOnLoginBtn();
	}

}
