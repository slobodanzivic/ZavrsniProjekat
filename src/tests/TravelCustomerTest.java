package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.TravelCustomerPage;
import tests.support.LoginLogoutSupport;
import tests.support.model.Customer;

public class TravelCustomerTest extends LoginLogoutSupport {

	@Test(priority = 1)
	public void travelCustomerTest() throws InterruptedException, IOException {

		this.login();

		Customer customer = new Customer("Dragomir", "Petrovic", "dragpetrov5522@gmail.com", "test12345", "0662244888",
				"Serbia", "Strahinjica Bana");

		TravelCustomerPage tcp = new TravelCustomerPage(driver);
		tcp.clickOnAccount();
		Thread.sleep(2000);

		tcp.clickOnCustomers();
		Thread.sleep(2000);

		tcp.clickOnEdit();
		Thread.sleep(2000);

		tcp.clearAndSetFirstName(customer.getFirstName());
		Thread.sleep(2000);

		tcp.clearAndSetLastName(customer.getLastName());
		Thread.sleep(2000);

		tcp.clearAndSetEmail(customer.getEmail());
		Thread.sleep(2000);

		tcp.clearAndSetPassword(customer.getPassword());
		Thread.sleep(2000);

		tcp.clearAndSetMobileNumber(customer.getPhoneNumber());
		Thread.sleep(2000);

		tcp.chooseCountry(customer.getCountry());
		Thread.sleep(2000);

		tcp.clearAndSetAddress1(customer.getAddress());
		Thread.sleep(2000);

		tcp.changeStatus();
		Thread.sleep(2000);

		tcp.clickOnCheckboxEmail();
		Thread.sleep(2000);

		tcp.clickOnSubmitBtn();
		Thread.sleep(5000);

		this.logout();
	}
}
