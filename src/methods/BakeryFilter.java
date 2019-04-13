package methods;

import repository.Bakery_Filter;

public class BakeryFilter extends Bakery_Filter {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\Methods\\";
	
	//select bakery filter
	public static void selectBakeryFilter(String filters) {
		try {
			if (filters.equalsIgnoreCase("Home Baker")) {
				repository.Bakery_Filter.getBakeryFiltersHomeBakers().click();
			} else if (filters.equalsIgnoreCase("Add Ons")) {
				repository.Bakery_Filter.getBakeryFiltersAddOns().click();
			} else if (filters.equalsIgnoreCase("2 hour Delivery")) {
				repository.Bakery_Filter.getBakeryFilters2HourDelivery().click();
			} else if (filters.equalsIgnoreCase("Late Night Delivery")) {
				repository.Bakery_Filter.getBakeryFiltersLateNightDelivery().click();
			} else if (filters.equalsIgnoreCase("Offers")) {
				repository.Bakery_Filter.getBakeryFiltersOffers().click();
			}
		} catch (Exception e) {

			System.out.println("Issue while selecting Bakery Filter");
			methods.Generic_Methods.getScreenshot(
					screenshotPath+"selectBakeryFilter.jpg");
			methods.PreCondition.closeBrowser();
		}
	}
}
