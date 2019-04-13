package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import methods.PreCondition;

public class Cake_Category_Filter extends PreCondition {

	static String screenshotPath = "C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Repository\\";

	static WebElement bestSeller, flowerAndCakes, photoCakes, iceCreamCakes, immediateDelivery, kidsCakes, heartShapeCakes,
			premiumCakes;
	static WebElement offers, deliveryAvailable, price_0to500, price_500to1000, price_1000to1500, price_1500to2000,
			price_MoreThan2000;
	static WebElement ingredients_Egg, ingredients_Eggless;
	static WebElement weight_Half_Kg, weight_One_Kg, weight_One_And_Half_Kg, weight_Two_Kg, weight_Two_And_Half_Kg,
			weight_Three_Kg, weight_Three_And_Half_Kg;
	static WebElement weight_Four_Kg, weight_Four_And_Half_Kg, weight_Five_Kg, weight_Five_And_Half_Kg, weight_Six_Kg,
			weight_Seven_Kg, weight_Eight_Kg, weight_Nine_Kg, weight_Ten_Kg;
	static WebElement weight_Eleven_Kg, weight_One_Fourth_Kg, weight_65Percent_Kg, weight_30Percent_Kg;

	// xpath/locator of best seller cake category
	public static WebElement getCakeCategoryBestSeller() {
		try {
			bestSeller = driver.findElement(By.xpath("//a[.=' Best Seller']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery category for Best Seller is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryBycategoryBestSeller.jpg");
		}
		return bestSeller;
	}

	// xpath/locator of flower and cakes category
	public static WebElement getCakeCategoryFlowerandCakes() {
		try {
			flowerAndCakes = driver.findElement(By.xpath("//a[.=' Flower + Cakes']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery category for Flower+Cakes is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryBycategoryFlower+Cakes.jpg");
		}
		return flowerAndCakes;
	}

	// xpath/locator of photo cakes category
	public static WebElement getCakeCategoryPhotoCakes() {
		try {
			photoCakes = driver.findElement(By.xpath("//a[.=' Photo Cakes']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery category for PhotoCakes is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryBycategoryPhotoCakes.jpg");
		}
		return photoCakes;
	}

	// xpath/locator of immediate delivery cake category
	public static WebElement getCakeCategoryImmediateDelivery() {
		try {
			immediateDelivery = driver.findElement(By.xpath("//a[.=' Immediate Delivery']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for ImmediateDelivery is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryBycategoryImmediateDelivery.jpg");
		}
		return immediateDelivery;
	}

	// xpath/locator of ice cream cake category
	public static WebElement getCakeCategoryIceCreamCakes() {
		try {
			iceCreamCakes = driver.findElement(By.xpath("//a[.='  Ice Cream Cakes']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for  Ice Cream Cakes is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryBycategoryIceCreamCakes.jpg");
		}
		return iceCreamCakes;
	}

	// xpath/locator of kids cake category
	public static WebElement getCakeCategoryKidsCakes() {
		try {
			kidsCakes = driver.findElement(By.xpath("//a[.=' Kids Cakes']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery category for KidsCakes is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryBycategoryKidsCakes.jpg");
		}
		return kidsCakes;
	}

	// xpath/locator of heart shape cake category
	public static WebElement getCakeCategoryHeartShapeCakes() {
		try {
			heartShapeCakes = driver.findElement(By.xpath("//a[.=' Heart Shape Cakes']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery category for HeartShapeCakes is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryBycategoryHeartShapeCakes.jpg");
		}
		return heartShapeCakes;
	}

	// xpath/locator of premium cake category
	public static WebElement getCakeCategoryPremiumCakes() {
		try {
			premiumCakes = driver.findElement(By.xpath("//a[.=' Premium Cakes']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of bakery category for PremiumCakes is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "bakeryBycategoryPremiumCakes.jpg");
		}
		return premiumCakes;
	}

	// xpath/locator of offers filter
	public static WebElement getCakeFiltersOffers() {
		try {
			offers = driver.findElement(By.xpath("//li[text()='Offers']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Offers is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "cakefilterOffers.jpg");
		}
		return offers;
	}

	// xpath/locator of delivery available filter
	public static WebElement getCakeFiltersDeliveryAvailable() {
		try {
			deliveryAvailable = driver.findElement(By.xpath("//li[text()='Delivery Available']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for DeliveryAvailable is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "cakefilterDeliveryAvailable.jpg");
		}
		return deliveryAvailable;
	}

	// xpath/locator of price 0-500 filter
	public static WebElement getCakeFiltersPrice0to500() {
		try {
			price_0to500 = driver.findElement(By.xpath("//li[text()='0 - 500 Rs']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Price_0to500 is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "cakefilterPrice_0to500.jpg");
		}
		return price_0to500;
	}

	// xpath/locator of price 500-1000 filter
	public static WebElement getCakeFiltersPrice500to1000() {
		try {
			price_500to1000 = driver.findElement(By.xpath("//li[text()='500 - 1000 Rs']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Price_500to1000 is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "cakefilterPrice_500to1000.jpg");
		}
		return price_500to1000;
	}

	// xpath/locator of price 1000-1500 filter
	public static WebElement getCakeFiltersPrice1000to1500() {
		try {
			price_1000to1500 = driver.findElement(By.xpath("//li[text()='1000 - 1500 Rs']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Price_1000to1500 is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "cakefilterPrice_1000to1500.jpg");
		}
		return price_1000to1500;
	}

	// xpath/locator of price 1500-2000 filter
	public static WebElement getCakeFiltersPrice1500to2000() {
		try {
			price_1500to2000 = driver.findElement(By.xpath("//li[text()='1500 - 2000 Rs']"));
			// section[@class='container']/ul/li[4]/ul/li[4]
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Price_1500to2000 is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "cakefilterPrice_1500to2000.jpg");
		}
		return price_1500to2000;
	}

	// xpath/locator of price more than 2000 filter
	public static WebElement getCakeFiltersPriceMoreThan2000() {
		try {
			price_MoreThan2000 = driver.findElement(By.xpath("//li[text()='More than 2000 Rs']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for MoreThan2000 is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "cakefilterMoreThan2000.jpg");
		}
		return price_MoreThan2000;
	}

	// xpath/locator of egg cake filter
	public static WebElement getCakeFiltersIngredientsEgg() {
		try {
			ingredients_Egg = driver.findElement(By.xpath("//li[text()='Egg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Ingredients_Egg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "ingredients_Egg.jpg");
		}
		return ingredients_Egg;
	}

	// xpath/locator of eggless cake filter
	public static WebElement getCakeFiltersIngredientsEggless() {
		try {
			ingredients_Eggless = driver.findElement(By.xpath("//li[text()='Eggless']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Ingredients_Eggless is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "ingredients_Eggless.jpg");
		}
		return ingredients_Eggless;
	}

	// xpath/locator of half kg cake filter
	public static WebElement getCakeFiltersWeightHalfKg() {
		try {
			weight_Half_Kg = driver.findElement(By.xpath("//li[text()='0.5 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Half_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Half_Kg.jpg");
		}
		return weight_Half_Kg;
	}

	// xpath/locator of 1kg cake filter
	public static WebElement getCakeFiltersWeightOneKg() {
		try {
			weight_One_Kg = driver.findElement(By.xpath("//li[text()='1 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_One_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_One_Kg.jpg");
		}
		return weight_One_Kg;
	}

	// xpath/locator of 1.5kg cake filter
	public static WebElement getCakeFiltersWeightOneAndHalfKg() {
		try {
			weight_One_And_Half_Kg = driver.findElement(By.xpath("//li[text()='1.5 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_One_and_half_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_One_And_Half_Kg.jpg");
		}
		return weight_One_And_Half_Kg;
	}

	// xpath/locator of 2kg cake filter
	public static WebElement getCakeFiltersWeightTwoKg() {
		try {
			weight_Two_Kg = driver.findElement(By.xpath("//li[text()='2 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Two_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Two_Kg.jpg");
		}
		return weight_Two_Kg;
	}

	// xpath/locator of 2.5 kg cake filter
	public static WebElement getCakeFiltersWeightTwoAndHalfKg() {
		try {
			weight_Two_And_Half_Kg = driver.findElement(By.xpath("//li[text()='2.5 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Two_and_half_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Two_And_Half_Kg.jpg");
		}
		return weight_Two_And_Half_Kg;
	}

	// xpath/locator of 3kg cake filter
	public static WebElement getCakeFiltersWeightThreeKg() {
		try {
			weight_Three_Kg = driver.findElement(By.xpath("//li[text()='3 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Three_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Three_Kg.jpg");
		}
		return weight_Three_Kg;
	}

	// xpath/locator of 3.5 kg cake filter
	public static WebElement getCakeFiltersWeightThreeAndHalfKg() {
		try {
			weight_Three_And_Half_Kg = driver.findElement(By.xpath("//li[text()='3.5 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Three_and_half_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Three_And_Half_Kg.jpg");
		}
		return weight_Three_And_Half_Kg;
	}

	// xpath/locator of 4kg cake filter
	public static WebElement getCakeFiltersWeightFourKg() {
		try {
			weight_Four_Kg = driver.findElement(By.xpath("//li[text()='4 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Four_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Four_Kg.jpg");
		}
		return weight_Four_Kg;
	}

	// xpath/locator of 4.5 kg cake filter
	public static WebElement getCakeFiltersWeightFourAndHalfKg() {
		try {
			weight_Four_And_Half_Kg = driver.findElement(By.xpath("//li[text()='4.5 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Four_and_half_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Four_And_Half_Kg.jpg");
		}
		return weight_Four_And_Half_Kg;
	}

	// xpath/locator of 5kg cake filter
	public static WebElement getCakeFiltersWeightFiveKg() {
		try {
			weight_Five_Kg = driver.findElement(By.xpath("//li[text()='5 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Five_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Five_Kg.jpg");
		}
		return weight_Five_Kg;
	}

	// xpath/locator of 6kg cake filter
	public static WebElement getCakeFiltersWeightSixKg() {
		try {
			weight_Six_Kg = driver.findElement(By.xpath("//li[text()='6 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Four_and_half_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Six_Kg.jpg");
		}
		return weight_Six_Kg;
	}

	// xpath/locator of 7kg cake filter
	public static WebElement getCakeFiltersWeightSevenKg() {
		try {
			weight_Seven_Kg = driver.findElement(By.xpath("//li[text()='7 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Seven_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Seven_Kg.jpg");
		}
		return weight_Seven_Kg;
	}

	// xpath/locator of 8kg cake filter
	public static WebElement getCakeFiltersWeightEightKg() {
		try {
			weight_Eight_Kg = driver.findElement(By.xpath("//li[text()='8 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Eight_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Eight_Kg.jpg");
		}
		return weight_Eight_Kg;
	}

	// xpath/locator of 9kg cake filter
	public static WebElement getCakeFiltersWeightNineKg() {
		try {
			weight_Nine_Kg = driver.findElement(By.xpath("//li[text()='9 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Nine_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Nine_Kg.jpg");
		}
		return weight_Nine_Kg;
	}

	// xpath/locator of 10kg cake filter
	public static WebElement getCakeFiltersWeightTenKg() {
		try {
			weight_Ten_Kg = driver.findElement(By.xpath("//li[text()='10 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Ten_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Ten_Kg.jpg");
		}
		return weight_Ten_Kg;
	}

	// xpath/locator of 11kg cake filter
	public static WebElement getCakeFiltersWeightElevenKg() {
		try {
			weight_Eleven_Kg = driver.findElement(By.xpath("//li[text()='11 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_Eleven_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_Eleven_Kg.jpg");
		}
		return weight_Eleven_Kg;
	}

	// xpath/locator of .25kg cake filter
	public static WebElement getCakeFiltersWeightOneFourthKg() {
		try {
			weight_One_Fourth_Kg = driver.findElement(By.xpath("//li[text()='0.25 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_One_Fourth_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_One_Fourth_Kg.jpg");
		}
		return weight_One_Fourth_Kg;
	}

	// xpath/locator of .65kg cake filter
	public static WebElement getCakeFiltersWeight65PercentKg() {
		try {
			weight_65Percent_Kg = driver.findElement(By.xpath("//li[text()='0.65 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_65Percent_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_65Percent_Kg.jpg");
		}
		return weight_65Percent_Kg;
	}

	// xpath/locator of .30kg cake filter
	public static WebElement getCakeFiltersWeight30PercentKg() {
		try {
			weight_30Percent_Kg = driver.findElement(By.xpath("//li[text()='0.30 Kg']"));
		} catch (Exception e) {
			System.out.println("XPath/Locator of cake category for Weight_30Percent_Kg is not correct");
			methods.Generic_Methods.getScreenshot(screenshotPath + "weight_30Percent_Kg.jpg");
		}
		return weight_30Percent_Kg;
	}

}
