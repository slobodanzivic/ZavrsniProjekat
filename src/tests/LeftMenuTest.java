package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TitlePage;
import pages.TravelsMenuPage;
import tests.support.LoginLogoutSupport;
import tests.support.model.Menu;

public class LeftMenuTest extends LoginLogoutSupport {

	private Menu leftMenu;

	@BeforeTest
	public void createMenu() {
		leftMenu = new Menu("Dashboard", "Updates", "Modules", "Add Tour", "Coupon Codes Management",
				"Newsletter Management", "Booking Management", "Cars Management");
	}

	@Test(priority = 1)
	public void dashboardPageTest() throws InterruptedException, IOException {

		this.login();

		TravelsMenuPage tm = new TravelsMenuPage(driver);

		tm.clickOnDashboard();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains(leftMenu.getDashboardName()));

		this.logout();
	}

	@Test(priority = 2)
	public void updatesPageTest() throws InterruptedException, IOException {

		this.login();

		TravelsMenuPage tm = new TravelsMenuPage(driver);
		tm.clickOnUpdates();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains(leftMenu.getUpdatesName()));

		this.logout();
	}

	@Test(priority = 3)
	public void modulesPageTest() throws InterruptedException, IOException {

		this.login();

		TravelsMenuPage tm = new TravelsMenuPage(driver);
		tm.clickOnModules();
		Thread.sleep(3000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains(leftMenu.getModulesName()));

		this.logout();
	}

	@Test(priority = 4)
	public void toursPageTest() throws InterruptedException, IOException {

		this.login();

		TravelsMenuPage tm = new TravelsMenuPage(driver);
		tm.clickOnTours();
		Thread.sleep(3000);
		tm.clickOnAddNew();

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains(leftMenu.getAddTourName()));

		this.logout();
	}

	@Test(priority = 5)
	public void couponsPageTest() throws InterruptedException, IOException {

		this.login();

		TravelsMenuPage tm = new TravelsMenuPage(driver);
		tm.clickOnCoupons();
		Thread.sleep(3000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains(leftMenu.getCouponName()));

		this.logout();
	}

	@Test(priority = 6)
	public void newsletterPageTest() throws InterruptedException, IOException {

		this.login();

		TravelsMenuPage tm = new TravelsMenuPage(driver);
		tm.clickOnNewsletter();
		Thread.sleep(3000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains(leftMenu.getNewsletterManagementName()));

		this.logout();
	}

	@Test(priority = 7)
	public void bookingsPageTest() throws InterruptedException, IOException {

		this.login();

		TravelsMenuPage tm = new TravelsMenuPage(driver);
		tm.clickOnBookings();
		Thread.sleep(3000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains(leftMenu.getBookingManagementName()));

		this.logout();
	}

	@Test(priority = 8)
	public void carsPageTest() throws InterruptedException, IOException {

		this.login();

		TravelsMenuPage tm = new TravelsMenuPage(driver);
		tm.clickOnCars();
		Thread.sleep(3000);

		tm.clickOnCarsCars();
		Thread.sleep(3000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains(leftMenu.getCarsManagementName()));

		this.logout();
	}

}
