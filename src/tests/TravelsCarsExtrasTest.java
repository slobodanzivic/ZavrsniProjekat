package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TravelsCarsExtrasPage;
import tests.support.LoginLogoutSupport;
import tests.support.model.Car;

public class TravelsCarsExtrasTest extends LoginLogoutSupport {

	private Car car;

	private String testPrice = "Test";

	@BeforeTest
	public void createCar() {
		car = new Car("data/img/opel_antara.jpg", "Opel Antara", false, 3000);
	}

	@Test(priority = 0)
	public void addCarExtrasTest() throws InterruptedException, IOException {

		this.login();

		TravelsCarsExtrasPage tce = new TravelsCarsExtrasPage(driver);
		tce.clickOnCars();
		Thread.sleep(2000);

		tce.clickOnExtras();
		Thread.sleep(4000);

		tce.clickOnAddBtn();
		Thread.sleep(2000);

		tce.setName(car.getCarName());
		Thread.sleep(3000);

		tce.status(car.isStatus());
		Thread.sleep(2000);

		tce.setPrice(String.valueOf(car.getCarPrice()));
		Thread.sleep(3000);

		tce.clickOnSaveBtn();
		Thread.sleep(2000);

		this.logout();
	}

	@Test(priority = 1)
	public void findCarName() throws InterruptedException, IOException {

		this.login();

		TravelsCarsExtrasPage tce = new TravelsCarsExtrasPage(driver);
		tce.clickOnCars();
		Thread.sleep(2000);

		tce.clickOnExtras();
		Thread.sleep(4000);

		boolean containsCarName = tce.isContainsCarName(car.getCarName());
		Assert.assertTrue(containsCarName);

		this.logout();
	}

	@Test(priority = 2)
	public void editPriceCarExtrasTest() throws InterruptedException, IOException {

		this.login();

		TravelsCarsExtrasPage tce = new TravelsCarsExtrasPage(driver);
		tce.clickOnCars();
		Thread.sleep(2000);

		tce.clickOnExtras();
		Thread.sleep(4000);

		tce.clickOnAddBtn();
		Thread.sleep(2000);

		tce.setName(car.getCarName());
		Thread.sleep(3000);

		tce.status(car.isStatus());
		Thread.sleep(2000);

		tce.setPrice(this.testPrice);
		Thread.sleep(2000);

		tce.clickOnSaveBtn();
		Thread.sleep(2000);

		boolean hasError = tce.hasPriceError();
		Assert.assertTrue(hasError);

		this.logout();
	}

	@Test(priority = 3)
	public void uploadPhotoTest() throws InterruptedException, IOException {

		this.login();

		TravelsCarsExtrasPage tce = new TravelsCarsExtrasPage(driver);
		tce.clickOnCars();
		Thread.sleep(2000);

		tce.clickOnExtras();
		Thread.sleep(4000);

		tce.clickOnAddBtn();
		Thread.sleep(2000);

		tce.uploadImage(car.getCarPhotoPath());
		Thread.sleep(4000);

		tce.setName(car.getCarName());
		Thread.sleep(3000);

		tce.status(car.isStatus());
		Thread.sleep(2000);

		tce.setPrice(String.valueOf(car.getCarPrice()));
		Thread.sleep(3000);

		tce.clickOnSaveBtn();
		Thread.sleep(2000);

		Assert.assertTrue(tce.isImageUploadedSuccessfuly());

		this.logout();

	}
}
