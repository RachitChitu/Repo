package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class Bakery_Filter extends PreCondition {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";

	static WebElement filterHomeBaker;
	static WebElement filterAddOns;
	static WebElement filter2HourDelivery;
	static WebElement filterLateNightDelivery;
	static WebElement filterOffers;
	static WebElement filters;
	static WebElement showResults;

	// xpath/locator of homebaker filter
	public static WebElement getBakeryFiltersHomeBakers() {
		try {
			filterHomeBaker = driver.findElement(By.xpath("//li[text()='Home Baker']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery filter for Homebaker is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"bakeryByHomeBakers.jpg");
		}
		return filterHomeBaker;
	}

	// xpath/locator of addons filter
	public static WebElement getBakeryFiltersAddOns() {
		try {
			filterAddOns = driver.findElement(By.xpath("//li[text()='Add Ons']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery filter for Add Ons is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"bakeryByAddons.jpg");
		}
		return filterAddOns;
	}

	// xpath/locator of 2 hour delivery filter
	public static WebElement getBakeryFilters2HourDelivery() {
		try {
			filter2HourDelivery = driver.findElement(By.xpath("//li[text()='2 Hour Delivery']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery filter for 2 hour delivery is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"bakeryBy2hourDelivery.jpg");
		}
		return filter2HourDelivery;
	}

	// xpath/locator of late night delivery filter
	public static WebElement getBakeryFiltersLateNightDelivery() {
		try {
			filterLateNightDelivery = driver.findElement(By.xpath("//li[text()='Late Night Delivery']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery filter for Add Ons is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"bakeryByLateNightDelivery.jpg");
		}
		return filterLateNightDelivery;
	}

	// xpath/locator of offers filters
	public static WebElement getBakeryFiltersOffers() {
		try {
			filterOffers = driver.findElement(By.xpath("//li[text()='Offers']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery filter for Add Ons is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"bakeryByOffers.jpg");
		}
		return filterOffers;
	}

	// xpath/locator of offers filters
	public static WebElement getFilters() {
		try {
			filters = driver.findElement(By.xpath("//label[text()='Filters']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of filter is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"filters.jpg");
		}
		return filters;
	}

	// xpath/locator of show results button
	public static WebElement getShowResults() {
		try {
			showResults = driver.findElement(By.xpath("//input[@value='Show Results']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of filter is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"showResults.jpg");
		}
		return showResults;
	}

}
