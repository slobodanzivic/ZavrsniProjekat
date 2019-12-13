package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CustomerManagementPage;
import tests.support.LoginLogoutSupport;

public class CustomerManagementTest extends LoginLogoutSupport {

	private String nameOfCustomer = "Dragomir Petrovic";

	@Test(priority = 1)
	public void findCustomerName() throws InterruptedException, IOException {

		this.login();

		CustomerManagementPage cmp = new CustomerManagementPage(driver);

		cmp.clickOnAccount();
		Thread.sleep(3000);

		cmp.clickOnCustomers();
		Thread.sleep(3000);

		cmp.clickOnSearchBtn();
		Thread.sleep(3000);

		cmp.clickOnInputSearch();
		Thread.sleep(3000);

		cmp.setCustomerName(nameOfCustomer);
		Thread.sleep(3000);

		cmp.clickOnGoBtn();
		Thread.sleep(3000);

		boolean containsCustomerName = cmp.isContainsCustomerName();
		Assert.assertFalse(containsCustomerName);

		this.logout();

	}

}
