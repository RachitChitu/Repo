package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import utilities.EventHandler;

public class PreCondition {

	static String screenshotPath = "C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\";

	public static WebDriver eventHandle;
	public static EventFiringWebDriver driver;
	public static EventHandler eCapture;

	// open browser
	public static void openBrowser(String xlsPath, String sheetName, String browserType, String url) {
		try {
			if (browserType.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\Drivers\\chromedriver.exe");
				eventHandle = new ChromeDriver();
				driver = new EventFiringWebDriver(eventHandle); 
				eCapture = new EventHandler();
				driver.register(eCapture);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
				driver.get(url);
			} else {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\Drivers\\geckodriver.exe");
				eventHandle = new FirefoxDriver();
				driver = new EventFiringWebDriver(eventHandle); 
				eCapture = new EventHandler();
				driver.register(eCapture);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
				driver.get(url);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some issue occured while opening the browser");
			methods.Generic_Methods.getScreenshot(screenshotPath + "openBrowser.jpg");
		}

	}

	// close all open instances of browser
	public static void closeBrowser() {
		try {
			driver.unregister(eCapture);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Issue in closing the browser");
			e.printStackTrace();
			methods.Generic_Methods.getScreenshot(screenshotPath + "closeBrowser.jpg");
		}
	}

	/*// open browser in mobile mode
	public static void openMobileBrowser(String xlsPath, String sheetName, String browserType, String url) {
		try {
			if (browserType.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\Drivers\\chromedriver.exe");
				Map<String, String> mobileEmulation = new HashMap<>();
				mobileEmulation.put("deviceName", "Nexus 5");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
				driver = new ChromeDriver(chromeOptions);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
				driver.get(url);
			} else {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Guest User\\eclipseworkspace\\BAKEWAY_WEBSITE\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
				driver.get(url);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some issue occured while opening the browser");
			methods.Generic_Methods.getScreenshot(screenshotPath + "openMobileBrowser.jpg");
		}

	}*/

}
