package methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic_Methods extends PreCondition {
	
	static String screenshotPath="C:\\Users\\Guest User\\Pictures\\Automation\\Exception\\";

	static ArrayList<String> list = new ArrayList<String>();
	static ArrayList<String> rowList = new ArrayList<String>();

	// take page screenshot
	public static void getScreenshot(String filePath) {
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		File srcFile = edriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(filePath));
			System.out.println("Screenshot Captured");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Issue in screenshot capture");
		}
	}

	// read data from excel
	public static String getCellValueFromExcel(String xlsPath, String sheetName, int rowNo, int colNo) {
		String value = null;
		try {
			FileInputStream fis = new FileInputStream(xlsPath);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
			value = sh.getRow(rowNo).getCell(colNo).getStringCellValue();
			System.out.println("value is : " + value);
			wb.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

	// read data from excel column wise
	public static ArrayList<String> getColumnValueFromExcel(String xlsPath, String sheetName, int colNo) {
		String value = null;
		list.clear();
		try {
			FileInputStream fis = new FileInputStream(xlsPath);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
			int rc = sh.getLastRowNum();
			System.out.println("No of rows present" + rc);
			for (int i = 1; i < rc + 1; i++) {
				value = sh.getRow(i).getCell(colNo).getStringCellValue();
				System.out.println("value is : " + value);
				list.add(value);
			}

			wb.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	// read data from excel row wise
	public static ArrayList<String> getRowValueFromExcel(String xlsPath, String sheetName, int rowNo) {
		String value = null;
		// rowList.clear();
		try {
			FileInputStream fis = new FileInputStream(xlsPath);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
			for (int i = 1; i < 6 + 1; i++) {
				value = sh.getRow(rowNo).getCell(i).getStringCellValue();
				// System.out.println("value is : " + value);
				rowList.add(value);
			}

			wb.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowList;

	}

	// read data from excel
	public static Object[][] getValueFromExcel(String xlsPath, String sheetName, int totalRows, int totalColumns) {
		Object[][] excelData = null;
		try {
			FileInputStream fis = new FileInputStream(xlsPath);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
			int rows = totalRows;
			int columns = totalColumns;
			excelData = new Object[rows][columns];
			for (int i = 1; i <= rows; i++) {
				for (int j = 0; j < columns; j++) {
					excelData[i - 1][j] = sh.getRow(i).getCell(j).getStringCellValue();
				}
			}
			wb.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return excelData;
	}

	// refresh page
	public static void refreshPage() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			System.out.println("Not able to refresh page");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"refreshPageException.jpg");
		}
	}

	// blind wait
	public static void threadSleep(long time) {
		try {
			System.out.println("Execution Sleeps");
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// wait for element to be clickable
	public static void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		System.out.println("WebDriver object created");
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	// page scroll
	public static void pageScroll(int pixel) {
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		try {
			jsx.executeScript("window.scrollBy(0," + pixel + ")", "");
		} catch (Exception e) {
			System.out.println("Not able to scroll page");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"pageScroll.jpg");
		}

	}

	// press page down key
	public static void keyboardKeyPageDownClick() {
		try {
			Actions keyPageDownClick = new Actions(driver);
			keyPageDownClick.sendKeys(Keys.PAGE_DOWN).perform();

		} catch (Exception e) {
			System.out.println("Not able to press down key");
			methods.Generic_Methods
					.getScreenshot(screenshotPath+"pageDownKey.jpg");
		}

	}

}
