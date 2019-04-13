package methods;

import repository.Cake_Category_Filter;

public class CakeCategoryFilter extends Cake_Category_Filter {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";

	//select cake category
	public static void selectCakeCategory(String category) {
		try {
			if (category.equalsIgnoreCase("Best Seller")) {
				repository.Cake_Category_Filter.getCakeCategoryBestSeller().click();
			} else if (category.equalsIgnoreCase("Flower + Cakes")) {
				repository.Cake_Category_Filter.getCakeCategoryFlowerandCakes().click();
			} else if (category.equalsIgnoreCase("Photo Cakes")) {
				repository.Cake_Category_Filter.getCakeCategoryPhotoCakes().click();
			}else if (category.equalsIgnoreCase("Ice Cream Cakes")) {
				repository.Cake_Category_Filter.getCakeCategoryPhotoCakes().click();
			} else if (category.equalsIgnoreCase("Immediate Delivery")) {
				repository.Cake_Category_Filter.getCakeCategoryImmediateDelivery().click();
			} else if (category.equalsIgnoreCase("Kids Cakes")) {
				repository.Cake_Category_Filter.getCakeCategoryKidsCakes().click();
			} else if (category.equalsIgnoreCase("Heart Shape Cakes")) {
				repository.Cake_Category_Filter.getCakeCategoryHeartShapeCakes().click();
			} else if (category.equalsIgnoreCase("Premium Cakes")) {
				repository.Cake_Category_Filter.getCakeCategoryPremiumCakes().click();
			}
		} catch (Exception e) {
			System.out.println("Issue while selecting cake category");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"selectCakeCategory.jpg");
			methods.PreCondition.closeBrowser();
		}

	}

	//select cake filter
	public static void selectCakeFilter(String filter) {
		try {
			if (filter.equalsIgnoreCase("Offers")) {
				repository.Cake_Category_Filter.getCakeFiltersOffers().click();
			} else if (filter.equalsIgnoreCase("Delivery Available")) {
				repository.Cake_Category_Filter.getCakeFiltersDeliveryAvailable().click();
			} else if (filter.equalsIgnoreCase("Price_0to500")) {
				repository.Cake_Category_Filter.getCakeFiltersPrice0to500().click();
			} else if (filter.equalsIgnoreCase("Price_500to1000")) {
				repository.Cake_Category_Filter.getCakeFiltersPrice500to1000().click();
			} else if (filter.equalsIgnoreCase("Price_1000to1500")) {
				repository.Cake_Category_Filter.getCakeFiltersPrice1000to1500().click();
			} else if (filter.equalsIgnoreCase("Price_1500to2000")) {
				// methods.Generic_Methods.scrollIntoView();
				repository.Cake_Category_Filter.getCakeFiltersPrice1500to2000().click();
			} else if (filter.equalsIgnoreCase("Price_MoreThan2000")) {
				repository.Cake_Category_Filter.getCakeFiltersPriceMoreThan2000().click();
			} else if (filter.equalsIgnoreCase("Ingredients_Egg")) {
				repository.Cake_Category_Filter.getCakeFiltersIngredientsEgg().click();
			} else if (filter.equalsIgnoreCase("Ingredients_Eggless")) {
				repository.Cake_Category_Filter.getCakeFiltersIngredientsEggless().click();
			} else if (filter.equalsIgnoreCase("Weight_Half_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightHalfKg().click();
			} else if (filter.equalsIgnoreCase("Weight_One_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightOneKg().click();
			} else if (filter.equalsIgnoreCase("Weight_One_and_half_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightOneAndHalfKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Two_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightTwoKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Two_and_half_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightTwoAndHalfKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Three_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightThreeKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Three_and_half_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightThreeAndHalfKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Four_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightFourKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Four_and_half_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightFourAndHalfKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Five_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightFiveKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Six_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightSixKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Seven_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightSevenKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Eight_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightEightKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Nine_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightNineKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Ten_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightTenKg().click();
			} else if (filter.equalsIgnoreCase("Weight_Eleven_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightElevenKg().click();
			} else if (filter.equalsIgnoreCase("Weight_One_Fourth_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeightOneFourthKg().click();
			} else if (filter.equalsIgnoreCase("Weight_65Percent_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeight65PercentKg().click();
			} else if (filter.equalsIgnoreCase("Weight_30Percent_Kg")) {
				repository.Cake_Category_Filter.getCakeFiltersWeight30PercentKg().click();
			}
		} catch (Exception e) {
			System.out.println("Issue while selecting cake filter");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"selectCakeFilter.jpg");
			methods.PreCondition.closeBrowser();
		}

	}

}
