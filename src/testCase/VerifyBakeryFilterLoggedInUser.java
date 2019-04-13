package testCase;

import org.testng.annotations.Test;

import methods.Generic_Methods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class VerifyBakeryFilterLoggedInUser {
	String url;

	@Test(dataProvider = "bakeryFilter")
	public void verifyBakeryFilterDesktop(String city, String location, String bakeryFilter, String userName,
			String password, String deliveryType, String paymentMode, String deliveryDate, String deliveryTime) {
		methods.Generic_Methods.threadSleep(3000);
		repository.Home_Page.getLogin().click();
		methods.LoginPage.login(userName, password);
		methods.HomePage.selectCity(city);
		utilities.Assertion.verifyHomePage(url, city);
		methods.HomePage.typeLocation(location);
		methods.Generic_Methods.threadSleep(2000);
		methods.HomePage.selectFirstAutoSuggestion();
		methods.Generic_Methods.threadSleep(3000);
		utilities.Assertion.verifyBakeryListingPage(url, city, location);
		methods.BakeryFilter.selectBakeryFilter(bakeryFilter);
		methods.Generic_Methods.threadSleep(5000);
		utilities.Assertion.verifyBakeryFilterPage(url, city, location, bakeryFilter);
	}

	@Test(dependsOnMethods = "verifyBakeryFilterDesktop", dataProvider = "bakeryFilter")
	public void orderCake(String city, String location, String bakeryFilter, String userName, String password,
			String deliveryType, String paymentMode, String deliveryDate, String deliveryTime) {
		String pdpPageUrl = null;
		methods.Generic_Methods.threadSleep(3000);
		String bakeryName = repository.Bakery_Listing_Page.getFirstIndexBakeryName();
		methods.Generic_Methods.waitForElement(repository.Bakery_Listing_Page.getBakeryByIndex(1));
		methods.BakeryListingPage.selectBakeryByIndex(1);
		methods.Generic_Methods.threadSleep(3000);
		if (bakeryFilter.equalsIgnoreCase("Home Baker")) {
			utilities.Assertion.verifyBakeryProductListingPageStandalone(url, city, location, bakeryName);
		} else {
			utilities.Assertion.verifyBakeryProductListingPage(url, city, location, bakeryName);
		}
		methods.Generic_Methods.waitForElement(repository.Cake_Listing_Page.getCakeByIndex(1));
		methods.CakeListingPage.selectCakeByIndex(1);
		methods.Generic_Methods.threadSleep(5000);
		if (bakeryFilter.equalsIgnoreCase("Home Baker")) {
			pdpPageUrl = utilities.Assertion.verifyPdpPageStandalone(url, city, location);
		} else {
			pdpPageUrl = utilities.Assertion.verifyPdpPage(url, city, location);
		}
		methods.ProductDescriptionPage.selectDeliveryType(deliveryType);
		methods.Generic_Methods.threadSleep(3000);
		methods.ProductDescriptionPage.selectFlavour(1);
		methods.ProductDescriptionPage.uploadPhoto("C:\\Users\\Guest User\\Desktop\\frog.jpg");
		if (!deliveryDate.equalsIgnoreCase("null")) {
			methods.ProductDescriptionPage.selectDeliveryDate(deliveryDate);
		}
		if (!deliveryTime.equalsIgnoreCase("null")) {
			methods.ProductDescriptionPage.selectDeliveryTime(deliveryTime);
		}
		methods.Generic_Methods.threadSleep(3000);
		methods.Generic_Methods.waitForElement(repository.Product_Description_Page.getOrderNow());
		methods.ProductDescriptionPage.goToAddressPage();
		methods.Generic_Methods.threadSleep(3000);
		String pageUrl = methods.PreCondition.driver.getCurrentUrl();
		if (pageUrl.contains("page=addons")) {
			utilities.Assertion.verifyAddOnsPage(pdpPageUrl, deliveryType);
			methods.AddOnsPage.continueOrder();
			methods.Generic_Methods.threadSleep(3000);
		}
		if (bakeryFilter.equalsIgnoreCase("Home Baker")) {
			utilities.Assertion.verifyBillingPageStandalone(pdpPageUrl);
		} else {
			utilities.Assertion.verifyBillingPage(pdpPageUrl);
		}
		if (deliveryType.contains("Delivery")) {
			methods.AddressPage.typeDeliveryAddress("Rachit", "Sinha", "1234567890", "12", location);
		}
		methods.Generic_Methods.threadSleep(3000);
		methods.AddressPage.goToCheckOutPage();
		methods.CheckOutPage.selectPaymentMode(paymentMode);
		if (bakeryFilter.equalsIgnoreCase("Home Baker")) {
			utilities.Assertion.verifyCheckOutPageStandalone(pdpPageUrl, deliveryType);
		} else {
			utilities.Assertion.verifyCheckOutPage(pdpPageUrl, deliveryType);
		}
		methods.Generic_Methods.threadSleep(3000);
		methods.CheckOutPage.confirmOrder();
		methods.Generic_Methods.threadSleep(3000);
		if (url.equals("https://beta.bakeway.com")) {
			if (paymentMode.equalsIgnoreCase("Card")) {
				methods.PaymentPage.completeCardDetails();
			} else if (paymentMode.equalsIgnoreCase("Net Banking")) {
				methods.PaymentPage.completeNetBankingDetails();
			} else if (paymentMode.equalsIgnoreCase("Wallet")) {
				methods.PaymentPage.completeWalletDetails("OlaMoney");
			}
			methods.Generic_Methods.threadSleep(10000);
		}
	}

	@DataProvider
	public Object[][] bakeryFilter() {
		String xlsPath = "C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\src\\testData\\TestData.xlsx";
		String sheetName = "Bakery_Filter";
		Object[][] excelData = methods.Generic_Methods.getValueFromExcel(xlsPath, sheetName, 1, 9);
		return excelData;
	}

	@BeforeClass
	public String openBrowser() {
		String xlsPath = "C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\src\\testData\\TestData.xlsx";
		String sheetName = "Browser Config";
		String browserType = Generic_Methods.getCellValueFromExcel(xlsPath, sheetName, 1, 0);
		url = Generic_Methods.getCellValueFromExcel(xlsPath, sheetName, 1, 1);
		methods.PreCondition.openBrowser(xlsPath, sheetName, browserType, url);
		return url;
	}

	@AfterClass
	public void closeBrowser() {
		methods.PreCondition.closeBrowser();
	}

	@BeforeTest
	public void executionComplete() {
		System.out.println("Execution Started");
	}

	@AfterTest
	public void executionStarts() {
		System.out.println("Execution Completed");
	}

}
