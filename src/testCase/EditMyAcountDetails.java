package testCase;

import org.testng.annotations.Test;

import methods.Generic_Methods;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class EditMyAcountDetails {

	String url;

	@Test(dataProvider = "testData")
	public void verifyOrderDetails(String userName, String password) {
		methods.Generic_Methods.threadSleep(3000);
		
		repository.Home_Page.getLogin().click();
		methods.LoginPage.login(userName, password);
		methods.MyAccountPage.goToMyAccount();
		utilities.Assertion.verifyAccountPageUrl(url);
		methods.MyAccountPage.editProfile("Rachit", "Sinha", "8208929221", "19", "08", "1993");
		methods.Generic_Methods.threadSleep(10000);
	}

	@BeforeMethod
	public String openBrowser() {
		String xlsPath = "C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\src\\testData\\TestData.xlsx";
		String sheetName = "Browser Config";
		String browserType = Generic_Methods.getCellValueFromExcel(xlsPath, sheetName, 1, 0);
		url = Generic_Methods.getCellValueFromExcel(xlsPath, sheetName, 1, 1);
		methods.PreCondition.openBrowser(xlsPath, sheetName, browserType, url);
		return url;
	}

	@AfterMethod
	public void closeBrowser() {
		methods.PreCondition.closeBrowser();
	}

	@DataProvider
	public Object[][] testData() {
		String xlsPath = "C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\src\\testData\\TestData.xlsx";
		String sheetName = "LoggedIn User";
		Object[][] excelData = methods.Generic_Methods.getValueFromExcel(xlsPath, sheetName, 1, 2);
		return excelData;
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Execution Started");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Execution Completed");
	}

}
