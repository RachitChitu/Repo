package methods;

import repository.Signup_Page;

public class SignupPage extends Signup_Page {

	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";
	
	//register into bakeway
	public static void signUp(String firstName, String lastName, String emailId, String mobileNumber, String password) {
		try {
			repository.Signup_Page.getFirstName().sendKeys(firstName);
			repository.Signup_Page.getLastName().sendKeys(lastName);
			repository.Signup_Page.getEmail().sendKeys(emailId);
			repository.Signup_Page.getMobileNo().sendKeys(mobileNumber);
			repository.Signup_Page.getPassword().sendKeys(password);
			repository.Signup_Page.getRegister().click();
		} catch (Exception e) {
			System.out.println("Not able to register");
			methods.Generic_Methods.getScreenshot(screenshotPath+"signUp.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

}
