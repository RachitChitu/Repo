package repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class Product_Description_Page extends PreCondition {

	static String screenshotPath = "C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";

	static WebElement delivery;
	static WebElement pickUp;
	static WebElement messageOnCake;
	static WebElement messageOnCard;
	static WebElement notesToBakery;
	static WebElement orderNow;
	static WebElement selectStoreDropdown;
	static WebElement firstStore;
	static WebElement calendar;
	static WebElement nextMonth;
	static WebElement previousMonth;
	static WebElement date;
	static WebElement deliveryTime;
	static List<WebElement> dropdown;
	static int dropdownCount;
	static WebElement flavour;
	static WebElement photoUpload;
	static int photoUploadVerify;
	static String productName;
	static String bakeryName;

	// type location in textbox at PDP page
	public static void typeLocationAtPdp(String locationName) {
		try {
			repository.Home_Page.getLocation2().sendKeys(locationName);
		} catch (Exception e) {
			System.out.println("Not able to type location in textbox");
			methods.Generic_Methods.getScreenshot(screenshotPath + "typeLocation.jpg");

		}
	}

	// xpath/locator of delivery
	public static WebElement getDelivery() {
		try {
			delivery = driver.findElement(By.xpath("//label[.='Delivery']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of delivery is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "delivery.jpg");
		}
		return delivery;

	}

	// xpath/locator of pick up
	public static WebElement getPickUp() {
		try {
			pickUp = driver.findElement(By.xpath("//label[.='Pick Up']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of pickup is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "pickUp.jpg");
		}
		return pickUp;

	}

	// xpath/locator of selectStoreDropdown
	public static WebElement getSelectStoreDropdown() {
		try {
			selectStoreDropdown = driver.findElement(By.xpath("//p[.='Please Select Store']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of selectStore Dropdown is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "selectStoreDropdown.jpg");
		}
		return selectStoreDropdown;

	}

	// xpath/locator of firstStore from drop-down
	public static WebElement getFirstStore() {
		try {
			firstStore = driver.findElement(By.xpath("// ul[@class='storeSelection active']/li[1]"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of firstStore is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "firstStore.jpg");
		}
		return firstStore;

	}

	// xpath/locator of message on cake
	public static WebElement getMessageOnCake() {
		try {
			messageOnCake = driver.findElement(By.xpath("//input[@placeholder='Happy Birthday']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of messageOnCake is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "messageOnCake.jpg");
		}
		return messageOnCake;

	}

	// xpath/locator of message on card
	public static WebElement getMessageOnCard() {
		try {
			messageOnCard = driver.findElement(By.xpath("//input[@placeholder='Max 120 Characters']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of message on card is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "messageOnCard.jpg");
		}
		return messageOnCard;

	}

	// xpath/locator of notes to bakery
	public static WebElement getNotesToBakery() {
		try {
			notesToBakery = driver.findElement(By.xpath("//textarea[@placeholder='Max 140 Characters']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of notes to Bakery is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "notesToBakery.jpg");
		}
		return notesToBakery;

	}

	// xpath/locator of order now button
	public static WebElement getOrderNow() {
		try {
			orderNow = driver.findElement(By.xpath("//input[@value='Order Now']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of order now button is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "orderNow.jpg");
		}
		return orderNow;
	}

	// Xpath/Locator for calendar
	public static WebElement getCalendar() {
		try {
			calendar = driver.findElement(By.xpath("//input[@placeholder='YYYY-M-D']"));
		} catch (Exception e) {
			System.out.println("Issue in Xpath/locator of opening calendar ");
			methods.Generic_Methods.getScreenshot(screenshotPath + "calendar.jpg");
		}
		return calendar;
	}

	// Xpath/Locator for next month
	public static WebElement getNextMonth() {
		try {
			nextMonth = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
		} catch (Exception e) {
			System.out.println("Issue in Xpath/locator of selecting next month of calendar ");
			methods.Generic_Methods.getScreenshot(screenshotPath + "nextMonth.jpg");
		}
		return nextMonth;
	}

	// Xpath/Locator for previous month
	public static WebElement getPreviousMonth() {
		try {
			previousMonth = driver
					.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--prev']"));
		} catch (Exception e) {
			System.out.println("Issue in Xpath/locator of selecting previous month of calendar ");
			methods.Generic_Methods.getScreenshot(screenshotPath + "previousMonth.jpg");
		}
		return previousMonth;
	}

	// Xpath/Locator for date of month
	public static WebElement getDate(String deliveryDate) {
		try {
			date = driver.findElement(By.xpath("//div[@aria-label='" + deliveryDate + "']"));
		} catch (Exception e) {
			System.out.println("Issue in Xpath/locator of date of month from calendar ");
			methods.Generic_Methods.getScreenshot(screenshotPath + "date.jpg");
		}
		return date;
	}

	// Xpath/Locator for selecting delivery time
	public static WebElement getDeliveryTime() {
		try {
			deliveryTime = driver.findElement(By.xpath("//p[@class='timing']/select"));
		} catch (Exception e) {
			System.out.println("Issue in Xpath/locator of delivery time drop-down ");
			methods.Generic_Methods.getScreenshot(screenshotPath + "deliveryTime.jpg");
		}
		return deliveryTime;

	}

	// xpath locator of dropdown count to verify whether flavor needs to be select
	// or not
	public static int getDropdownCount() {
		try {
			dropdown = driver.findElements(By.xpath("//div[@class='cakeConfig']/select"));
			dropdownCount = dropdown.size();
		} catch (Exception e) {
			System.out.println("Issue in Xpath/locator of dropdownCount");
			methods.Generic_Methods.getScreenshot(screenshotPath + "dropdownCount.jpg");
		}
		return dropdownCount;
	}

	// xpath locator of flavour
	public static WebElement getFlavour() {
		try {
			flavour = driver.findElement(By.xpath("//div[@class='cakeConfig']/select[1]"));
		} catch (Exception e) {
			System.out.println("Issue in Xpath/locator of flavour");
			methods.Generic_Methods.getScreenshot(screenshotPath + "flavour.jpg");
		}
		return flavour;
	}

	// xpath locator of photoUpload button/option
	public static WebElement getPhotoUpload() {
		try {
			photoUpload = driver.findElement(By.xpath("//input[@accept='image/x-png,image/gif,image/jpeg']"));
		} catch (Exception e) {
			System.out.println("Issue in Xpath/locator of photoUpload");
			methods.Generic_Methods.getScreenshot(screenshotPath + "photoUpload.jpg");
		}
		return photoUpload;
	}

	// verify xpath/locator of photo upload option
	public static int getPhotoUploadVerify() {
		try {
			photoUploadVerify = driver.findElements(By.xpath("//input")).size();
		} catch (Exception e) {
			System.out.println("Issue in verifying Xpath/locator of photoUpload");
			methods.Generic_Methods.getScreenshot(screenshotPath + "photoUploadVerify.jpg");
		}
		return photoUploadVerify;
	}

	// xpath/locator of product name
	public static String getProductName() {
		try {
			productName = driver.findElement(By.xpath("//h1[@for='productName']")).getText();
		} catch (Exception e) {
			System.out.println("XPath/Locator of productName is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "productName.jpg");
		}
		return productName;

	}

	// xpath locator of bakery name
	public static String getBakeryName() {
		try {
			String sellerLabel = driver.findElement(By.xpath("//label[@for='seller']")).getText();
			String[] sellerLabel1 = sellerLabel.split(",");
			bakeryName = sellerLabel1[0];
		} catch (Exception e) {
			System.out.println("Issue in Xpath/locator of bakeryName");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryName.jpg");
		}
		return bakeryName;
	}
}
