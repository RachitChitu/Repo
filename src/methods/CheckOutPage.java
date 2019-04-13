package methods;

import repository.CheckOut_Page;

public class CheckOutPage extends CheckOut_Page {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";

	// apply coupon on checkout page
	public static void applyCoupon(String couponCode) {
		try {
			repository.CheckOut_Page.getCouponCodeTextBox().sendKeys(couponCode);
			repository.CheckOut_Page.getApplyButton().click();
		} catch (Exception e) {
			System.out.println("Issue an applying coupon");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"applyCoupon.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// select payment mode
	public static void selectPaymentMode(String paymentMode) {
		try {
			if (paymentMode.equalsIgnoreCase("Card")) {
				repository.CheckOut_Page.getCard().click();
			} else if (paymentMode.equalsIgnoreCase("PayTm")) {
				repository.CheckOut_Page.getPaytm().click();
			} else if (paymentMode.equalsIgnoreCase("Net Banking")) {
				repository.CheckOut_Page.getNetBanking().click();
			} else if (paymentMode.equalsIgnoreCase("Wallet")) {
				repository.CheckOut_Page.getWallet().click();
			} else if (paymentMode.equalsIgnoreCase("UPI")) {
				repository.CheckOut_Page.getUpi().click();
			}
		} catch (Exception e) {
			System.out.println("Issue in selecting the payment mode");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"selectPaymentMode.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

	// proceed to payment
	public static void confirmOrder() {
		try {
			repository.CheckOut_Page.getProceedPayment().click();
		} catch (Exception e) {
			System.out.println("Issue while clicking proceed to payment button");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"confirmOrder.jpg");
			methods.PreCondition.closeBrowser();
		}
	}

}
