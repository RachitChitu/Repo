package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class Payment_Page extends PreCondition {

	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";
	
	static WebElement razorPayIframe;
	static WebElement otpField;
	static WebElement savedCvv;
	static WebElement verifyButton;
	static WebElement kotakBank;
	static WebElement payZapp;
	static WebElement olaMoney;
	static WebElement freeCharge;
	static WebElement successButton;

	// xpath/locator of razorPay Iframe
	public static WebElement getRazorPayIframe() {
		try {
			razorPayIframe = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of razorPay Iframe is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"razorPayIframe.jpg");
		}
		return razorPayIframe;

	}

	// xpath/locator of otp input Field
	public static WebElement getOtpField() {
		try {
			otpField = driver.findElement(By.xpath("//input[@id='otp']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of otp input Field is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"otpField.jpg");
		}
		return otpField;

	}

	// xpath/locator of CVV field
	public static WebElement getSavedCvv() {
		try {
			savedCvv = driver.findElement(By.xpath("//input[@class='saved-cvv']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of saved Cvv Field is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"savedCvv.jpg");
		}
		return savedCvv;

	}

	// xpath/locator of verify Button
	public static WebElement getVerifyButton() {
		try {
			verifyButton = driver.findElement(By.xpath("//button[@id='footer'and@type='submit']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of Verify button is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"verifyButton.jpg");
		}
		return verifyButton;

	}

	// xpath/locator of kotak Bank
	public static WebElement getKotakBank() {
		try {
			kotakBank = driver.findElement(By.xpath("//label[@for='bank-radio-KKBK']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of kotak Bank is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"kotakBank.jpg");
		}
		return kotakBank;

	}

	// xpath/locator of pay Zapp
	public static WebElement getPayZapp() {
		try {
			payZapp = driver.findElement(By.xpath("//label[@for='wallet-radio-payzapp']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of pay Zapp is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"payZapp.jpg");
		}
		return payZapp;

	}

	// xpath/locator of ola Money
	public static WebElement getOlaMoney() {
		try {
			olaMoney = driver.findElement(By.xpath("//label[@for='wallet-radio-olamoney']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of ola Money is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"olaMoney.jpg");
		}
		return olaMoney;

	}

	// xpath/locator of free Charge
	public static WebElement getFreeCharge() {
		try {
			freeCharge = driver.findElement(By.xpath("//label[@for='wallet-radio-freecharge']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of free Charge is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"freeCharge.jpg");
		}
		return freeCharge;

	}

	// xpath/locator of Success button
	public static WebElement getSuccessButton() {
		try {
			successButton = driver.findElement(By.xpath("//button[.='Success']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of success Button is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"successButton.jpg");
		}
		return successButton;

	}

}
