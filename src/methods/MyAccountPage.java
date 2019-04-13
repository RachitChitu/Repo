package methods;

import repository.My_Account_Page;

public class MyAccountPage extends My_Account_Page {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";

	// go to my acoount
	public static void goToMyAccount() {
		try {
			repository.My_Account_Page.getMyAccountLink().click();
		} catch (Exception e) {
			System.out.println("Not able to go to my account");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"goToMyAccount.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// go to my orders tab
	public static void goToMyOrders() {
		try {
			repository.My_Account_Page.getMyOrdersLink().click();
		} catch (Exception e) {
			System.out.println("Not able to go to my orders tab");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"goToMyOrders.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// view latest order details
	public static void viewOrderDetails() {
		try {
			repository.My_Account_Page.getViewDetails().click();
		} catch (Exception e) {
			System.out.println("Not able to click on view details of order");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"viewOrderDetails.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// go to my profile tab
	public static void goToMyProfile() {
		try {
			repository.My_Account_Page.getMyProfileLink().click();
		} catch (Exception e) {
			System.out.println("Not able to go to my orders tab");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"goToMyProfile.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// edit profile
	public static void editProfile(String firstName, String lastName, String mobileNumber, String dateOfDob, String monthOfDob, String yearOfDob) {
		try {
			repository.My_Account_Page.getEditProfile().click();
			methods.Generic_Methods.threadSleep(2000);
			repository.My_Account_Page.getEditFirstName().clear();
			methods.Generic_Methods.threadSleep(1000);
			repository.My_Account_Page.getEditFirstName().sendKeys(firstName);
			methods.Generic_Methods.threadSleep(1000);
			repository.My_Account_Page.getEditLastName().clear();
			methods.Generic_Methods.threadSleep(1000);
			repository.My_Account_Page.getEditLastName().sendKeys(lastName);
			methods.Generic_Methods.threadSleep(1000);
			repository.My_Account_Page.getEditMobileNumber().clear();
			methods.Generic_Methods.threadSleep(1000);
			repository.My_Account_Page.getEditMobileNumber().sendKeys(mobileNumber);
			methods.Generic_Methods.threadSleep(1000);
			repository.My_Account_Page.getEditDate().clear();
			methods.Generic_Methods.threadSleep(1000);
			repository.My_Account_Page.getEditDate().sendKeys(dateOfDob);
			methods.Generic_Methods.threadSleep(1000);
			repository.My_Account_Page.getEditMonth().clear();
			methods.Generic_Methods.threadSleep(1000);
			repository.My_Account_Page.getEditMonth().sendKeys(monthOfDob);
			methods.Generic_Methods.threadSleep(1000);
			repository.My_Account_Page.getEditYear().clear();
			methods.Generic_Methods.threadSleep(1000);
			repository.My_Account_Page.getEditYear().sendKeys(yearOfDob);
			methods.Generic_Methods.threadSleep(1000);
			repository.My_Account_Page.getEditSubmit().click();
			methods.Generic_Methods.threadSleep(3000);
			methods.LoginPage.getOkButton().click();
			methods.Generic_Methods.threadSleep(10000);
		} catch (Exception e) {
			System.out.println("Not able edit profile");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"editProfile.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// logged out from account
	public static void logOut() {
		try {
			repository.My_Account_Page.getLogOut().click();
		} catch (Exception e) {
			System.out.println("Issue while logging out from account");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"logOut.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

}
