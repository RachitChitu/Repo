package methods;

import repository.Address_Page;

public class AddressPage extends Address_Page {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";
	
	//type billing address
	public static void typeBillingAddress(String firstName, String lastName, String emailId, String phoneNumber) {
		try {
			repository.Address_Page.getFirstNameBilling().sendKeys(firstName);
			repository.Address_Page.getLastNameBilling().sendKeys(lastName);
			repository.Address_Page.getEmailIdBilling().sendKeys(emailId);
			repository.Address_Page.getMobileNumberBilling().sendKeys(phoneNumber);
		} catch (Exception e) {
			System.out.println("Issue while typing billing address");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"typeBillingAddress.jpg");
			methods.PreCondition.closeBrowser();
		}

	}
	
	//type delivery address
	public static void typeDeliveryAddress(String firstName, String lastName, String phoneNumber, String flatNumber,
			String societyName) {
		try {
			repository.Address_Page.getFirstNameDelivery().sendKeys(firstName);
			repository.Address_Page.getLastNameDelivery().sendKeys(lastName);
			repository.Address_Page.getMobileNumberDelivery().sendKeys(phoneNumber);
			repository.Address_Page.getFlatNumberDelivery().sendKeys(flatNumber);
			repository.Address_Page.getSocietyNameDelivery().sendKeys(societyName);
			methods.Generic_Methods.threadSleep(2000);
			repository.Address_Page.getSocietyNameAuto().click();
		} catch (Exception e) {
			System.out.println("Issue while typing delivery address");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"typeDeliveryAddress.jpg");
			methods.PreCondition.closeBrowser();
		}

	}

	//select delivery and billing address same
	public static void sameBillingDelivery() {
		try {
			repository.Address_Page.getSameBillingDeliveryCheckbox().click();
		} catch (Exception e) {
			System.out.println("Issue while selecting checkbox");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"sameBillingDelivery.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	//click on continue button and go to check out page
	public static void goToCheckOutPage() {
		try {
			repository.Address_Page.getContinueButton().click();
		} catch (Exception e) {
			System.out.println("Issue in clicking the continue button");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"goToCheckOutPage.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

}
