package pages;

import org.openqa.selenium.WebDriver;

/**
 * Title Page
 * <br><br>
 * Test title text on the pages 
 * 
 * @author slobodan
 *
 */
public class TitlePage extends BasicPage {

	public TitlePage(WebDriver driver) {
		super(driver);
	}

	public String getPageTitle() {
		return this.driver.getTitle();
	}
}
