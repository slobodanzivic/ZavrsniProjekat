package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TitlePage;
import tests.support.LoginLogoutSupport;

public class LoginTest extends LoginLogoutSupport {

	@Test(priority = 1)
	public void loginTest() throws InterruptedException, IOException {

		this.login();

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Dashboard"));

		this.logout();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void loginRememberMeTest() throws InterruptedException, IOException {

		this.loginRememberMe();

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Dashboard"));

		this.logout();
		Thread.sleep(2000);
	}

}
