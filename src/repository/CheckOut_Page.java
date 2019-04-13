package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class CheckOut_Page extends PreCondition {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";

	static WebElement couponCodeTextBox;
	static WebElement applyButton;
	static WebElement paytm;
	static WebElement card;
	static WebElement netBanking;
	static WebElement wallet;
	static WebElement upi;
	static WebElement proceedPayment;

	// xpath/locator of coupon Code TextBox
	public static WebElement getCouponCodeTextBox(){
		try {
			couponCodeTextBox = driver.findElement(By.xpath("//input[@placeholder='Enter coupon code here']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of couponCodeTextBox is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"couponCodeTextBox.jpg");
		}
		return couponCodeTextBox;

	}

	// xpath/locator of apply Button
	public static WebElement getApplyButton() {
		try {
			applyButton = driver.findElement(By.xpath("//input[@type='submit']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of applyButton is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"applyButton.jpg");
		}
		return applyButton;

	}

	// xpath/locator of paytm
	public static WebElement getPaytm() {
		try {
			paytm = driver.findElement(By.xpath("//button[@id='paytm']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of paytm is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath+"paytm.jpg");
		}
		return paytm;

	}

	// xpath/locator of card
	public static WebElement getCard() {
		try {
			card = driver.findElement(By.xpath("//span[.='Card']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of card is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath+"card.jpg");
		}
		return card;

	}

	// xpath/locator of net Banking
	public static WebElement getNetBanking() {
		try {
			netBanking = driver.findElement(By.xpath("//span[.='Net Banking']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of netBanking is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"netBanking.jpg");
		}
		return netBanking;

	}

	// xpath/locator of wallet
	public static WebElement getWallet() {
		try {
			wallet = driver.findElement(By.xpath("//span[.='Wallet']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of wallet is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath+"wallet.jpg");
		}
		return wallet;

	}

	// xpath/locator of upi
	public static WebElement getUpi() {
		try {
			upi = driver.findElement(By.xpath("//span[.='UPI']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of upi is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath+"upi.jpg");
		}
		return upi;

	}

	// xpath/locator of upi
	public static WebElement getProceedPayment() {
		try {
			proceedPayment = driver.findElement(By.xpath("// button[@class='proceed null']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of proceedPayment is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"proceedPayment.jpg");
		}
		return proceedPayment;

	}

}
