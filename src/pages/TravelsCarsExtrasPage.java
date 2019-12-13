package pages;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/**
 * Travels Cars Extras Page
 * <br><br>
 * Data entry into input fields and upload image
 * 
 * @author slobodan
 *
 */
public class TravelsCarsExtrasPage extends BasicPage {

	private By cars = By.cssSelector("#social-sidebar-menu > li:nth-child(10) > a");
	private By extras = By.cssSelector("#Cars > li:nth-child(2) > a");
	private By addBtn = By.cssSelector(
			"#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-top-actions > a.btn.btn-success.xcrud-action");
	private By name = By.cssSelector("[data-required='1']");
	private By status = By.cssSelector("select.xcrud-input ");
	private By price = By.cssSelector(
			"#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-view > div > div:nth-child(4) > div > input");
	// .xcrud-view input.xcrud-input.form-control:nth-child(2)

	private By addImage = By.name("xcrud-attach");

	private By imageUploadedSuccessfuly = By.cssSelector("tr.xcrud-row td:nth-child(3)");

	private By saveBtn = By.cssSelector("[data-task='save']");

	private By rowsSelector = By.cssSelector("div.xcrud-list-container > table > tbody > tr");

	public TravelsCarsExtrasPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getCars() {
		return this.driver.findElement(cars);
	}

	public WebElement getExtras() {
		return this.driver.findElement(extras);
	}

	public WebElement getAddBtn() {
		return this.driver.findElement(addBtn);
	}

	public WebElement getName() {
		return this.driver.findElement(name);
	}

	public WebElement getStatus() {
		return this.driver.findElement(status);
	}

	public WebElement getPrice() {
		return this.driver.findElement(price);
	}

	public WebElement getUpload() {
		return this.driver.findElement(addImage);

	}

	public WebElement getSaveBtn() {
		return this.driver.findElement(saveBtn);

	}

	public void clickOnCars() {
		this.driver.findElement(cars).click();
	}

	public void clickOnExtras() {
		this.driver.findElement(extras).click();
	}

	public void clickOnAddBtn() {
		this.driver.findElement(addBtn).click();
	}

	public void clickOnSaveBtn() {
		this.driver.findElement(saveBtn).click();
	}

	public void setName(String name) {
		this.driver.findElement(this.name).sendKeys(name);
	}

	public void setPrice(String price) {
		this.driver.findElement(this.price).sendKeys(price);
	}

	public void status(boolean carStatus) {
		WebElement selectStatus = driver.findElement(this.status);
		Select sStatus = new Select(selectStatus);
		if (carStatus == true) {
			sStatus.selectByVisibleText("Yes");
		} else {
			sStatus.selectByVisibleText("No");
		}

	}

	public void uploadImage(String path) {
		getUpload().sendKeys(new File(path).getAbsolutePath());

	}

	public boolean isImageUploadedSuccessfuly() {
		try {
			return this.driver.findElement(imageUploadedSuccessfuly) != null;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isContainsCarName(String carName) {
		boolean contain = false;

		List<WebElement> rows = driver.findElements(this.rowsSelector);
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			WebElement nameElement = row.findElement(By.cssSelector("td:nth-child(4)"));
			String name = nameElement.getText();
			if (name.equals(carName)) {
				contain = true;
			}
		}

		return contain;
	}

	public boolean hasPriceError() {
		WebElement priceField = this.getPrice();
		return priceField.getAttribute("class").contains("validation-error");
	}
}
