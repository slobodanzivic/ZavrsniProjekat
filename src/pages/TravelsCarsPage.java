package pages;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Travels Cars Page
 * <br><br>
 * Add car photo, check number of models, check sum of order and 
 * check if car's photo uploaded successfully 
 * 
 * @author slobodan
 *
 */
public class TravelsCarsPage extends BasicPage {

	private By rowsSelector = By.cssSelector("div.xcrud-list-container > table > tbody > tr");
	private By cars = By.cssSelector("#social-sidebar-menu > li:nth-child(10) > a");
	private By carsCars = By.cssSelector("#Cars > li:nth-child(1) > a");
	private By carPhoto = By.cssSelector("input[type='file']");
	private By addCarPhoto = By.cssSelector("table.table-striped.table-hover tr th a");

	public TravelsCarsPage(WebDriver driver) {
		super(driver);

	}

	public WebElement getCars() {
		return this.driver.findElement(cars);
	}

	public WebElement getCarsCars() {
		return this.driver.findElement(carsCars);
	}

	public WebElement getCarPhoto() {
		return this.driver.findElement(carPhoto);
	}

	public WebElement getAddCarPhoto() {
		return this.driver.findElement(addCarPhoto);
	}

	public void clickOnCars() {
		this.driver.findElement(cars).click();
	}

	public void clickOnCarsCars() {
		this.driver.findElement(carsCars).click();
	}

	public void clickOnAddCarPhoto() {
		this.driver.findElement(addCarPhoto).click();
	}

	public boolean isNumOfModelsEquals(int numberOfModels) {
		List<WebElement> rows = driver.findElements(rowsSelector);
		int numberOfRows = rows.size();
		if (numberOfRows == numberOfModels) {
			return true;
		}
		return false;
	}

	public int sumOfOrders() {
		int sum = 0;
		List<WebElement> rows = driver.findElements(rowsSelector);
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			WebElement orderValueElement = row.findElement(By.cssSelector("td:nth-child(10) input"));
			String val = orderValueElement.getAttribute("value");
			sum = sum + Integer.valueOf(val);
		}

		return sum;
	}

	public void uploadImage(String path) {
		getCarPhoto().sendKeys(new File(path).getAbsolutePath());

	}

	public void clickOnUploadLink() {
		List<WebElement> rows = driver.findElements(rowsSelector);
		WebElement firstRow = rows.get(0);
		WebElement uploadLink = firstRow.findElement(By.cssSelector("td:nth-child(9) a"));
		uploadLink.click();

	}

	public String getUploadLinkText() {
		List<WebElement> rows = driver.findElements(rowsSelector);
		WebElement firstRow = rows.get(0);
		WebElement uploadLink = firstRow.findElement(By.cssSelector("td:nth-child(9) a"));
		String uploadLinkText = uploadLink.getText();
		return uploadLinkText;
	}
}
