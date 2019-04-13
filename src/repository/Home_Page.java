package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class Home_Page extends PreCondition {

	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";
	
	static WebElement cityDropdown;
	static WebElement location;
	static WebElement location2;
	static WebElement autoComplete;
	static WebElement popularLocality;
	static WebElement login;
	static WebElement signup;

	// xpath of city selection dropdown
	public static WebElement getCityDropdown() {
		try {
			cityDropdown = driver.findElement(By.xpath("//select"));
		} catch (Exception e){
			System.out.println("XPath/Locator of city dropdown is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"cityDropdown.jpg");
		}
		return cityDropdown;

	}

	// xpath of location text box
	public static WebElement getLocation() {
		try {
			location = driver.findElement(By.xpath("//input[@type='text']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of location textbox is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"location.jpg");
		}

		return location;
	}

	// xpath of location textbox after clicking
	public static WebElement getLocation2() {
		try {
			location2 = driver.findElement(By.xpath("//input[@type='search']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of location textbox after clicking is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"location2.jpg");
		}

		return location2;
	}

	// xpath of auto-suggestion dropdown
	public static WebElement getAutoComplete() {
		try {
			//autoComplete = driver.findElement(By.xpath("//*[@id='PlacesAutocomplete__autocomplete-container']"));
			autoComplete = (WebElement) driver.findElements(By.xpath("//div[@class='itemContainer']")).get(0);

		} catch (Exception e) {
			System.out.println("XPath/Locator of autosuggestion dropdown is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"autoComplete.jpg");
		}

		return autoComplete;
	}

	// xpath of popular locality link
	public static WebElement getPopularLocality(String locality) {
		try {
			popularLocality = driver.findElement(By.xpath("//a[.='" + locality + "']"));

		} catch (Exception e) {
			System.out.println("XPath/Locator of popualar locality link is not correct");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"popularLocality.jpg");
		}

		return popularLocality;
	}

	// xpath/locator of login button
	public static WebElement getLogin() {
		try {
			login = driver.findElement(By.xpath("//a[.='Login']"));

		} catch (Exception e) {
			System.out.println("XPath/Locator of login button is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath+"login.jpg");
		}

		return login;
	}

	// xpath/locator of sign up button
	public static WebElement getSignup() {
		try {
			signup = driver.findElement(By.xpath("//a[.='Sign Up']"));

		} catch (Exception e) {
			System.out.println("XPath/Locator of sign up button is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath+"signup.jpg");
		}

		return signup;
	}

}
