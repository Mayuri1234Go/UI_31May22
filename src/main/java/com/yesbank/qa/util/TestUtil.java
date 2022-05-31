package com.yesbank.qa.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.yesbank.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	public static String TESTDATA_SHEET_PATH="D://JavaPractice/UIYesbank/src/main/java/com/yesbank/qa/testdata/user.xlsx";

	static Workbook book;
	static Sheet sheet;

	public void switchToDefaultContent(){
		driver.switchTo().defaultContent();
	}

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}

	
	public static void takeScreenshotAtEndOfTest() throws IOException  
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

	}

//excel read data

	/*@SuppressWarnings("deprecation")
	public static Properties readData(XSSFWorkbook workbook, String sheetName, String testCaseName,String module) {	

		Properties prop = new Properties();
		try{
			XSSFSheet sheet=workbook.getSheet(sheetName);
			DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
			Row titleRow = sheet.getRow(0);

			for (int i = 1; i<sheet.getPhysicalNumberOfRows(); i++) {
				Row dataRow = sheet.getRow(i);
				String testCaseID = formatter.formatCellValue(dataRow.getCell(0));
				String moduleName=formatter.formatCellValue(dataRow.getCell(1));

				if (testCaseID.equalsIgnoreCase(testCaseName) && module.equalsIgnoreCase(moduleName)) {
					if(module.equalsIgnoreCase(moduleName)){		
						for (int j = 0; j<dataRow.getPhysicalNumberOfCells(); j++) {

							Cell cell =  dataRow.getCell(j); 

							try {

								switch (cell.getCellTypeEnum()) {
								case STRING:
								case FORMULA:	
								case BOOLEAN:
									cell.getRichStringCellValue().toString();
									prop.put(formatter.formatCellValue(titleRow.getCell(j)), cell.getStringCellValue());
									break;
								case NUMERIC:
								case BLANK:
									prop.put(formatter.formatCellValue(titleRow.getCell(j)), formatter.formatCellValue(dataRow.getCell(j)));
									break;

								default:
									break;	
								}							}
							catch(NullPointerException e) {
								prop.put(formatter.formatCellValue(titleRow.getCell(j)), "");
							}
						}
					}
				}
			}
		}catch (Exception e){
			Reporter.log(e.toString());
			return null;
		}

		return prop;
	}*/



}
