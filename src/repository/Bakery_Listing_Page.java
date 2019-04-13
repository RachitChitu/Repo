package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class Bakery_Listing_Page extends PreCondition {

	static String screenshotPath = "C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";

	static WebElement bakeryByIndex;
	static WebElement bakeryByName;
	static WebElement bakeriesTab;
	static WebElement cakesTab;
	static WebElement bakeryCategoryFlavor;
	static WebElement bakeryCategoryFlavorMobile;
	static WebElement selectBakeryCategoryFlavor;
	static String firstIndexBakeryName;

	// xpath/locator of bakery by name
	public static WebElement getBakeryByName(String bakeryName) {
		try {
			bakeryByName = driver.findElement(By.xpath("//img[@title='" + bakeryName + "']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery selection is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryByName.jpg");
		}
		return bakeryByName;

	}

	// xpath/locator of bakery by index
	public static WebElement getBakeryByIndex(int bakeryIndex) {
		try {
			bakeryByIndex = driver.findElement(By.xpath("//section[@class='vendorList']/ul/li[" + bakeryIndex + "]"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery selection is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryByIndex.jpg");
		}
		return bakeryByIndex;

	}

	// xpath/locator of bakery tab
	public static WebElement getBakeriesTab() {
		try {
			bakeriesTab = driver.findElement(By.xpath("// input[@value='Bakeries']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery tab is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeriesTab.jpg");
		}
		return bakeriesTab;

	}

	// xpath/locator of cakes tab
	public static WebElement getCakesTab() {
		try {
			cakesTab = driver.findElement(By.xpath("//a[.='Cakes']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cakes tab is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "cakesTab.jpg");
		}
		return cakesTab;

	}

	// Xpath/locator of Search by Bakery or Category or Flavor
	public static WebElement getSearchByBakeryCategoryFlavorBeforeValuePassed() {
		try {
			bakeryCategoryFlavor = driver.findElement(By.xpath("//input[@placeholder='Type Bakery Name or Flavour']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakeryCategoryFlavor searchbox is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryCategoryFlavor.jpg");
		}
		return bakeryCategoryFlavor;

	}

	// Xpath/locator of Search by Bakery or Category or Flavor
	public static WebElement getSearchByBakeryCategoryFlavorAfterValuePassed() {
		try {
			bakeryCategoryFlavor = driver
					.findElement(By.xpath("//input[@placeholder='Type Bakery Name or Flavour' and @type='search']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakeryCategoryFlavor searchbox is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryCategoryFlavor2.jpg");
		}
		return bakeryCategoryFlavor;

	}

	// xpath/locator of first auto suggestion shown for brand, category and flavor
	public static WebElement getSelectBakeryCategoryFlavor() {
		try {
			selectBakeryCategoryFlavor = driver
					.findElement(By.xpath("//div[@class='searchResult flexcroll active']/ul/li/ul/li[1]"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of select Bakery or Flavor is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "selectBakeryCategoryFlavor.jpg");
		}
		return selectBakeryCategoryFlavor;

	}

	// xpath/locator of bakeryCategoryFlavorMobile search icon
	public static WebElement getBakeryCategoryFlavorMobile() {
		try {
			bakeryCategoryFlavorMobile = driver
					.findElement(By.xpath("//div[@class='globalSearchWrapper ']/label[@class='searchIcon']/span"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakeryCategoryFlavorMobile search icon is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryCategoryFlavorMobile.jpg");
		}
		return bakeryCategoryFlavorMobile;

	}

	// xpath/locator of firstIndexBakeryName
	public static String getFirstIndexBakeryName() {
		try {
			firstIndexBakeryName = driver
					.findElement(By.xpath("//label[@class='bakeryName']")).getText();
		} catch (Exception e) {
			System.out.println("XPath/Locator of firstIndexBakeryName is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "firstIndexBakeryName.jpg");
		}
		return firstIndexBakeryName;

	}

	
}
