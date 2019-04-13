package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class Address_Page extends PreCondition {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";

	static WebElement firstNameBilling;
	static WebElement lastNameBilling;
	static WebElement emailIdBilling;
	static WebElement mobileNumberBilling;
	static WebElement sameBillingDeliveryCheckbox;
	static WebElement firstNameDelivery;
	static WebElement lastNameDelivery;
	static WebElement mobileNumberDelivery;
	static WebElement flatNumberDelivery;
	static WebElement societyNameDelivery;
	static WebElement societyNameAuto;
	static WebElement continueButton;

	// xpath/locator of first name billing address text box
	public static WebElement getFirstNameBilling() {
		try {
			firstNameBilling = driver.findElement(By.xpath("//input[@name='sender.firstname']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of firstNameBilling textfield is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"firstNameBilling.jpg");
		}
		return firstNameBilling;

	}

	// xpath/locator of last name billing address text box
	public static WebElement getLastNameBilling() {
		try {
			lastNameBilling = driver.findElement(By.xpath("//input[@name='sender.lastName']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of lastNameBilling textfield is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"lastNameBilling.jpg");
		}
		return lastNameBilling;

	}

	// xpath/locator of email id text box
	public static WebElement getEmailIdBilling() {
		try {
			emailIdBilling = driver.findElement(By.xpath("//input[@name='sender.email']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of emailIdBilling textfield is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"emailIdBilling.jpg");
		}
		return emailIdBilling;

	}

	// xpath/locator of mobile number text box
	public static WebElement getMobileNumberBilling() {
		try {
			mobileNumberBilling = driver.findElement(By.xpath("//input[@name='sender.telephone']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of mobileNumberBilling textfield is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"mobileNumberBilling.jpg");
		}
		return mobileNumberBilling;

	}

	// xpath/locator of Same Billing Delivery Checkbox
	public static WebElement getSameBillingDeliveryCheckbox() {
		try {
			sameBillingDeliveryCheckbox = driver.findElement(By.xpath("// span[@class='icon ']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of sameBillingDelivery Checkbox is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"sameBillingDeliveryCheckbox.jpg");
		}
		return sameBillingDeliveryCheckbox;

	}

	// xpath/locator of first name delivery address text box
	public static WebElement getFirstNameDelivery() {
		try {
			firstNameDelivery = driver.findElement(By.xpath("//input[@name='recipient.firstname']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of firstNameDelivery textfield is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"firstNameDelivery.jpg");
		}
		return firstNameDelivery;

	}

	// xpath/locator of last name billing address text box
	public static WebElement getLastNameDelivery() {
		try {
			lastNameDelivery = driver.findElement(By.xpath("//input[@name='recipient.lastname']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of lastNameDelivery textfield is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"lastNameDelivery.jpg");
		}
		return lastNameDelivery;

	}

	// xpath/locator of mobile number delivery text box
	public static WebElement getMobileNumberDelivery() {
		try {
			mobileNumberDelivery = driver.findElement(By.xpath("//input[@name='recipient.telephone']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of mobileNumberDelivery textfield is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"mobileNumberDelivery.jpg");
		}
		return mobileNumberDelivery;

	}

	// xpath/locator of flat number delivery text box
	public static WebElement getFlatNumberDelivery() {
		try {
			flatNumberDelivery = driver.findElement(By.xpath("//input[@name='recipient.street.0']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of flatNumberDelivery textfield is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"flatNumberDelivery.jpg");
		}
		return flatNumberDelivery;

	}

	// xpath/locator of society name delivery text box
	public static WebElement getSocietyNameDelivery() {
		try {
			societyNameDelivery = driver.findElement(By.xpath("//input[@name='recipient.street.2']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of society Delivery textfield is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"societyNameDelivery.jpg");
		}
		return societyNameDelivery;

	}
	
	// xpath/locator of society name delivery text box
		public static WebElement getSocietyNameAuto() {
			try {
				societyNameAuto = driver.findElement(By.xpath("//div[@class='geosuggest__suggests-wrapper']/ul/li[1]/span"));
			} catch (Exception e) {
				System.out.println("XPath/Locator of societyNameAuto suggestion dropdown is not correct");
				methods.Generic_Methods
						.getScreenshot(screenshotPath+"societyNameAuto.jpg");
			}
			return societyNameAuto;

		}
	
	

	// xpath/locator of continue button
	public static WebElement getContinueButton() {
		try {
			continueButton = driver.findElement(By.xpath("//button[.='Continue']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of continueButton is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"continueButton.jpg");
		}
		return continueButton;

	}

}
