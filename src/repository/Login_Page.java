package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class Login_Page extends PreCondition {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";
	
	static WebElement loginEmail;
	static WebElement loginPassword;
	static WebElement loginSubmit;
	static WebElement okButton;

	// xpath/locator of email text field
	public static WebElement getLoginUserName() {
		try {
			loginEmail = driver.findElement(By.xpath("//input[@name='username']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of email textfield is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"loginEmail.jpg");
		}
		return loginEmail;

	}

	// xpath/locator of password text field
	public static WebElement getLoginPassword() {
		try {
			loginPassword = driver.findElement(By.xpath("//input[@name='password']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of password textfield is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"loginPassword.jpg");
		}
		return loginPassword;

	}

	// xpath/locator of login submit button
	public static WebElement getLoginSubmit() {
		try {
			loginSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of login submit button is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"loginSubmit.jpg");
		}
		return loginSubmit;

	}

	//xpath/locator of ok button
	public static WebElement getOkButton() {
		try {
			okButton =driver.findElement(By.xpath("//*[@id='snackbar']/p/input"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of ok button is not correct");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"okButton.jpg");
		}
		return okButton;
	}

}
