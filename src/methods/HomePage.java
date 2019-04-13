package methods;

import org.openqa.selenium.support.ui.Select;

import repository.Home_Page;

public class HomePage extends Home_Page {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";

	// select city from dropdown at home page
	public static void selectCity(String cityName) {
		try {
			Select city = new Select(repository.Home_Page.getCityDropdown());
			city.selectByValue(cityName);
		} catch (Exception e) {
			System.out.println("Not able to select city from dropdown");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"selectCity.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// type location in textbox
	public static void typeLocation(String locationName) {
		try {
			repository.Home_Page.getLocation().click();
			repository.Home_Page.getLocation2().sendKeys(locationName);
		} catch (Exception e) {
			System.out.println("Not able to type location in textbox");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"typeLocation.jpg");
			methods.PreCondition.closeBrowser();

		}
	}

	// select first option/location from suggestion dropdown
	public static void selectFirstAutoSuggestion() {
		try {
			//Actions act = new Actions(driver);
			//act.moveToElement(repository.Home_Page.getAutoComplete()).moveByOffset(0, -80).click().perform();
			repository.Home_Page.getAutoComplete().click();
		} catch (Exception e) {
			System.out.println("Not able to select first autosuggestion from dropdown");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"selectFirstAutoSuggestion.jpg");
			methods.PreCondition.closeBrowser();

		}
	}

}
