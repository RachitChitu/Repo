package testCase;

import org.testng.annotations.Test;

import methods.Generic_Methods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class OrderCakeWithAddOnGuestUser {

	String url;

	@Test(dataProvider = "testDataGuest")
	public void orderCakeGuestUserDesktop(String city, String location, String bakeryName, String cakeName,
			String deliveryType, String paymentMode, String deliveryDate, String deliveryTime) {
		methods.Generic_Methods.threadSleep(3000);
		methods.HomePage.selectCity(city);
		utilities.Assertion.verifyHomePage(url, city);
		methods.HomePage.typeLocation(location);
		methods.Generic_Methods.threadSleep(2000);
		methods.HomePage.selectFirstAutoSuggestion();
		methods.Generic_Methods.threadSleep(3000);
		utilities.Assertion.verifyBakeryListingPage(url, city, location);
		methods.Generic_Methods.waitForElement(repository.Bakery_Listing_Page.getBakeryByName(bakeryName));
		methods.BakeryListingPage.selectBakeryByName(bakeryName);
		methods.Generic_Methods.threadSleep(3000);
		utilities.Assertion.verifyBakeryProductListingPage(url, city, location, bakeryName);
		methods.Generic_Methods.waitForElement(repository.Cake_Listing_Page.getCakeByName(cakeName));
		methods.CakeListingPage.selectCakeByName(cakeName);
		methods.Generic_Methods.threadSleep(5000);
		String pdpPageUrl=utilities.Assertion.verifyPdpPage(url, city, location, cakeName, bakeryName);
		methods.ProductDescriptionPage.selectDeliveryType(deliveryType);
		methods.Generic_Methods.threadSleep(3000);
		methods.ProductDescriptionPage.selectFlavour(1);
		methods.ProductDescriptionPage.uploadPhoto("C:\\Users\\Guest User\\Desktop\\frog.jpg");
		if (!deliveryDate.equalsIgnoreCase("null"))
		{
			methods.ProductDescriptionPage.selectDeliveryDate(deliveryDate);
		}
		if (!deliveryTime.equalsIgnoreCase("null"))
		{
			methods.ProductDescriptionPage.selectDeliveryTime(deliveryTime);
		}
		methods.Generic_Methods.threadSleep(3000);
		methods.Generic_Methods.waitForElement(repository.Product_Description_Page.getOrderNow());
		methods.ProductDescriptionPage.goToAddressPage();
		methods.Generic_Methods.threadSleep(3000);
		String pageUrl = methods.PreCondition.driver.getCurrentUrl();
		if (pageUrl.contains("page=addons")) {
			methods.AddOnsPage.selectFirstAddOn();
			utilities.Assertion.verifyAddOnsPage(pdpPageUrl, deliveryType);
			methods.Generic_Methods.threadSleep(2000);
			methods.AddOnsPage.continueOrder();
			methods.Generic_Methods.threadSleep(3000);
		}
		methods.AddressPage.typeBillingAddress("Rachit", "Sinha", "Rachit@relfor.com", "1234567890");
		utilities.Assertion.verifyBillingPage(pdpPageUrl);
		if (deliveryType.contains("Delivery")) {
			methods.AddressPage.typeDeliveryAddress("Rachit", "Sinha", "1234567890", "12", location);
		}
		methods.Generic_Methods.threadSleep(3000);
		methods.AddressPage.goToCheckOutPage();
		methods.CheckOutPage.selectPaymentMode(paymentMode);
		utilities.Assertion.verifyCheckOutPage(pdpPageUrl, deliveryType);
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
	public Object[][] testDataGuest() {
		String xlsPath = "C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\src\\testData\\TestData.xlsx";
		String sheetName = "Guest User AddOn";
		Object[][] excelData = methods.Generic_Methods.getValueFromExcel(xlsPath, sheetName, 1, 8);
		return excelData;
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

	@BeforeTest
	public void executionComplete() {
		System.out.println("Execution Started");
	}

	@AfterTest
	public void executionStarts() {
		System.out.println("Execution Completed");
	}

}
