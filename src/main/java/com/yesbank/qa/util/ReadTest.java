package com.yesbank.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;


public class ReadTest {


	@SuppressWarnings("deprecation")
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
	}

}
