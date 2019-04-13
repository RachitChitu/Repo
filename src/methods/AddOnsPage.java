package methods;

import repository.AddOns_Page;

public class AddOnsPage extends AddOns_Page {

	static String screenshotPath = "C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";

	// click on continue button
	public static void continueOrder() {
		try {
			repository.AddOns_Page.getContinueButton().click();
		} catch (Exception e) {
			System.out.println("Issue while clicking continue buttons");
			methods.Generic_Methods.getScreenshot(screenshotPath + "continueOrder.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// select first addon
	public static void selectFirstAddOn() {
		try {
			repository.AddOns_Page.getFirstAddon().click();
		} catch (Exception e) {
			System.out.println("Issue while selecting first add on");
			methods.Generic_Methods.getScreenshot(screenshotPath + "selectFirstAddOn.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

}
