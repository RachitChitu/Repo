package methods;

import repository.Cake_Listing_Page;

public class CakeListingPage extends Cake_Listing_Page {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";

	// select cake by name
	public static void selectCakeByName(String cakeName) {
		try {
			repository.Cake_Listing_Page.getCakeByName(cakeName).click();
		} catch (Exception e) {
			System.out.println("Not able to select cake");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"selectCakeByName.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// select cake by name
	public static void selectCakeByIndex(int cakeIndex) {
		try {
			repository.Cake_Listing_Page.getCakeByIndex(cakeIndex).click();
		} catch (Exception e) {
			System.out.println("Not able to select cake");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"selectCakeByIndex.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

}
