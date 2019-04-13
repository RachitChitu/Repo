package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class Cake_Listing_Page extends PreCondition {

	static String screenshotPath = "C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";

	static WebElement cakeByName;
	static WebElement cakeByIndex;

	// xpath/locator of cake by name
	public static WebElement getCakeByName(String cakeName) {
		try {
			cakeByName = driver.findElement(By.xpath("//img[@title='" + cakeName + "']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "cakeByName.jpg");
		}
		return cakeByName;

	}

	// xpath/locator of cake By Index
	public static WebElement getCakeByIndex(int cakeIndex) {
		try {
			cakeByIndex = driver
					.findElement(By.xpath("//section[@class='vendorList productList']/ul/li[" + cakeIndex + "]"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "cakeByIndex.jpg");
		}
		return cakeByIndex;

	}

}
