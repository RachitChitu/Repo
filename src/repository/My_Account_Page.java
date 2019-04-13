package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class My_Account_Page extends PreCondition {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";

	static WebElement myAccountLink;
	static WebElement myOrdersLink;
	static WebElement viewDetails;
	static WebElement myProfileLink;
	static WebElement editProfile;
	static WebElement editFirstName;
	static WebElement editLastName;
	static WebElement editMobileNumber;
	static WebElement editDate;
	static WebElement editMonth;
	static WebElement editYear;
	static WebElement editSubmit;
	static WebElement logOut;

	// xpath/locator of my account link
	public static WebElement getMyAccountLink() {
		try {
			myAccountLink = driver.findElement(By.xpath("//a[.='My Account']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of my account link is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"myAccountLink.jpg");
		}
		return myAccountLink;

	}

	// xpath/locator of my orders link
	public static WebElement getMyOrdersLink() {
		try {
			myOrdersLink = driver.findElement(By.xpath("// label[.=' My Orders']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of my orders link is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"myOrdersLink.jpg");
		}
		return myOrdersLink;

	}

	// xpath/locator of viewDetails button
	public static WebElement getViewDetails() {
		try {
			viewDetails = driver.findElement(By.xpath("//button[.='View Details']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of viewDetails is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"viewDetails.jpg");
		}
		return viewDetails;
	}

	// xpath/locator of my profile link
	public static WebElement getMyProfileLink() {
		try {
			myProfileLink = driver.findElement(By.xpath("//label[text()=' My Profile']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of my profile link is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"myProfileLink.jpg");
		}
		return myProfileLink;
	}

	// xpath/locator of editProfile link
	public static WebElement getEditProfile() {
		try {
			editProfile = driver.findElement(By.xpath("//button[@class='editProfile']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of edit Profile link is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"editProfile.jpg");
		}
		return editProfile;
	}

	// xpath/locator of editFirstName link
	public static WebElement getEditFirstName() {
		try {
			editFirstName = driver.findElement(By.xpath("//input[@class='firstName']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of edit FirstName is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"editFirstName.jpg");
		}
		return editFirstName;
	}

	// xpath/locator of edit LastName link
	public static WebElement getEditLastName() {
		try {
			editLastName = driver.findElement(By.xpath("//input[@class='lastName']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of edit LastName is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"editLastName.jpg");
		}
		return editLastName;
	}

	// xpath/locator of edit MobileNumber link
	public static WebElement getEditMobileNumber() {
		try {
			editMobileNumber = driver.findElement(By.xpath("//input[@class='number']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of edit MobileNumber is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"editMobileNumber.jpg");
		}
		return editMobileNumber;
	}

	// xpath/locator of edit Date
	public static WebElement getEditDate() {
		try {
			editDate = driver.findElement(By.xpath("//input[@class='dd']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of edit Date is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"editDate.jpg");
		}
		return editDate;
	}

	// xpath/locator of edit Month
	public static WebElement getEditMonth() {
		try {
			editMonth = driver.findElement(By.xpath("//input[@class='mm']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of edit Month is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"editMonth.jpg");
		}
		return editMonth;
	}

	// xpath/locator of edit Year link
	public static WebElement getEditYear() {
		try {
			editYear = driver.findElement(By.xpath("//input[@class='yyyy']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of edit Year is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"editYear.jpg");
		}
		return editYear;
	}

	// xpath/locator of editSubmit button
	public static WebElement getEditSubmit() {
		try {
			editSubmit = driver.findElement(By.xpath("//input[@class='saveProfile submit']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of edit Submit is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"editSubmit.jpg");
		}
		return editSubmit;
	}

	// xpath/locator of log out link
	public static WebElement getLogOut() {
		try {
			logOut = driver.findElement(By.xpath("//label[.=' Logout']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of log out is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"logOut.jpg");
		}
		return logOut;

	}

}
