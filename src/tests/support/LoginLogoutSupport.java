package tests.support;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pages.LoginPage;
import pages.LogoutPage;

public class LoginLogoutSupport extends BasicTest {

	private static String baseUrl = "https://www.phptravels.net/admin";
	private static String usernameFilePath = "data/docs/username.xlsx";

	public void login() throws InterruptedException, IOException {

		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		File file = new File(usernameFilePath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();

		LoginPage lp = new LoginPage(driver);
		lp.singIn(username, password);
		Thread.sleep(3000);

		wb.close();
	}

	public void loginRememberMe() throws InterruptedException, IOException {

		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		File file = new File(usernameFilePath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();

		LoginPage lp = new LoginPage(driver);
		lp.singInRememberMe(username, password);
		Thread.sleep(3000);

		wb.close();
	}

	public void logout() throws InterruptedException {

		LogoutPage lp = new LogoutPage(driver);
		lp.clickOnLogoutBtn();
		Thread.sleep(3000);
	}

}
