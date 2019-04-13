package methods;

import java.util.ArrayList;

import repository.Payment_Page;

public class PaymentPage extends Payment_Page {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";

	// fill card details
	public static void completeCardDetails() {
		try {
			driver.switchTo().frame(repository.Payment_Page.getRazorPayIframe());
			repository.Payment_Page.getOtpField().sendKeys("123456");
			methods.Generic_Methods.threadSleep(2000);
			repository.Payment_Page.getVerifyButton().click();
			methods.Generic_Methods.threadSleep(2000);
			repository.Payment_Page.getSavedCvv().sendKeys("123");
			methods.Generic_Methods.threadSleep(2000);
			repository.Payment_Page.getVerifyButton().click();
			switchRazorFrameComplete();
		} catch (Exception e) {
			System.out.println("Issue while filling card details");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"completeCardDetails.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// fill net banking details
	public static void completeNetBankingDetails() {
		try {
			driver.switchTo().frame(repository.Payment_Page.getRazorPayIframe());
			repository.Payment_Page.getKotakBank().click();
			methods.Generic_Methods.threadSleep(2000);
			repository.Payment_Page.getVerifyButton().click();
			switchRazorFrameComplete();
		} catch (Exception e) {
			System.out.println("Issue while filling net banking details");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"completeNetBankingDetails.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// fill card details
	public static void completeWalletDetails(String walletOption) {
		try {
			driver.switchTo().frame(repository.Payment_Page.getRazorPayIframe());
			if (walletOption.equalsIgnoreCase("PayZapp")) {
				repository.Payment_Page.getPayZapp().click();
				methods.Generic_Methods.threadSleep(2000);
				switchRazorFrameComplete();
			} else if (walletOption.equalsIgnoreCase("OlaMoney")) {
				repository.Payment_Page.getOlaMoney().click();
				methods.Generic_Methods.threadSleep(2000);
				repository.Payment_Page.getVerifyButton().click();
				methods.Generic_Methods.threadSleep(2000);
				repository.Payment_Page.getOtpField().sendKeys("123456");
			} else if (walletOption.equalsIgnoreCase("FreeCharge")) {
				repository.Payment_Page.getFreeCharge().click();
				methods.Generic_Methods.threadSleep(2000);
				repository.Payment_Page.getVerifyButton().click();
				methods.Generic_Methods.threadSleep(2000);
				repository.Payment_Page.getOtpField().sendKeys("1234");
			}
			repository.Payment_Page.getVerifyButton().click();
		} catch (Exception e) {
			System.out.println("Issue while filling wallet details");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"completeWalletDetails.jpg");
			methods.PreCondition.closeBrowser();
		}
	}
	
	//switch to new success page
	public static void switchRazorFrameComplete()
	{
		try {
			String currentWindow=methods.PreCondition.driver.getWindowHandle();
			ArrayList<String> tabs2 = new ArrayList<String> (methods.PreCondition.driver.getWindowHandles());
			System.out.println("Current Window :"+currentWindow);
			System.out.println("All Windows :"+tabs2);
			methods.PreCondition.driver.switchTo().window(tabs2.get(1));
			repository.Payment_Page.getSuccessButton().click();
		}
		catch (Exception e) {System.out.println("Issue while filling wallet details");
		methods.Generic_Methods.getScreenshot(
				screenshotPath+"switchRazorFrameComplete.jpg");
		methods.PreCondition.closeBrowser();
		}
		}
	}


