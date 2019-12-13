package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsCarsPage;
import tests.support.LoginLogoutSupport;

public class TravelsCarsTest extends LoginLogoutSupport {

	@Test(priority = 1)
	public void checkNumberOfModels() throws InterruptedException, IOException {

		this.login();

		TravelsCarsPage tc = new TravelsCarsPage(driver);
		tc.getCars();
		Thread.sleep(2000);

		tc.clickOnCars();
		Thread.sleep(2000);

		tc.clickOnCarsCars();
		Thread.sleep(2000);

		boolean numOfModels = tc.isNumOfModelsEquals(10);
		Assert.assertFalse(numOfModels);

		this.logout();
	}

	@Test(priority = 2)
	public void checkSumOfOrders() throws InterruptedException, IOException {

		this.login();

		TravelsCarsPage tc = new TravelsCarsPage(driver);
		tc.getCars();
		Thread.sleep(2000);

		tc.clickOnCars();
		Thread.sleep(2000);

		tc.clickOnCarsCars();
		Thread.sleep(2000);

		int sum = tc.sumOfOrders();
		Assert.assertTrue(sum > 50);

		this.logout();
	}

	@Test(priority = 3)
	public void uploadCarPhoto() throws InterruptedException, IOException {

		this.login();

		TravelsCarsPage tc = new TravelsCarsPage(driver);
		tc.getCars();
		Thread.sleep(2000);

		tc.clickOnCars();
		Thread.sleep(2000);

		tc.clickOnCarsCars();
		Thread.sleep(2000);

		String uploadLinkText = tc.getUploadLinkText();
		Thread.sleep(2000);

		tc.clickOnUploadLink();
		Thread.sleep(2000);

		tc.clickOnAddCarPhoto();
		Thread.sleep(2000);

		tc.uploadImage("data/img/opel_antara.jpg");
		Thread.sleep(2000);

		tc.getCars();
		Thread.sleep(2000);

		tc.clickOnCars();
		Thread.sleep(2000);

		tc.clickOnCarsCars();
		Thread.sleep(2000);

		String uploadLinkNewText = tc.getUploadLinkText();
		Thread.sleep(2000);

		Assert.assertNotEquals(uploadLinkText, uploadLinkNewText);

		this.logout();
	}
}
