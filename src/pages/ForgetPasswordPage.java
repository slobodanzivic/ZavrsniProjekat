package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Forget password page
 * <br><br>
 * Test forget password link in login panel 
 * 
 * @author slobodan
 *
 */
public class ForgetPasswordPage extends BasicPage {

	private By forgetPassword = By.className("forget-password");
	private By resetEmail = By.cssSelector("input#resetemail");
	private By resetBtn = By.cssSelector("button#btn-forgot");
	private By emailNotFound = By.cssSelector(".resultreset .alert");

	public ForgetPasswordPage(WebDriver driver) {
		super(driver);

	}

	public void clickOnForgetPassword() {
		this.driver.findElement(forgetPassword).click();
	}

	public WebElement getResetMail() {
		return this.driver.findElement(resetEmail);
	}

	public void setResetMail(String resetMail) {
		this.driver.findElement(resetEmail).sendKeys(resetMail);
	}

	public void clickOnResetEmail() {
		this.driver.findElement(resetEmail).click();
	}

	public void clickOnResetBtn() {
		this.driver.findElement(resetBtn).click();
	}

	public String getErrorMessage() {
		return this.driver.findElement(emailNotFound).getText();
	}

}
