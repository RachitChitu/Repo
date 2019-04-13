package methods;

import repository.Login_Page;

public class LoginPage extends Login_Page {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";

	// logged into account
	public static void login(String userName, String password) {
		try {
			methods.Generic_Methods.threadSleep(2000);
			repository.Login_Page.getLoginUserName().sendKeys(userName);
			repository.Login_Page.getLoginPassword().sendKeys(password);
			repository.Login_Page.getLoginSubmit().click();
			methods.Generic_Methods.threadSleep(2000);
			methods.Generic_Methods.waitForElement(repository.Login_Page.getOkButton());
			repository.Login_Page.getOkButton().click();
		} catch (Exception e) {
			System.out.println("Not able to logged in");
			methods.Generic_Methods.getScreenshot(screenshotPath+"login.jpg");
			methods.PreCondition.closeBrowser();

		}
	}

}
