package tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogoutPage;
import tests.support.LoginLogoutSupport;

public class LogoutTest extends LoginLogoutSupport {

	@Test
	public void logoutTest() throws InterruptedException, IOException {

		this.login();
		Thread.sleep(2000);
		this.logout();
		Thread.sleep(2000);

		LogoutPage lp = new LogoutPage(driver);
		WebElement lgBtn = lp.getLoginBtn();

		Assert.assertNotNull(lgBtn);
		Thread.sleep(2000);
	}
}
