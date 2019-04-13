package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class Signup_Page extends PreCondition{
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";
	
	static WebElement firstName;
	static WebElement lastName;
	static WebElement email;
	static WebElement password;
	static WebElement mobileNo;
	static WebElement register;

	// xpath/locator of first name field
	public static WebElement getFirstName() {
		try {
			firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		} catch (Exception e){
			System.out.println("XPath/Locator of firstname field is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"firstName.jpg");
		}
		return firstName;

	}
	
	// xpath/locator of last name field
		public static WebElement getLastName() {
			try {
				lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
			} catch (Exception e) {
				System.out.println("XPath/Locator of lastname field is not correct");
				methods.Generic_Methods
						.getScreenshot(screenshotPath+"lastName.jpg");
			}
			return lastName;

		}
		
		// xpath/locator of email field
		public static WebElement getEmail() {
			try {
				email = driver.findElement(By.xpath("//input[@name='email']"));
			} catch (Exception e) {
				System.out.println("XPath/Locator of email field is not correct");
				methods.Generic_Methods
						.getScreenshot(screenshotPath+"email.jpg");
			}
			return email;

		}
		
		// xpath/locator of password field
		public static WebElement getPassword() {
			try {
				password = driver.findElement(By.xpath("//input[@name='password']"));
			} catch (Exception e) {
				System.out.println("XPath/Locator of password field is not correct");
				methods.Generic_Methods
						.getScreenshot(screenshotPath+"password.jpg");
			}
			return password;

		}
		
		// xpath/locator of mobile field
		public static WebElement getMobileNo() {
			try {
				mobileNo = driver.findElement(By.xpath("//input[@name='mobile']"));
			} catch (Exception e) {
				System.out.println("XPath/Locator of mobile no field is not correct");
				methods.Generic_Methods
						.getScreenshot(screenshotPath+"mobileNo.jpg");
			}
			return mobileNo;

		}
		
		// xpath/locator of register button
		public static WebElement getRegister() {
			try {
				register = driver.findElement(By.xpath("//input[@type='submit']"));
			} catch (Exception e) {
				System.out.println("XPath/Locator of register button is not correct");
				methods.Generic_Methods
						.getScreenshot(screenshotPath+"register.jpg");
			}
			return register;

		}

}
