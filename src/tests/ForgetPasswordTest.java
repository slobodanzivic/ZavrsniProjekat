package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ForgetPasswordPage;
import pages.LogoutPage;
import tests.support.LoginLogoutSupport;

public class ForgetPasswordTest extends LoginLogoutSupport {

	@Test
	public void forgetPasswordTest() throws InterruptedException, IOException {

		this.login();

		LogoutPage logp = new LogoutPage(driver);

		logp.clickOnLogoutBtn();
		Thread.sleep(3000);

		ForgetPasswordPage fp = new ForgetPasswordPage(driver);

		fp.clickOnForgetPassword();
		Thread.sleep(3000);

		fp.setResetMail("admin123987@phptravels.com");
		Thread.sleep(3000);

		fp.clickOnResetBtn();
		Thread.sleep(3000);

		String errorMessage = fp.getErrorMessage();
		Assert.assertEquals(errorMessage, "Email Not Found");
	}
}
