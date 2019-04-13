package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class AddOns_Page extends PreCondition {

	static String screenshotPath = "C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";

	static WebElement continueButton;
	static WebElement firstAddon;

	// xpath/locator of continueButton
	public static WebElement getContinueButton() {
		try {
			continueButton = driver.findElement(By.xpath("//button[.='Continue']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of continue Button is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "continueButton.jpg");
		}
		return continueButton;
	}

	// xpath/locator of firstAddon
	public static WebElement getFirstAddon() {
		try {
			firstAddon = driver.findElement(By.xpath("(//button[.='ADD'])[1]"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of firstAddon is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "firstAddon.jpg");
		}
		return firstAddon;
	}

}
