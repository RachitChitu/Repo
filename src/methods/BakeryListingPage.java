package methods;

import repository.Bakery_Listing_Page;

public class BakeryListingPage extends Bakery_Listing_Page {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";

	// select bakery by name
	public static void selectBakeryByName(String bakeryName) {
		try {
			repository.Bakery_Listing_Page.getBakeryByName(bakeryName).click();
		} catch (Exception e) {
			System.out.println("Not able to select bakery");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"selectBakeryByName.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// select bakery by index
	public static void selectBakeryByIndex(int bakeryIndex) {
		try {
			repository.Bakery_Listing_Page.getBakeryByIndex(bakeryIndex).click();
		} catch (Exception e) {
			System.out.println("Not able to select bakery");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"selectBakeryByIndex.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// go to cake tab
	public static void goToCakeTab() {
		try {
			repository.Bakery_Listing_Page.getCakesTab().click();
		} catch (Exception e) {
			System.out.println("Not able to go to cake tab");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"goToCakeTab.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// search bakeryCategoryFlavor by passing the same as parameter for desktop mode
	public static void searchBakeryCategoryFlavor(String bakeryCategoryFlavor) {
		try {
			repository.Bakery_Listing_Page.getSearchByBakeryCategoryFlavorBeforeValuePassed().click();
			repository.Bakery_Listing_Page.getSearchByBakeryCategoryFlavorAfterValuePassed()
					.sendKeys(bakeryCategoryFlavor);
			methods.Generic_Methods.threadSleep(3000);
			repository.Bakery_Listing_Page.getSelectBakeryCategoryFlavor().click();
		} catch (Exception e) {
			System.out.println("Not able to search flavour, brand or category");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"typeLocation.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// search bakeryCategoryFlavor by passing the same as parameter for mobile mode
	public static void searchBakeryCategoryFlavorMobile(String bakeryCategoryFlavor) {
		try {
			repository.Bakery_Listing_Page.getBakeryCategoryFlavorMobile().click();
			repository.Bakery_Listing_Page.getSearchByBakeryCategoryFlavorAfterValuePassed()
					.sendKeys(bakeryCategoryFlavor);
			methods.Generic_Methods.threadSleep(5000);
			repository.Bakery_Listing_Page.getSelectBakeryCategoryFlavor().click();
		} catch (Exception e) {
			System.out.println("Not able to search flavour, brand or category");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"typeLocation.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

}
