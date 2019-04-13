package methods;

import org.openqa.selenium.support.ui.Select;

import repository.Product_Description_Page;

public class ProductDescriptionPage extends Product_Description_Page {

	static String screenshotPath = "C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";

	// select delivery type
	public static void selectDeliveryType(String deliveryType) {
		try {
			if (deliveryType.equalsIgnoreCase("Delivery")) {
				repository.Product_Description_Page.getMessageOnCard().click();
				repository.Product_Description_Page.getDelivery().click();
			} else if (deliveryType.equalsIgnoreCase("PickUp")) {
				repository.Product_Description_Page.getMessageOnCard().click();
				repository.Product_Description_Page.getPickUp().click();
			}
		} catch (Exception e) {
			System.out.println("Issue while selecting delivery type");
			methods.Generic_Methods.getScreenshot(screenshotPath + "selectDeliveryType.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	public static void selectFirstPickUpStore() {
		try {
			repository.Product_Description_Page.getSelectStoreDropdown().click();
			repository.Product_Description_Page.getFirstStore().click();
		} catch (Exception e) {
			System.out.println("Issue on selecting pick up store from drop-down");
			methods.Generic_Methods.getScreenshot(screenshotPath + "selectFirstPickUpStore.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// type cake message
	public static void typeMessageOnCake(String messageOnCake) {
		try {
			repository.Product_Description_Page.getMessageOnCake().sendKeys(messageOnCake);
		} catch (Exception e) {
			System.out.println("Issue on typing cake message on text box");
			methods.Generic_Methods.getScreenshot(screenshotPath + "typeMessageOnCake.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// type card message
	public static void typeMessageOnCard(String messageOnCard) {
		try {
			repository.Product_Description_Page.getMessageOnCard().sendKeys(messageOnCard);
		} catch (Exception e) {
			System.out.println("Issue on typing card message on text box");
			methods.Generic_Methods.getScreenshot(screenshotPath + "typeMessageOnCard.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// type bakery notes
	public static void typeNotesToBakery(String notesToBakery) {
		try {
			repository.Product_Description_Page.getNotesToBakery().sendKeys(notesToBakery);
		} catch (Exception e) {
			System.out.println("Issue on typing notes to bakery on text box");
			methods.Generic_Methods.getScreenshot(screenshotPath + "typeNotesToBakery.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// click on order now button
	public static void goToAddressPage() {
		try {
			repository.Product_Description_Page.getOrderNow().click();
		} catch (Exception e) {
			System.out.println("Not able to click on order now button");
			methods.Generic_Methods.getScreenshot(screenshotPath + "goToAddressPage.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// select delivery date
	public static void selectDeliveryDate(String deliveryDate) {
		try {
			repository.Product_Description_Page.getCalendar().click();
			methods.Generic_Methods.threadSleep(2000);
			repository.Product_Description_Page.getDate(deliveryDate).click();
		} catch (Exception e) {
			System.out.println("Issue while selecting delivery date from calendar");
			methods.Generic_Methods.getScreenshot(screenshotPath + "selectDeliveryDate.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// select delivery date of next month
	public static void selectDeliveryDateNextMonth(String deliveryDate) {
		try {
			repository.Product_Description_Page.getCalendar().click();
			repository.Product_Description_Page.getNextMonth().click();
			methods.Generic_Methods.threadSleep(2000);
			repository.Product_Description_Page.getDate(deliveryDate).click();
		} catch (Exception e) {
			System.out.println("Issue while selecting delivery date from calendar");
			methods.Generic_Methods.getScreenshot(screenshotPath + "selectDeliveryDate.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// select delivery date of previous month
	public static void selectDeliveryDatePreviousDate(String deliveryDate) {
		try {
			repository.Product_Description_Page.getCalendar().click();
			repository.Product_Description_Page.getNextMonth().click();
			methods.Generic_Methods.threadSleep(2000);
			repository.Product_Description_Page.getDate(deliveryDate).click();
		} catch (Exception e) {
			System.out.println("Issue while selecting delivery date from calendar");
			methods.Generic_Methods.getScreenshot(screenshotPath + "selectDeliveryDate.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// select delivery time
	public static void selectDeliveryTime(String deliveryTime) {
		try {
			Select deliveryTimeDropdown = new Select(repository.Product_Description_Page.getDeliveryTime());
			deliveryTimeDropdown.selectByVisibleText(deliveryTime);
		} catch (Exception e) {
			System.out.println("Issue while selecting delivery timing");
			methods.Generic_Methods.getScreenshot(screenshotPath + "selectDeliveryTime.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// select flavor
	public static void selectFlavour(int flavourIndex) {
		try {
			if (repository.Product_Description_Page.getDropdownCount() > 1) {
				Select flavour = new Select(repository.Product_Description_Page.getFlavour());
				flavour.selectByIndex(flavourIndex);
				System.out.println("flavor selected");
			}
		} catch (Exception e) {
			System.out.println("Issue while selecting flavourName");
			methods.Generic_Methods.getScreenshot(screenshotPath + "flavourName.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// upload photo
	public static void uploadPhoto(String photoPath) {
		try {
			if (repository.Product_Description_Page.getPhotoUploadVerify() > 7) {
				repository.Product_Description_Page.getPhotoUpload().sendKeys(photoPath);
			}
		} catch (Exception e) {
			System.out.println("Issue while uploading photo");
			methods.Generic_Methods.getScreenshot(screenshotPath + "uploadPhoto.jpg");
			methods.PreCondition.closeBrowser();
		}
	}
}
