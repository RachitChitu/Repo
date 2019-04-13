package utilities;

import org.testng.Assert;

import methods.PreCondition;

public class Assertion extends PreCondition {

	static String screenshotPath = "C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";

	// verify home page URL
	public static void verifyHomePage(String url, String city) {
		try {
			String homePageUrl = url + "/" + city.toLowerCase();
			System.out.println("Home Page URl is :" + homePageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), homePageUrl);
		} catch (Exception e) {
			System.out.println("Something went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "verifyHomePage.jpg");
		}
	}

	// verify bakerylisting page URL
	public static void verifyBakeryListingPage(String url, String city, String location) {
		try {
			String bakeryListingPageUrl = url + "/" + city.toLowerCase() + "/"
					+ (location.toLowerCase()).replace(" ", "-") + "-bakeries";
			System.out.println("Bakery listing page url is : " + bakeryListingPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), bakeryListingPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "verifyBakeryListingPage.jpg");
		}
	}

	// verify bakery product listing page URL
	public static void verifyBakeryProductListingPage(String url, String city, String location, String bakeryName) {
		try {
			String bakeryProductListingPageUrl = url + "/" + city.toLowerCase() + "/"
					+ (bakeryName.toLowerCase()).replace(" ", "-") + "?store="
					+ (location.toLowerCase()).replace(" ", "-");
			System.out.println("Bakery product listing page url is :" + bakeryProductListingPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), bakeryProductListingPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryProductListingPageUrl.jpg");
		}
	}

	// verify bakery product listing page all URL
	public static void verifyBakeryProductListingPageAll(String bakeryProductListingPageUrl) {
		try {
			System.out.println("Bakery product listing page url is :" + bakeryProductListingPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), bakeryProductListingPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryProductListingPageUrl.jpg");
		}
	}

	// verify product listing page URL for standalone bakery
	public static void verifyBakeryProductListingPageStandalone(String url, String city, String location,
			String bakeryName) {
		try {
			String bakeryProductListingPageUrlStandalone = url + "/" + city.toLowerCase() + "/"
					+ (bakeryName.toLowerCase()).replace(" ", "-") + "-" + (location.toLowerCase()).replace(" ", "-");
			System.out.println("Bakery product listing page url is :" + bakeryProductListingPageUrlStandalone);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), bakeryProductListingPageUrlStandalone);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryProductListingPageUrlStandalone.jpg");
		}
	}

	// verify product listing page URL
	public static void verifyProductListingPage(String url, String city, String location) {
		try {
			String city1 = StringManipulation.camelCase(city);
			String location1 = StringManipulation.camelCase(location);
			String productListingPageUrl = url + "/" + city1 + "/cakes?area=" + location1.replace(" ", "-");
			System.out.println("Product listing page url is :" + productListingPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), productListingPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "productListingPageUrl.jpg");
		}
	}

	// verify cake category page URL
	public static void verifyCakeCategoryPage(String url, String city, String location, String cakeCategory) {
		String cakecategoryPageUrl = null;
		try {
			String city1 = StringManipulation.camelCase(city);
			String location1 = StringManipulation.camelCase(location);
			if (cakeCategory.equalsIgnoreCase("Best Seller")) {
				cakecategoryPageUrl = url + "/" + city1 + "/" + (cakeCategory.toLowerCase()).replace(" ", "-")
						+ "?area=" + location1.replace(" ", "-");
			}
			if (cakeCategory.equalsIgnoreCase("Flower + Cakes")) {
				cakecategoryPageUrl = url + "/" + city1 + "/flower-cakes?area=" + location1.replace(" ", "-");
			}
			if (cakeCategory.equalsIgnoreCase("Photo Cakes")) {
				cakecategoryPageUrl = url + "/" + city1 + "/photo-cake?area=" + location1.replace(" ", "-");
			}
			if (cakeCategory.equalsIgnoreCase("Ice Cream Cakes")) {
				cakecategoryPageUrl = url + "/" + city1 + "/ice-cream-cake?area=" + location1.replace(" ", "-");
			}
			if (cakeCategory.equalsIgnoreCase("Immediate Delivery")) {
				cakecategoryPageUrl = url + "/" + city1 + "/" + (cakeCategory.toLowerCase()).replace(" ", "-")
						+ "?area=" + location1.replace(" ", "-");
			}
			if (cakeCategory.equalsIgnoreCase("Kids Cakes")) {
				cakecategoryPageUrl = url + "/" + city1 + "/kids-special?area=" + location1.replace(" ", "-");
			}
			if (cakeCategory.equalsIgnoreCase("Heart Shape Cakes")) {
				cakecategoryPageUrl = url + "/" + city1 + "/heart-shape-cake?area=" + location1.replace(" ", "-");
			}
			if (cakeCategory.equalsIgnoreCase("Premium Cakes")) {
				cakecategoryPageUrl = url + "/" + city1 + "/" + (cakeCategory.toLowerCase()).replace(" ", "-")
						+ "?area=" + location1.replace(" ", "-");
			}
			System.out.println("Cake catgeory filtered page url is : " + cakecategoryPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), cakecategoryPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "cakecategoryPageUrl.jpg");
		}
	}

	// verify bakery filter page URL
	public static void verifyBakeryFilterPage(String url, String city, String location, String bakeryFilter) {
		String bakeryFilterPageUrl = null;
		try {
			String baseBakeryFilterPageUrl = url + "/" + city.toLowerCase() + "/"
					+ (location.toLowerCase()).replace(" ", "-") + "-bakeries?";
			if (bakeryFilter.equals("Home Baker")) {
				bakeryFilterPageUrl = baseBakeryFilterPageUrl + "bakery_type=3&";
			}
			if (bakeryFilter.equals("Add Ons")) {
				bakeryFilterPageUrl = baseBakeryFilterPageUrl + "category_id=3&";
			}
			if (bakeryFilter.equals("2 hour Delivery")) {
				bakeryFilterPageUrl = baseBakeryFilterPageUrl + "advance_order_intimation=0-2&";
			}
			if (bakeryFilter.equals("Late Night Delivery")) {
				bakeryFilterPageUrl = baseBakeryFilterPageUrl + "late_night_delivery=11-2&";
			}
			if (bakeryFilter.equals("Offers")) {
				bakeryFilterPageUrl = baseBakeryFilterPageUrl + "offers=1&";
			}
			System.out.println("Bakery filtered page url is : " + bakeryFilterPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), bakeryFilterPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryFilterPageUrl.jpg");
		}
	}

	// verify cake filter page URL
	public static void verifyCakeFilterPage(String url, String city, String location, String cakeFilter) {
		String cakeFilterPageUrl = null;
		try {
			String city1 = StringManipulation.camelCase(city);
			String location1 = StringManipulation.camelCase(location);
			String baseCakeFilterPageUrl = url + "/" + city1 + "/cakes?area=" + location1.replace(" ", "-") + "&";
			if (cakeFilter.equals("Offers")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "offer=1";
			}
			if (cakeFilter.equals("Delivery Available")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "delivery=1";
			}
			if (cakeFilter.equals("Price_0to500")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "price=0-500";
			}
			if (cakeFilter.equals("Price_5000to1000")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "price=500-1000";
			}
			if (cakeFilter.equals("Price_1000to1500")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "price=1000-1500";
			}
			if (cakeFilter.equals("Price_1500to2000")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "price=1500-2000";
			}
			if (cakeFilter.equals("Price_MoreThan2000")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "price=2000-999999999";
			}
			if (cakeFilter.equals("Ingredients_Egg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_ingredients=8";
			}
			if (cakeFilter.equals("Ingredients_Eggless")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_ingredients=9";
			}
			if (cakeFilter.equals("Weight_Half_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=13";
			}
			if (cakeFilter.equals("Weight_One_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=14";
			}
			if (cakeFilter.equals("Weight_One_and_half_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=15";
			}
			if (cakeFilter.equals("Weight_Two_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=16";
			}
			if (cakeFilter.equals("Weight_Two_and_half_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=17";
			}
			if (cakeFilter.equals("Weight_Three_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=19";
			}
			if (cakeFilter.equals("Weight_Three_and_half_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=21";
			}
			if (cakeFilter.equals("Weight_Four_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=22";
			}
			if (cakeFilter.equals("Weight_Four_and_half_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=23";
			}
			if (cakeFilter.equals("Weight_Five_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=24";
			}
			if (cakeFilter.equals("Weight_Six_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=54";
			}
			if (cakeFilter.equals("Weight_Seven_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=29";
			}
			if (cakeFilter.equals("Weight_Eight_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=55";
			}
			if (cakeFilter.equals("Weight_Nine_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=56";
			}
			if (cakeFilter.equals("Weight_Ten_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=57";
			}
			if (cakeFilter.equals("Weight_Eleven_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=88";
			}
			if (cakeFilter.equals("Weight_One_Fourth_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=135";
			}
			if (cakeFilter.equals("Weight_65Percent_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=146";
			}
			if (cakeFilter.equals("Weight_30Percent_Kg")) {
				cakeFilterPageUrl = baseCakeFilterPageUrl + "cake_weight=169";
			}
			System.out.println("Cake filtered page url is : " + cakeFilterPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), cakeFilterPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "cakeFilterPageUrl.jpg");
		}
	}

	// verify PDP page URL
	public static String verifyPdpPage(String url, String city, String location) {
		String pdpPageUrl = null;
		try {
			pdpPageUrl = url + "/" + city.toLowerCase() + "/"
					+ (repository.Product_Description_Page.getProductName().toLowerCase()).replace(" ", "-") + "-"
					+ (repository.Product_Description_Page.getBakeryName().toLowerCase()).replace(" ", "-") + "?store="
					+ (location.toLowerCase()).replace(" ", "-");
			System.out.println("PDP page url is :" + pdpPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), pdpPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "pdpPageUrl.jpg");
		}
		return pdpPageUrl;
	}

	// verify PDP page URL for standalone bakery
	public static String verifyPdpPageStandalone(String url, String city, String location) {
		String pdpPageUrlStandalone = null;
		try {
			pdpPageUrlStandalone = url + "/" + city.toLowerCase() + "/"
					+ (repository.Product_Description_Page.getProductName().toLowerCase()).replace(" ", "-") + "-"
					+ (repository.Product_Description_Page.getBakeryName().toLowerCase()).replace(" ", "-") + "-"
					+ (location.toLowerCase()).replace(" ", "-");
			System.out.println("PDP page url is :" + pdpPageUrlStandalone);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), pdpPageUrlStandalone);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "pdpPageUrlStandalone.jpg");
		}
		return pdpPageUrlStandalone;
	}

	// verify PDP page URL
	public static String verifyPdpPage(String url, String city, String location, String productName,
			String bakeryName) {
		String pdpPageUrl = null;
		try {
			pdpPageUrl = url + "/" + city.toLowerCase() + "/" + (productName.toLowerCase()).replace(" ", "-") + "-"
					+ (bakeryName.toLowerCase()).replace(" ", "-") + "?store="
					+ (location.toLowerCase()).replace(" ", "-");
			System.out.println("PDP page url is :" + pdpPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), pdpPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "pdpPageUrl.jpg");
		}
		return pdpPageUrl;
	}

	// verify PDP page All URL
	public static String verifyPdpPageAll(String allUrl, String city, String productName, String bakeryName) {
		String pdpPageAllUrl = null;
		String url = allUrl.split("/pune")[0];
		try {
			pdpPageAllUrl = url + "/" + city.toLowerCase() + "/" + (productName.toLowerCase()).replace(" ", "-") + "-"
					+ (bakeryName.toLowerCase()).replace(" ", "-") + "?store=all-" + city.toLowerCase();
			System.out.println("PDP page all url is :" + pdpPageAllUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), pdpPageAllUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "pdpPageAllUrl.jpg");
		}
		return pdpPageAllUrl;
	}

	// verify billing page URL
	public static void verifyBillingPage(String pdpPageUrl) {
		try {
			String billingPageUrl = pdpPageUrl + "&page=billing";
			System.out.println("Billing page url is :" + billingPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), billingPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "billingPageUrl.jpg");
		}
	}

	// verify billing page URL for standalone bakery
	public static void verifyBillingPageStandalone(String pdpPageUrl) {
		try {
			String billingPageUrlStandalone = pdpPageUrl + "?page=billing";
			System.out.println("Billing page standalone bakery url is :" + billingPageUrlStandalone);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), billingPageUrlStandalone);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "billingPageUrlStandalone.jpg");
		}
	}

	// verify checkout page URL
	public static void verifyCheckOutPage(String pdpPageUrl, String deliveryType) {
		try {
			String checkOutPageUrl = pdpPageUrl + "&oType=" + deliveryType.toLowerCase() + "&page=checkout";
			System.out.println("Checkout page url is :" + checkOutPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), checkOutPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "checkOutPageUrl.jpg");
		}
	}

	// verify checkout page URL
	public static void verifyCheckOutPageStandalone(String pdpPageUrl, String deliveryType) {
		try {
			String checkOutPageUrlStandalone = pdpPageUrl + "?oType=" + deliveryType.toLowerCase() + "&page=checkout";
			System.out.println("Checkout page url is :" + checkOutPageUrlStandalone);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), checkOutPageUrlStandalone);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "checkOutPageUrlStandalone.jpg");
		}
	}

	// verify addons page URL
	public static void verifyAddOnsPage(String pdpPageUrl, String deliveryType) {
		try {
			String addOnsPageUrl = pdpPageUrl + "&page=addons";
			System.out.println("AddOns page url is :" + addOnsPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), addOnsPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "addOnsPageUrl.jpg");
		}
	}

	// verify account page URL
	public static void verifyAccountPageUrl(String url) {
		try {
			String accountPageUrl = url + "/account";
			System.out.println("Account page url is :" + accountPageUrl);
			Assert.assertEquals(methods.PreCondition.driver.getCurrentUrl(), accountPageUrl);
		} catch (Exception e) {
			System.out.println("Some went wrong..URL didn't match");
			methods.Generic_Methods.getScreenshot(screenshotPath + "accountPageUrl.jpg");
		}
	}

}
