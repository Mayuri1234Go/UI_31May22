package com.yesbank.qa.testscases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.yesbank.qa.base.TestBase;
import com.yesbank.qa.pages.HomePage;
import com.yesbank.qa.pages.LoginPage;
import com.yesbank.qa.pages.UserManagementPage;
import com.yesbank.qa.util.ReadTest;

import screenRecorder.MyScreenRecorder;

public class UserManagementTestApchePoi extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	UserManagementPage userManagementPage;
	
	public UserManagementTestApchePoi() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		
		initialization();
		loginPage=new LoginPage(driver);
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	
	@Test(priority=1)
	public void TC_CIF_001() throws Exception
	{
		MyScreenRecorder.startRecording("TC_CIF_001");

		String path=prop.getProperty("testDataPath");
		File file = new File(path);
		FileInputStream inputStream = new FileInputStream(file);
		ZipSecureFile.setMinInflateRatio(-1.0d);
		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
		Properties dataRow = ReadTest.readData(workbook, "CIF_Page", "TC_CIF_001", "CIF");

		homePage=new HomePage(driver);
		homePage.clickAdminTab();
		Assert.assertTrue(homePage.verifyUsernameLabel());
		userManagementPage=new UserManagementPage(driver);		
		userManagementPage.addUserNew(dataRow);
		MyScreenRecorder.stopRecording();

	}
	
	
	@Test(priority=2)
	public void TC_CIF_002() throws Exception
	{
		MyScreenRecorder.startRecording("TC_CIF_002");

		String path=prop.getProperty("testDataPath");
		File file = new File(path);
		FileInputStream inputStream = new FileInputStream(file);
		ZipSecureFile.setMinInflateRatio(-1.0d);
		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
		Properties dataRow = ReadTest.readData(workbook, "CIF_Page", "TC_CIF_002", "CIF");

		homePage=new HomePage(driver);
		homePage.clickAdminTab();
		Assert.assertTrue(homePage.verifyUsernameLabel());
		userManagementPage=new UserManagementPage(driver);		
		userManagementPage.addUserNew(dataRow);
		MyScreenRecorder.stopRecording();

	}
	
	
	@Test(priority=3)
	public void TC_CASA_003() throws Exception
	{
		MyScreenRecorder.startRecording("TC_CASA_003");

		String path=prop.getProperty("testDataPath");
		File file = new File(path);
		FileInputStream inputStream = new FileInputStream(file);
		ZipSecureFile.setMinInflateRatio(-1.0d);

		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
		Properties dataRow = ReadTest.readData(workbook, "CASA_Page", "TC_CASA_003", "CASA");

		homePage=new HomePage(driver);
		homePage.clickAdminTab();
		Assert.assertTrue(homePage.verifyUsernameLabel());
		userManagementPage=new UserManagementPage(driver);		
		userManagementPage.addUserNew(dataRow);
		MyScreenRecorder.stopRecording();

	}
	@Test(priority=4)
	public void TC_CASA_004() throws Exception
	{
		MyScreenRecorder.startRecording("TC_CASA_004");

		String path=prop.getProperty("testDataPath");
		File file = new File(path);
		FileInputStream inputStream = new FileInputStream(file);
		ZipSecureFile.setMinInflateRatio(-1.0d);
		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);

		Properties dataRow = ReadTest.readData(workbook, "CASA_Page", "TC_CASA_004", "CASA");

		homePage=new HomePage(driver);
		homePage.clickAdminTab();
		Assert.assertTrue(homePage.verifyUsernameLabel());
		userManagementPage=new UserManagementPage(driver);		
		userManagementPage.addUserNew(dataRow);
		MyScreenRecorder.stopRecording();

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		Reporter.log("Close Browser");
	}

	
	

}
